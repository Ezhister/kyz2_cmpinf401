import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; //all swing components

//Eclipse MarketPlace in HELP section can help you find plug ins for anything!!!
//The window thing is in other, then window builder and 
public class TestUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello"); //hello as title
		frame.setLayout(null);
		frame.setBounds(10,10, 500 , 500);// x and y    500 pixels wide and 500 pixels high
	
		/*
		JPanel panel = new JPanel();
		panel.setBounds(10,10,frame.getWidth()-20, frame.getHeight() - 20); //starts at 10,10 and has the following sizes
		panel.setBorder(BorderFactory.createLineBorder(Color.black)); //makes border black
		frame.getContentPane().add(panel);
		*/
		JLabel lblFirstName = new JLabel("First name: ");           //lbl prefix
		lblFirstName.setBounds(10,10,90,30);  //make sure it doesn't overlap with other components! Like the button
		frame.getContentPane().add(lblFirstName);
		
		JTextField txtFirstName= new JTextField("");
		txtFirstName.setBounds(100,10,300,30);  //we move x position right of first name. 300 means it's a long box
		frame.getContentPane().add(txtFirstName);
		
		JButton btnTest= new JButton("Click me!");  
		btnTest.setBounds(10, 40, 100, 30); //relative to frame
		frame.getContentPane().add(btnTest); //button placed on frame
		
		btnTest.addActionListener(new ActionListener() {  //We used control space to fill the next section
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("Congrats you clicked a button!");  //shows this message after clicking a button
				txtFirstName.setText("Congrats, you clicked a button!"); //puts into text box
			}
		});
		frame.show();        //relative to screen
	}

}
