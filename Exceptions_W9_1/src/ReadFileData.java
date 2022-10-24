import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFileData {

	public static void main(String[] args) {
		//Absolute path - full path to a file   //find in properties of the csv
      	String inputPath = "C:\\Users\\17174\\OneDrive - University of Pittsburgh\\Documents\\CMPINF 0401\\kyz2_cmpinf401\\Exceptions_W9_1\\src\\data\\input.csv";
		// Relative path - path to a file relative to the location of this Java class
		/*
		 -> ReadFileData.jav           //relative to readfiledata.java
		 ->-> data
		 ->->-> input.csv
		 */
		
		
		//String path = "data\\input.csv";   //use double \\ for windows, however it isn't working right now
		String outputPath = "data\\output.csv";
      	ArrayList<Data> data = new ArrayList<Data>(); 
	     try {
			FileReader fr = new FileReader(inputPath);
		    BufferedReader br = new BufferedReader(fr); 
		    
		    String line=null;
		    while ((line=br.readLine()) != null)
		    { //goes to end of file
		    //	System.out.println(line);
		    	
		    	//Split each line into a String array
		    	String[] temp = line.split(",");
		    	
		    	//Check to make sure all columns are present
		    	if(temp.length ==3) {
		    	//Store values in object properties
		    	Data d = new Data();
		    	d.setCol1(temp[0]);
		    	d.setCol2(Integer.parseInt(temp[1]));
		    	d.setCol3(temp[2]);
		    	
		    	//Store object in arrayList
		    	data.add(d);
		    	}
		    	else {
		    		System.out.println("one of the rows in your dataset is missing values"); //In case the data is messed up
		    	}
		    }
		    br.close();
	        fr.close();


		} catch (FileNotFoundException fnfe) { 
			fnfe.printStackTrace();
		} 
	     catch(IOException ioe) {   //general catch
	    	 ioe.printStackTrace();
	     }
	     //Make sure it worked
	     for(Data d: data)
	    	 System.out.println(d.getCol3());
	    	 
	     //Save to another file
	     
		try {
			FileWriter fw;
			fw = new FileWriter(outputPath);
			 BufferedWriter bw= new BufferedWriter(fw);
			 
			 for(Data d: data) {
				 String line = d.getCol1() + "," + d.getCol2() + "," + d.getCol3() + "\n";
				 bw.write(line);
			 }
			 
			 bw.close();
			 fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	    
	     
	}

}
