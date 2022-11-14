import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankGui {
	private JFrame mainBankWindow;
	private JLabel lblAccounts, lblAmount, lblReport;
	private JComboBox cboAccounts;
	private JTextField txtAmount;
	private JButton btnDeposit, btnWithdraw, btnOpenWindow;
	private JTextArea txtTextBlob;
	
	private JFrame frmChildWindow;
	private Bank bank; 
	
	public BankGui() {
		bank = new Bank();
		buildMainBankWindow();
	}
	
	private void buildMainBankWindow() {
		mainBankWindow = new JFrame("Welcome to CMPINF 401 Bank");
		mainBankWindow.setBounds(20,20,500,500);
		mainBankWindow.setLayout(null); 
		
		//Add a label
		lblAccounts = new JLabel("Accounts");
		lblAccounts.setBounds(10, 20, 80, 30); //null- doesn't move relative to top left corner of window
		mainBankWindow.getContentPane().add(lblAccounts);	
		
		//Add a combo box with list of accounts
		//String[] temp = {"1","2","3","4","5"}; 
		cboAccounts =new JComboBox(bank.getAccounts().toArray());  //Combo box needs string array of values!
		cboAccounts.setBounds(lblAccounts.getX() + lblAccounts.getWidth(),lblAccounts.getY(),150,30);     //instead of specifying make it relative to label lblAccounts
		mainBankWindow.getContentPane().add(cboAccounts);                     
		
		
		//Add a textbox for withdrawal
		lblAmount = new JLabel("Amount: ");
		lblAmount.setBounds(lblAccounts.getX(),lblAccounts.getY() + lblAccounts.getHeight() + 19,lblAccounts.getWidth(),lblAccounts.getHeight());
		mainBankWindow.getContentPane().add(lblAmount);
		
		txtAmount = new JTextField("0"); 
		txtAmount.setBounds(lblAmount.getX() + lblAmount.getWidth(), lblAmount.getY(), 150, 30); 
		mainBankWindow.getContentPane().add(txtAmount);  //puts it in interface   
		
		//Add Buttons
		btnDeposit = new JButton("Deposit");
		btnDeposit.setBounds(txtAmount.getX(), txtAmount.getY() + txtAmount.getHeight() + 10, 100, 30);
		mainBankWindow.getContentPane().add(btnDeposit); //add to main window
		
		//For the child window it should be in the bottom left corner 
		btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setBounds(btnDeposit.getX() + btnDeposit.getWidth() + 5, btnDeposit.getY(), 100, 30);
		mainBankWindow.getContentPane().add(btnWithdraw);
			
		//Add report label
			lblReport = new JLabel("");
			lblReport.setBounds(btnDeposit.getX(),btnDeposit.getY() + btnDeposit.getHeight() + 19, 300, 20);
			mainBankWindow.getContentPane().add(lblReport);
	
			//Add Button 
			btnOpenWindow = new JButton("Open child window");
			btnOpenWindow.setBounds(mainBankWindow.getX(), mainBankWindow.getY() + mainBankWindow.getHeight() - 100, 150, 30);
			mainBankWindow.getContentPane().add(btnOpenWindow);
			
			
			// Add event handlers when button deposit is pressed
			btnDeposit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String selectedAccountNumber = cboAccounts.getSelectedItem().toString();
					Account selectedAccount = bank.findAccountByID(selectedAccountNumber);
					Double amount = Double.parseDouble(txtAmount.getText());
					selectedAccount.deposit(amount);
					lblReport.setText("Updated balance is $" + selectedAccount.getBalance());
					
				}
			});
			
			btnWithdraw.addActionListener(new ActionListener() {  //use control space to auto complete
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String selectedAccountNumber = cboAccounts.getSelectedItem().toString();
					Account selectedAccount = bank.findAccountByID(selectedAccountNumber);
					Double amount = Double.parseDouble(txtAmount.getText());
					selectedAccount.withdraw(amount);
					lblReport.setText("Updated balance is $" + selectedAccount.getBalance());
					
				}
			});
		
			btnOpenWindow.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					createChildWindow();
					
				}
			});
			
			mainBankWindow.setVisible(true);
	}
		
			private void createChildWindow() {
				frmChildWindow = new JFrame("Child Window");
				frmChildWindow.setBounds(mainBankWindow.getX() + 20, mainBankWindow.getY() + 20, 400, 300);
				
				
				txtTextBlob = new JTextArea();
				txtTextBlob.setBounds(10, 10, 200, 100);
				frmChildWindow.getContentPane().add(txtTextBlob);  //adding textbox to child window
				
				String selectedAccountNumber = cboAccounts.getSelectedItem().toString();
				Account selectedAccount = bank.findAccountByID(selectedAccountNumber);
				txtTextBlob.setText(selectedAccount.getAccountNumber() + ": " + selectedAccount.getBalance());
				
				frmChildWindow.setVisible(true);
				//setting to null will make it disappear, setting visibility to false will
				//hide window but not kill all the data
			}
	
			
	}
	
	
	
	
	
	
	

