import java.io.FileWriter;
import java.io.IOException;

public class PlayList {

	public static void getSortedFilesList(String path) { //Returns sorted list of files with the specified extension
		 try(FileWriter writer = new FileWriter(path)) 
	        {
			 FilesFinder.getFilesList().stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(b ->{
				try {
					writer.write (b.getName()+" ("+b.getPath()+")");
					writer.append("<br>");
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
	       }
	        catch(IOException ex){ 
	            System.err.println(ex.getMessage());
	        } 			
   }
}
