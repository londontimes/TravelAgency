
package travelagency;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class Dashboard extends JFrame{
    
    String username;
    public static void main(String[] args) {
        new Dashboard("").setVisible(true);
    }
    
    public Dashboard(String username) {
        
        super("Road trip Travel Agency");
	this.username = username;
        setForeground(Color.CYAN);
        setLayout(null);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1600, 1200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1900, 1000); 
        add(NewLabel);
		
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(211, 243, 245));
	setJMenuBar(menuBar);
		
        JMenu customerMenu = new JMenu("CUSTOMER");
        customerMenu.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        customerMenu.setForeground(Color.DARK_GRAY);
	menuBar.add(customerMenu);
		
        JMenuItem addCustomerItem = new JMenuItem("NEW CUSTOMER DETAIL");
        addCustomerItem.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	customerMenu.add(addCustomerItem);
        
        JMenuItem updateCusItem = new JMenuItem("UPDATE CUSTOMER DETAIL");
        updateCusItem.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	customerMenu.add(updateCusItem);
        
        JMenuItem viewCusItem = new JMenuItem("VIEW CUSTOMER DETAILS");
        viewCusItem .setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	customerMenu.add(viewCusItem );
        
        JMenuItem deleteCusItem = new JMenuItem("DELETE CUSTOMER DETAILS");
        deleteCusItem.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	customerMenu.add(deleteCusItem);
        
        addCustomerItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddCustomer(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        updateCusItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new UpdateCustomer(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        viewCusItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewCustomer(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        deleteCusItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new DeleteCustomer(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        
		
	JMenu packegesMenu = new JMenu("PACKAGES");
        packegesMenu.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        packegesMenu.setForeground(Color.DARK_GRAY);
	menuBar.add(packegesMenu);
        
        JMenuItem checkPkItem = new JMenuItem("CHECK PACKAGE");
        checkPkItem.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	packegesMenu.add(checkPkItem);
        
        JMenuItem bookPkItem = new JMenuItem("BOOK PACKAGE");
        bookPkItem.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	packegesMenu.add(bookPkItem);
        
        JMenuItem viewPkItem = new JMenuItem("VIEW PACKAGE");
        viewPkItem.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	packegesMenu.add(viewPkItem);
        
        
        checkPkItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new CheckPackage().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

        bookPkItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new BookPackage(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	viewPkItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewPackage(username).setVisible(true);
                }catch(Exception e ){}
                
            }
	});
        
        
        JMenu hotelMenu = new JMenu("HOTELS");
        hotelMenu.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        hotelMenu.setForeground(Color.DARK_GRAY);
	menuBar.add(hotelMenu);
        
        JMenuItem bookHotelItem = new JMenuItem("BOOK HOTELS");
        bookHotelItem .setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	hotelMenu.add(bookHotelItem );
        
        JMenuItem viewHotelItem = new JMenuItem("VIEW HOTELS");
        viewHotelItem.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	hotelMenu.add(viewHotelItem);
        
        JMenuItem viewBookedHotelItem = new JMenuItem("VIEW BOOKED HOTEL");
        viewBookedHotelItem .setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	hotelMenu.add(viewBookedHotelItem);
        
        bookHotelItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new BookHotel(username).setVisible(true);
            }
	});
        
        
        
	viewHotelItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new CheckHotels().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        viewBookedHotelItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewBookedHotel(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        JMenu DestinationMenu = new JMenu("DESTINATION");
        DestinationMenu.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        DestinationMenu.setForeground(Color.DARK_GRAY);
	menuBar.add(DestinationMenu);
        
        JMenuItem detinationItem = new JMenuItem("DESTINATION");
        detinationItem.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	DestinationMenu.add(detinationItem);
        
        detinationItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Destination().setVisible(true);
            }
	});
        
        
        JMenu onlineMenu = new JMenu("ONLINE PAYMENT");
        onlineMenu.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        onlineMenu.setForeground(Color.DARK_GRAY);
	menuBar.add(onlineMenu);
        
        JMenuItem payItem = new JMenuItem("ONLINE PAYMENT");
        payItem.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	onlineMenu.add(payItem);
        
        payItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                SwingUtilities.invokeLater(new OnlinePay());
            }
	});
        
        JMenu utilityMenu = new JMenu("UTILITY");
        utilityMenu.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        utilityMenu.setForeground(Color.DARK_GRAY);
	menuBar.add(utilityMenu);
        
        JMenuItem notepadItem = new JMenuItem("NOTEPAD");
        notepadItem.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	utilityMenu.add(notepadItem);
        
        JMenuItem calculatorItem = new JMenuItem("CALCULATOR");
        calculatorItem.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	utilityMenu.add(calculatorItem);
        
        notepadItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                }catch(Exception e){ }
            }
	});
        
        
        calculatorItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(Exception e){ }
            }
	});
        
        JMenu aboutMenu = new JMenu("ABOUT");
        aboutMenu.setForeground(Color.DARK_GRAY);
        aboutMenu.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
	menuBar.add(aboutMenu);
        
        JMenuItem aboutItem = new JMenuItem("ABOUT");
        aboutItem.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	aboutMenu.add(aboutItem);
        
        aboutItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new About().setVisible(true);
            }
	});
        
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
