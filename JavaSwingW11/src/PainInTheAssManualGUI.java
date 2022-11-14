import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
//Example of how to set up GUI!!
import javax.swing.*;
public class PainInTheAssManualGUI {
	JFrame mainFrame;
	JLabel lblFirstName;
	JTextField txtFirstName;
	JButton btnSave;
	
	JComboBox cboAccounts;
	
	//ArrayList<Account> accountList = new ArrayList<Account>(); //combo box takes arrays not arraylists
	Account[] accountList = new Account[10];
	
	public PainInTheAssManualGUI() {
		Random r = new Random();
		for (int i =0; i<10; i++) {
			Account a = new Account(r.nextDouble(), i, "checking");
			//accountList.add(a);    //only works for arrayLists
			accountList[i] = a;
		}
		
		for (int j=0; j< accountList.length; j++) {
			System.out.println(accountList[j]);
		}
		initGui();
	}
	
	private void initGui() {
		mainFrame = new JFrame("Welcome to Java");
		mainFrame.setBounds(100,100, 700, 600);  //starts at top left corner of your screen
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the frame
		mainFrame.setVisible(true); //allows us to see it, make it last thing you do so it works better, sometimes
		
		
		lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10,10,150,30);  //relative to parent component (frame)
		mainFrame.getContentPane().add(lblFirstName);
		
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(190, 10, 150, 30);          //offset it from the label. Start at 170 because > 10 + 150
		mainFrame.getContentPane().add(txtFirstName);
		
		
		btnSave = new JButton("Save");
		btnSave.setBounds(190, 50, 100, 30);
		btnSave.addActionListener(new ActionListener() {  //Use control space to generate code
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button click");
				
				populateTextField();  //method fills textfield
			}
		});
		mainFrame.getContentPane().add(btnSave);
		
		cboAccounts = new JComboBox(accountList);  //array accountList is parameter. The override made the combo box have meaningful strings
		cboAccounts.setBounds(190,120,100,30);
		mainFrame.getContentPane().add(cboAccounts);
		
		mainFrame.repaint();    //repaint frame when adding components at run time
		
		
	}
	private void populateTextField() {
		txtFirstName.setText("Dmitry");
	}
}
