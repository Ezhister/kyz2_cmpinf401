import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {
//Currently the output stuff doesn't work.
	public static void main(String[] args) {
		String path = "data/output.txt"; //writing a file, we create this path
		
		try { //remember it's standard to use try catch with file reading
		FileWriter fw = new FileWriter(path);
		BufferedWriter bw= new BufferedWriter(fw);
		 bw.write("Hello, my name is Dmitriy");
		    bw.write("\n");
		    bw.write("This is an example of writing to text files");
		    bw.close();
		    fw.close();

	}catch (IOException e) {
		e.printStackTrace();
		
	}

}
}
