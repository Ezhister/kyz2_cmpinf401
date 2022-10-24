import javax.swing.JOptionPane;

public class TestException {

	public static void main(String[] args) {

		String x = JOptionPane.showInputDialog("Please enter a value: ");
		double xNum =0;
		Test t;
		try {

			xNum=	Double.parseDouble(x);
			t = new Test();
		}
		catch(NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Please enter a numeric value."); //catches this specific exception
		}
		catch(Exception ex) {  //error assigned to ex variable
			JOptionPane.showInputDialog(null, "Please enter a numeric value"); //failsafe catches general exceptions
	//		ex.printStackTrace(); //prints error message
			
		}
		finally {
			t=null;
			
		}
		System.out.println(xNum);
	}
}/*
Test t;
boolean x = true;
if(x != true) {
	t= new Test();
}

System.out.println(t.testValue);        //error with initialization of test
	 */