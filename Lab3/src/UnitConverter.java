import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		// Developing a simple metric/imperial system converter
		
		String Input;
		double actual_number;
		
		//get input from users
		//ASSUME the unit will be typed as well ex: 5 cm
Input= JOptionPane.showInputDialog("User, please input a distance or weight amount!");
//Find where space is at and the length of string
int lenDouble=Input.length();
int IofSpace = Input.indexOf(" ");

//Chop the string into just number and unit
String Number=Input.substring(0,IofSpace);
String Unit_taken=Input.substring(IofSpace+1,lenDouble);
//Get just the double
actual_number=Double.parseDouble(Number);

//Send the number and unit into the function and get a result for both the converted number and the converted unit

double number_converted = converter(actual_number,Unit_taken);
String Unit_converted = unit_converter(Unit_taken);

//Display the end message
JOptionPane.showMessageDialog(null, actual_number + " "+ Unit_taken +" = "+ number_converted + " "+ Unit_converted);
	}

	

	//1 inch = 2.54 cm   1 m = 1.094 yd  1 oz = 28.35 gm 1 kg= 2.205 lb
	
	//Function to convert the number 
	public static double converter(double Number, String Unit) {
		
		if (Unit.equalsIgnoreCase("cm")) {
			Number = Number / 2.54;
		}
		else if ((Unit.equalsIgnoreCase("in"))) {
			Number = Number * 2.54;
	
		}
		else if ((Unit.equalsIgnoreCase("yd"))) {
			Number = Number / 1.094 ;
			
		}
		
		else if ((Unit.equalsIgnoreCase("m"))) {
			Number = Number * 1.094;
			
		}
		else if ((Unit.equalsIgnoreCase("oz"))) {
			Number = Number * 28.35;
			
		}	
		else if ((Unit.equalsIgnoreCase("gm"))) {
			Number = Number / 28.35;
			
		}
		else if ((Unit.equalsIgnoreCase("kg"))) {
			Number = Number *2.205;
			
		}
		else if ((Unit.equalsIgnoreCase("lb"))) {
			Number = Number / 2.205;
			
		}
		
		return Number;
	}
	
	//Function to change the unit into the correct unit type

public static String unit_converter(String Unit) {
		
		if (Unit.equalsIgnoreCase("cm")) {
			Unit=("in");
		}
		else if ((Unit.equalsIgnoreCase("in"))) {
			Unit=("cm");
		}
		else if ((Unit.equalsIgnoreCase("yd"))) {
			Unit=("m");
		}
		
		else if ((Unit.equalsIgnoreCase("m"))) {
			Unit=("yd");
			
		}
		else if ((Unit.equalsIgnoreCase("oz"))) {
			Unit=("gm");
			
		}	
		else if ((Unit.equalsIgnoreCase("gm"))) {
			Unit=("oz");
			
		}
		else if ((Unit.equalsIgnoreCase("kg"))) {
			Unit=("lb");
			
		}
		else if ((Unit.equalsIgnoreCase("lb"))) {
			Unit=("kg");
			
		}
		
		return Unit;
	}


	}


