
package travelagency;

import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AddCustomer extends JFrame {
    
	Connection conn = null;
	PreparedStatement pst = null;
	private JPanel contentPane;
	private JTextField userNameJTextField,IdNumJTextField,nameJTextField,countryJTextField,addressJTextField,phoneJTextField,emailJTextField;
        JComboBox comboBox;
        JRadioButton r1,r2;
        Choice c1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCustomer frame = new AddCustomer("");
                                        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AddCustomer(String username) throws SQLException {
                
                setTitle("Add New Customer");
		System.out.println(username);
                setBounds(580, 220, 850, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/newcustomer.jpg"));
                Image i3 = i1.getImage().getScaledInstance(450, 500,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(450,40,450,420);
                add(l1);
		
		JLabel lbltitle = new JLabel("NEW CUSTOMER FORM");
		lbltitle.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
		lbltitle.setBounds(118, 11, 260, 53);
		contentPane.add(lbltitle);
                
                JLabel lblUserName = new JLabel("Username :");
                lblUserName.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblUserName.setBounds(35, 70, 200, 14);
		contentPane.add(lblUserName);
                
                userNameJTextField = new JTextField("");
		userNameJTextField.setBounds(271, 70, 150, 25);
		contentPane.add(userNameJTextField);
		userNameJTextField.setColumns(10);
                
                JLabel lblId = new JLabel("ID :");
                lblId.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                comboBox = new JComboBox(new String[] {"Passport", "NID", "Driving license"});
                comboBox.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		comboBox.setBounds(271, 110, 150, 25);
		contentPane.add(comboBox);
                
                JLabel l2 = new JLabel("ID Number :");
                l2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l2.setBounds(35, 150, 200, 14);
		contentPane.add(l2);
                
                IdNumJTextField = new JTextField();
		IdNumJTextField.setBounds(271, 150, 150, 25);
		contentPane.add(IdNumJTextField);
		IdNumJTextField.setColumns(10);
		
		JLabel lblName = new JLabel("Name :");
                lblName.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblName.setBounds(35, 190, 200, 14);
		contentPane.add(lblName);
		
		nameJTextField = new JTextField();
		nameJTextField.setBounds(271, 190, 150, 25);
		contentPane.add(nameJTextField);
		nameJTextField.setColumns(10);

                
		JLabel lblGender = new JLabel("Gender :");
                lblGender.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblGender.setBounds(35, 230, 200, 14);
		contentPane.add(lblGender);
                
                r1 = new JRadioButton("Male");
                r1.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
                r1.setBackground(Color.WHITE);
                r1.setBounds(271, 230, 80, 15);
                add(r1);
                
                r2 = new JRadioButton("Female");
                r2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
                r2.setBackground(Color.WHITE);
                r2.setBounds(350, 230, 100, 15);
		add(r2);
                
                ButtonGroup G1 = new ButtonGroup();
                G1.add(r1);
                G1.add(r2);
                
		JLabel lblCountry = new JLabel("Country :");
                lblCountry.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblCountry.setBounds(35, 270, 200, 20);
		contentPane.add(lblCountry);
                
                countryJTextField = new JTextField();
		countryJTextField.setBounds(271, 270, 150, 25);
		contentPane.add(countryJTextField);
		countryJTextField.setColumns(10);
		
		JLabel lblReserveRoomNumber = new JLabel("Address :");
                lblReserveRoomNumber.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblReserveRoomNumber.setBounds(35, 310, 200, 14);
		contentPane.add(lblReserveRoomNumber);
                
                addressJTextField = new JTextField();
		addressJTextField.setBounds(271, 310, 150, 25);
		contentPane.add(addressJTextField);
		addressJTextField.setColumns(10);
           	
		JLabel lblPhone = new JLabel("Phone :");
                lblPhone.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblPhone.setBounds(35, 350, 200, 14);
		contentPane.add(lblPhone);
                
                phoneJTextField = new JTextField();
		phoneJTextField.setBounds(271, 350, 150, 25);
		contentPane.add(phoneJTextField);
		phoneJTextField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email :");
                lblEmail.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblEmail.setBounds(35, 390, 200, 14);
		contentPane.add(lblEmail);
		
		emailJTextField = new JTextField();
		emailJTextField.setBounds(271, 390, 150, 25);
		contentPane.add(emailJTextField);
		emailJTextField.setColumns(10);
		
		
                try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from account where username = '"+username+"'");
                    while(rs.next()){
                        userNameJTextField.setText(rs.getString("username"));  
                        nameJTextField.setText(rs.getString("name"));
                    }
                }catch(Exception e){ }
		
		

		JButton btnNewButton = new JButton("Add");
                btnNewButton.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                            String radio = null;
                            
                            if(r1.isSelected()){ 
                                radio = "Male";
                            }
                            else if(r2.isSelected()){ 
                                radio = "Female";
                            }
                           
                          
                            try{
	    			String username = userNameJTextField.getText();
                                String combo = (String)comboBox.getSelectedItem(); 
	    			String idnum =  IdNumJTextField.getText();
	    			String name =  nameJTextField.getText();
                                String radioSelect =  radio;
	    			String country =  countryJTextField.getText();
	    			String address =  addressJTextField.getText();
                                String phone =  phoneJTextField.getText();
                                String email = emailJTextField.getText();
                                
                                String q1 = "insert into customer values('"+username+"','"+combo+"','"+idnum+"','"+name+"','"+radioSelect+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Customer Added Successfully");
                                setVisible(false);
	    		}catch(SQLException e1){
	    			System.out.println(e1.getMessage());
	    		}
		    		catch(NumberFormatException s){
		    			JOptionPane.showMessageDialog(null, "Please enter a valid Number");
			}
			}
		});
		btnNewButton.setBounds(100, 430, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Back");
                btnExit.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		}); 
		btnExit.setBounds(260, 430, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}