
package kyz2_MenuManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.MenuListener;


public class MenuManagerGUI {
	private JLabel lblEntrees,lblSides,lblSalads,lblDesserts,lbl1,lbl2,lblMenus,lblChildEntree,lblChildSide,lblChildSalad, lblChildDessert, lblChildCalories, lblChildPrice;
	private JFrame mainMenuWindow,childWindow;
	private JButton btnCreateMenu,btnRandom,btnMin,btnMax, btnDetails,btnDelete,btnSave;
	private JComboBox cboEntrees, cboSides, cboSalads, cboDesserts;
	private JTextField txtChildEntree,txtChildSide,txtChildSalad,txtChildDessert,txtChildCalories,txtChildPrice;
	private JList<Menu> menuList;
	
	
	
	
	
	public MenuManagerGUI() {
		//placeholder string in parameter
		MenuManager mm = new MenuManager("data\\dishes.txt");
		
		//Set up main frame
				mainMenuWindow = new JFrame("Menu Manager");
				mainMenuWindow.setBounds(20, 20, 800, 1100);
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
				lblMenus.setBounds(350,40,220,10);
				mainMenuWindow.getContentPane().add(lblMenus);
				mainMenuWindow.repaint();
				
				
				//Create Menu with these dishes button
				btnCreateMenu = new JButton("Create Menu with these dishes");
				btnCreateMenu.setBounds(lblDesserts.getX(),lblDesserts.getY() + 150, 250, 50);
				mainMenuWindow.getContentPane().add(btnCreateMenu);
				mainMenuWindow.repaint();
				
				
				
				//Add a border using list below build your own menu 
				JList list2 = new JList();
				list2.setBounds(20,20,300,600);
				mainMenuWindow.getContentPane().add(list2);
				mainMenuWindow.repaint();
				
				
				
				
				//Create List for Menu storage
				DefaultListModel<Menu> dlm = new DefaultListModel<Menu>();
			    menuList = new JList<>(dlm);
			    //Treat menuList like a txt box etc.
				
				//Is there a prefix for lists?
				
				menuList.setBounds(350,70,415,600);
				mainMenuWindow.getContentPane().add(menuList);
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
					
					
					
					
					dlm.addElement(me);
					
					
					}
					
				});
				
					//Create the other 3 buttons
				
					btnRandom = new JButton("Generate a Random Menu");
					btnRandom.setBounds(btnCreateMenu.getX(),btnCreateMenu.getY() + 120, 250, 50);
					mainMenuWindow.getContentPane().add(btnRandom);
					mainMenuWindow.repaint();		
					
					btnMin = new JButton("Generate a Minimum Calories Menu");
					btnMin.setBounds(btnRandom.getX(),btnRandom.getY() + 100, 250, 50);
					mainMenuWindow.getContentPane().add(btnMin);
					mainMenuWindow.repaint();	
					
					btnMax = new JButton("Generate a Maximum Calories Menu");
					btnMax.setBounds(btnMin.getX(),btnMin.getY() + 100, 250, 50);
					mainMenuWindow.getContentPane().add(btnMax);
					mainMenuWindow.repaint();	
		
					//Add title Or Generate a Menu
					lbl2 = new JLabel("Or generate a Menu");
					lbl2.setBounds(20,btnCreateMenu.getY()+75,150,10);
					mainMenuWindow.getContentPane().add(lbl2);
					mainMenuWindow.repaint();
					
					//Adding border and title around buttons
					JList list3 = new JList();
					list3.setBounds(20,btnCreateMenu.getY()+100,300,300);
					mainMenuWindow.getContentPane().add(list3);
					mainMenuWindow.repaint();
					
					//Add event handlers to add to the JList shared by Create Menu button
					
					//Random Menu 
					//Ask user to input name
					//Use method randommenu to create menu
					//add to list
					btnRandom.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
						
						MenuManager mm = new MenuManager("data\\dishes.txt");
						String name = JOptionPane.showInputDialog("Please name your menu: ");	
						
						Menu random = mm.randomMenu(name);
						
						
						
						
						dlm.addElement(random);
						
						}
						
					});
					
					
					//Min calories menu 
						btnMin.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
						
						MenuManager mm = new MenuManager("data\\dishes.txt");
						String name = JOptionPane.showInputDialog("Please name your menu: ");	
						
						Menu random = mm.minCaloriesMenu(name);
						
						
						
						
						dlm.addElement(random);
						
						}
						
					});
					
					//max calories menu 
						
						btnMax.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
							
							MenuManager mm = new MenuManager("data\\dishes.txt");
							String name = JOptionPane.showInputDialog("Please name your menu: ");	
							
							Menu random = mm.maxCaloriesMenu(name);
							
							
							
							
							dlm.addElement(random);
							
							}
							
						});
						
					//Create button details, Delete All, and Save to File
					
						btnDetails = new JButton("Details");
						btnDetails.setBounds(menuList.getX(), menuList.getY() + menuList.getHeight() + 20, 250/2, 50);
						mainMenuWindow.getContentPane().add(btnDetails);
						mainMenuWindow.repaint();		
						
						btnDelete = new JButton("Delete All");
						btnDelete.setBounds(btnDetails.getX() + btnDetails.getWidth()+20,btnDetails.getY(), 250/2, 50);
						mainMenuWindow.getContentPane().add(btnDelete);
						mainMenuWindow.repaint();	
						
						btnSave= new JButton("Save to file");
						btnSave.setBounds(btnDelete.getX()+btnDelete.getWidth()+20,btnDelete.getY(), 250/2, 50);
						mainMenuWindow.getContentPane().add(btnSave);
						mainMenuWindow.repaint();	
					
						//Add the 3 button Event Handlers
						
						//Details Button
							btnDetails.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								Menu selectedMenu = menuList.getSelectedValue();
								
							
							childWindow = new JFrame("Menu: My own Menu");
							childWindow.setBounds(20, 20,1200, 1000);
							childWindow.setLayout(null);
							childWindow.setVisible(true);
							
							
							lblChildEntree = new JLabel("Entree");
							lblChildEntree.setBounds(40,40,150,10);
							childWindow.getContentPane().add(lblChildEntree);
							childWindow.repaint();
							
							lblChildSide= new JLabel("Side");
							lblChildSide.setBounds(lblChildEntree.getX(),lblChildEntree.getY()+100,150,10);
							childWindow.getContentPane().add(lblChildSide);
							childWindow.repaint();
							
							lblChildSalad = new JLabel("Salad");
							lblChildSalad.setBounds(lblChildSide.getX(),lblChildSide.getY()+100,150,10);
							childWindow.getContentPane().add(lblChildSalad);
							childWindow.repaint();
							
							lblChildDessert = new JLabel("Dessert");
							lblChildDessert.setBounds(lblChildSalad.getX(),lblChildSalad.getY()+100,150,10);
							childWindow.getContentPane().add(lblChildDessert);
							childWindow.repaint();
							
							lblChildCalories = new JLabel("Total Calories:");
							lblChildCalories.setBounds(lblChildDessert.getX(),lblChildDessert.getY()+150,150,10);
							childWindow.getContentPane().add(lblChildCalories);
							childWindow.repaint();
							
							lblChildPrice = new JLabel("Total Price: $");
							lblChildPrice.setBounds(lblChildCalories.getX(),lblChildCalories.getY()+100,150,10);
							childWindow.getContentPane().add(lblChildPrice);
							childWindow.repaint();
							
							
							//How to get elements?
							txtChildEntree = new JTextField();
							txtChildEntree.setText(selectedMenu.getEntree().getName()+" \n"+selectedMenu.getEntree().getDescription()+". Calories: "+selectedMenu.getEntree().getCalories()+". Price $"+ selectedMenu.getEntree().getPrice()+"0");
							txtChildEntree.setBounds(lblChildEntree.getX()+100,lblChildEntree.getY(),1000,75);
							childWindow.getContentPane().add(txtChildEntree);
							childWindow.repaint();
							
							txtChildSide = new JTextField();
							txtChildSide.setBounds(lblChildEntree.getX()+100,lblChildSide.getY(),1000,75);
							txtChildSide.setText(selectedMenu.getSide().getName()+" \n"+selectedMenu.getSide().getDescription()+". Calories: "+selectedMenu.getSide().getCalories()+". Price $"+ selectedMenu.getSide().getPrice()+"0");
							childWindow.getContentPane().add(txtChildSide);
							childWindow.repaint();
							
							txtChildSalad = new JTextField();
							txtChildSalad.setBounds(lblChildEntree.getX()+100,lblChildSalad.getY(),1000,75);
							txtChildSalad.setText(selectedMenu.getSalad().getName()+" \n"+selectedMenu.getSalad().getDescription()+". Calories: "+selectedMenu.getSalad().getCalories()+". Price $"+ selectedMenu.getSalad().getPrice()+"0");
							childWindow.getContentPane().add(txtChildSalad);
							childWindow.repaint();
							
							txtChildDessert = new JTextField();
							txtChildDessert.setText(selectedMenu.getDessert().getName()+" \n"+selectedMenu.getDessert().getDescription()+". Calories: "+selectedMenu.getDessert().getCalories()+". Price $"+ selectedMenu.getDessert().getPrice()+"0");
							txtChildDessert.setBounds(lblChildEntree.getX()+100,lblChildDessert.getY(),1000,75);
							childWindow.getContentPane().add(txtChildDessert);
							childWindow.repaint();
							
							txtChildCalories = new JTextField();
							int totalCal=selectedMenu.getEntree().getCalories()+selectedMenu.getSide().getCalories()+selectedMenu.getSalad().getCalories()+selectedMenu.getDessert().getCalories();
							txtChildCalories.setText(Integer.toString(totalCal));
							txtChildCalories.setBounds(lblChildCalories.getX()+100,lblChildCalories.getY(),150,50);
							childWindow.getContentPane().add(txtChildCalories);
							childWindow.repaint();
							
							txtChildPrice = new JTextField();
							double totalPrice=selectedMenu.getEntree().getPrice()+selectedMenu.getSide().getPrice()+selectedMenu.getSalad().getPrice()+selectedMenu.getDessert().getPrice();
							txtChildPrice.setText(Double.toString(totalPrice)+"0");
							txtChildPrice.setBounds(lblChildPrice.getX()+100,lblChildPrice.getY(),150,50);
							childWindow.getContentPane().add(txtChildPrice);
							childWindow.repaint();
							
							}
							
							
							
						});
						
						//Delete Button
							btnDelete.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
							
							
							
							dlm.removeAllElements();
							
							}
							
						});
						
						//Save to File Button
							
							btnSave.addActionListener(new ActionListener() {
								
							@Override
							public void actionPerformed(ActionEvent e) {
								ArrayList <Menu> selectedMenu = new ArrayList<Menu>(); 
								for(int i = 0; i<dlm.size(); i++) {
									selectedMenu.add(dlm.get(i));
								}
								
								//My file is called menu.txt
								//Figure out how to get the arrayList menuList
								FileManager.writeMenu("data\\menu.txt",selectedMenu);
								
						
							
							}
							
						});
						
						
				

				
				
				
		
				}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
public static void main(String[] args) {
		MenuManagerGUI app = new MenuManagerGUI();

	}

}
