import java.io.File;
import java.util.ArrayList;
 
public class FilesFinder {
	
	private static ArrayList<File> files_list = new ArrayList<File>();
	
	public static ArrayList<File> getFilesList() { //List of files with the specified extension
		return files_list; 
   }
	
	public static void FindFiles(String path, String ext) { //Searching for files
		File dir = new File(path);
        File[] filenames = dir.listFiles();
        
        for (File directoryItem : filenames) { 
    	    if (directoryItem.isDirectory()) {
    	         getDirectoryFiles(directoryItem, ext) ; //Searching for files in subdirectory  	      
    		}
    	    
    		if (directoryItem.isFile()) {
    			 if (directoryItem.getName().endsWith(ext)) {  //Adding suitable files to our list   
    		     files_list.add(directoryItem);
    		  }
    	    }
       } 
	}
    
    public static void getDirectoryFiles(File dir, String ext) { //Method to search for files in subdirectory 
        for (File file : dir.listFiles()) {
            if (file.isFile()) {
            	if (file.getName().endsWith(ext)) {          	
            	files_list.add(file);               //Adding suitable files to our list 
              }
            }
            else
            	getDirectoryFiles(file, ext);
        }     
    }
}
