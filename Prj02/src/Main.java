
public class Main {
 
	public static void main(String[] args) {
		FilesFinder.FindFiles("D:\\work", ".mp3"); //Searching for files in the specified directory with the specified extension.
		PlayList.getSortedFilesList("D:\\file.html");//Creating the output file.
	}
}