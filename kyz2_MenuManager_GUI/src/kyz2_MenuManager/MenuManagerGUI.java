
package kyz2_MenuManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class MenuManagerGUI {
	private JLabel lblEntrees,lblSides,lblSalads,lblDesserts,lbl1,lblMenus;
	private JFrame mainMenuWindow;
	private JButton btnCreateMenu,btnRandom,btnMin,btnMax;
	private JComboBox cboEntrees, cboSides, cboSalads, cboDesserts;
	private JTextField txt1 ;
	
	
	
	
	
	
	public MenuManagerGUI() {
		//placeholder string in parameter
		MenuManager mm = new MenuManager("data\\dishes.txt");
		
		//Set up main frame
				mainMenuWindow = new JFrame("Menu Manager");
				mainMenuWindow.setBounds(20, 20, 800, 1000);
				mainMenuWindow.setLayout(null);
				mainMenuWindow.setVisible(true);
				mainMenuWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				//Create the labels
				
				//Everything is defined in relation to lblEntrees - change a dimension and everything will change
				lblEntrees = new JLabel("Entree");
				lblEntrees.setBounds(40,40,100,100);
				mainMenuWindow.getContentPane().add(lblEntrees);
				
				lblSides = new JLabel("Side");
				lblSides.setBounds(lblEntrees.getX(),lblEntrees.getY()+lblEntrees.getHeight()+20, lblEntrees.getWidth(),lblEntrees.getHeight());
				mainMenuWindow.getContentPane().add(lblSides);
				
				lblSalads = new JLabel("Salad");
				lblSalads.setBounds(lblSides.getX(),lblSides.getY()+lblEntrees.getHeight()+20, lblEntrees.getWidth(),lblEntrees.getHeight());
				mainMenuWindow.getContentPane().add(lblSalads);
				
				lblDesserts = new JLabel("Dessert");
				lblDesserts.setBounds(lblSalads.getX(),lblSalads.getY()+lblEntrees.getHeight()+20, lblEntrees.getWidth(),lblEntrees.getHeight());
				mainMenuWindow.getContentPane().add(lblDesserts);
				
				
				//Create the combo boxes with arraylists of the 4 food types from MenuManager
				cboEntrees = new JComboBox(mm.getEntrees().toArray());
				cboEntrees.setBounds(lblEntrees.getX()+100,lblEntrees.getY(), 100, 100);
				mainMenuWindow.getContentPane().add(cboEntrees);
				
				
				cboSides = new JComboBox(mm.getSides().toArray());
				cboSides.setBounds(cboEntrees.getX(),cboEntrees.getY()+cboEntrees.getHeight()+20, 100, 100);
				mainMenuWindow.getContentPane().add(cboSides);
				
				
				cboSalads = new JComboBox(mm.getSalads().toArray());
				cboSalads.setBounds(cboSides.getX(),cboSides.getY()+120, 100, 100);
				mainMenuWindow.getContentPane().add(cboSalads);

				cboDesserts = new JComboBox(mm.getDesserts().toArray());
				cboDesserts.setBounds(cboSalads.getX(),cboSalads.getY()+120, 100, 100);
				mainMenuWindow.getContentPane().add(cboDesserts);
				mainMenuWindow.repaint();
				
				//Add title Build your own Menu and Created Menus: 
				lbl1 = new JLabel("Build your own Menu");
				lbl1.setBounds(30,8,150,10);
				mainMenuWindow.getContentPane().add(lbl1);
				mainMenuWindow.repaint();
				
				lblMenus = new JLabel("Created Menus");
				lblMenus.setBounds(300,40,220,10);
				mainMenuWindow.getContentPane().add(lblMenus);
				mainMenuWindow.repaint();

				
				//Create Menu with these dishes button
				btnCreateMenu = new JButton("Create Menu with these dishes");
				btnCreateMenu.setBounds(lblDesserts.getX(),lblDesserts.getY() + 150, 200, 50);
				mainMenuWindow.getContentPane().add(btnCreateMenu);
				mainMenuWindow.repaint();
				
			
				
				//Add a border using list below build your own menu
				JList list2 = new JList();
				list2.setBounds(20,20,250,600);
				mainMenuWindow.getContentPane().add(list2);
				mainMenuWindow.repaint();
				
				//Add Event Handler so it creates a menu in Created Menus
				btnCreateMenu.addActionListener(new ActionListener() {
				
					@Override
					public void actionPerformed(ActionEvent e) {
					Entree selectedEntree = (Entree) cboEntrees.getSelectedItem();
					
					Side selectedSide = (Side) cboSides.getSelectedItem();
					Salad selectedSalad = (Salad) cboSalads.getSelectedItem();
					Dessert selectedDessert = (Dessert) cboDesserts.getSelectedItem();
					String name = JOptionPane.showInputDialog("Please name your menu: ");	
					
					Menu me = new Menu(name,selectedEntree,selectedSide,selectedSalad,selectedDessert);
					
					
					
					DefaultListModel<Menu> demoList = new DefaultListModel<Menu>();
					demoList.addElement(me);
					JList<Menu> menuList = new JList<Menu>(demoList);
					//Treat menuList like a txt box etc.
					
					//Is there a prefix for lists?
					//Set up List and menu storage
					
					menuList.setBounds(300,70,250,600);
					mainMenuWindow.getContentPane().add(menuList);
					mainMenuWindow.repaint();
					
					}
					
				});
				
					//Create the other 3 buttons
				
					btnRandom = new JButton("Generate a Random Menu");
					btnRandom.setBounds(btnCreateMenu.getX(),btnCreateMenu.getY() + 150, 200, 50);
					mainMenuWindow.getContentPane().add(btnRandom);
					mainMenuWindow.repaint();		
					
					
		
				
				
				
				
				

				
				
				
		
				}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
public static void main(String[] args) {
		MenuManagerGUI app = new MenuManagerGUI();

	}

}
