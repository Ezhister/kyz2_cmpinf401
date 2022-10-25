import javax.swing.JOptionPane;
import java.util.Random;
import java.lang.Math;
public class Lab7 {

	public static void main(String[] args) {
		//Grab input
		int items=	Integer.parseInt(JOptionPane.showInputDialog("User how many items do you want?"));

		//Create an array of the correct size
		double[] data = new double[items];

		//FIll array with randomly generated values
		//Create random object
		Random rd = new Random(); 
		for (int i=0; i<data.length; i++) {
			//this stores random numbers in the array
			data[i] =rd.nextInt(10); 
			System.out.println(data[i]); //printing out each element to check
		}
		//calculate and print out max, min, sum, and average
		//declare the variables to return from methods
		double max_value,min_value,sum_value,ave_value;

		//Max
		max_value = max(data);
		System.out.println("The max value of the array is " + max_value);
		//Min
		min_value = min(data);
		System.out.println("The min value of the array is " + min_value);
		//Sum
		sum_value = sum(data);
		System.out.println("The sum of the array is " + sum_value);
		//Average
		ave_value = ave(data);
		System.out.println("The average of the array is " + ave_value);
	}



	//Method to return max value in array
	public static double max(double[] data) {
		double max=data[0];
		for (int i=0; i<data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}

		}

		return max;
	}

	//Method to return minimum value in array
	public static double min(double[] data) {
		double min=data[0];
		for (int i=0; i<data.length; i++) {
			if (data[i]< min) {
				min = data[i];
			}

		}

		return min;
	}
	//Method to sum items in array
	public static double sum(double [] data) {
		double sum=0;
		for (int i=0; i<data.length; i++) {
			sum = sum + data[i];
		}


		return sum;
	}
	//Method to take average of items in array
	public static double ave(double[] data) {
		double ave;
		double sum_value= sum(data);
		double items = data.length;
		ave = sum_value/items;
		return ave;

	}


}
