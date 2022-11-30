import java.io.File;
import java.util.ArrayList;

public class FileSystem {
	public static ArrayList<File> folderList = new ArrayList<File>(); 
	
	
	public static void main(String[] args) {
		File[] files = new File("C:\\").listFiles();
		listAllfiles(files);
	}
	public static void listAllfiles(File[] files) {
		ArrayList<File> fileList = new ArrayList<File>();
		for (File file : files) {
			if (file.isDirectory()) {  //checks if file is directory
				System.out.println("Directory: " + file.getName());
				folderList.add(file); //LET PROFESSOR THINK THROUGH THE LOGIC
				listAllfiles(file.listFiles());  // Calls same method again. Passing the directory 
			} else {
				System.out.println("File: " + file.getName()); //otherwise prints out file name
			}
		}
	}

}
