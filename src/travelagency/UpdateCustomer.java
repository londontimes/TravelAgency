
package travelagency;

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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpdateCustomer extends JFrame {
	Connection conn = null;
	PreparedStatement pst = null;
	private JPanel contentPane;
	private JTextField usrNameJTextField,IdJTextField,idNumJTextField,nameJTextField,genderJTextField,countryJTextField,AddressJTextField,phoneJTextField,emaiJTextField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateCustomer frame = new UpdateCustomer("");
                                        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UpdateCustomer(String username) throws SQLException {
            
                setTitle("Update Customer Details");
		System.out.println(username);
                setBounds(580, 220, 850, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/update.png"));
                Image i3 = i1.getImage().getScaledInstance(300, 400,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(500,40,300,400);
                add(l1);
		
		JLabel lbltitle = new JLabel("UPDATE CUSTOMER DETAILS");
		lbltitle.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
		lbltitle.setBounds(118, 11, 300, 53);
		contentPane.add(lbltitle);
                
                JLabel lblUsrName = new JLabel("Username :");
                lblUsrName.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblUsrName.setBounds(35, 70, 200, 14);
		contentPane.add(lblUsrName);
                
                usrNameJTextField = new JTextField();
		usrNameJTextField.setBounds(271, 70, 150, 25);
		contentPane.add(usrNameJTextField);
		usrNameJTextField.setColumns(10);
                
                JLabel lblId = new JLabel("ID :");
                lblId.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                IdJTextField = new JTextField();
		IdJTextField.setBounds(271, 110, 150, 25);
		contentPane.add(IdJTextField);
		IdJTextField.setColumns(10);
                
                JLabel lblNum = new JLabel("ID Number :");
                lblNum.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblNum.setBounds(35, 150, 200, 14);
		contentPane.add(lblNum);
                
                idNumJTextField = new JTextField("");
		idNumJTextField.setBounds(271, 150, 150, 25);
		contentPane.add(idNumJTextField);
		idNumJTextField.setColumns(10);
		
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
                
                genderJTextField = new JTextField();
		genderJTextField.setBounds(271, 230, 150, 25);
		contentPane.add(genderJTextField);
		genderJTextField.setColumns(10);
                
		JLabel lblCountry = new JLabel("Country :");
                lblCountry.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblCountry.setBounds(35, 270, 200, 19);
		contentPane.add(lblCountry);
                
                countryJTextField = new JTextField();
		countryJTextField.setBounds(271, 270, 150, 25);
		contentPane.add(countryJTextField);
		countryJTextField.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address :");
                lblAddress.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblAddress.setBounds(35, 310, 200, 14);
		contentPane.add(lblAddress);
                
                AddressJTextField = new JTextField();
		AddressJTextField.setBounds(271, 310, 150, 25);
		contentPane.add(AddressJTextField);
		AddressJTextField.setColumns(10);
           	
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
		
		emaiJTextField = new JTextField();
		emaiJTextField.setBounds(271, 390, 150, 25);
		contentPane.add(emaiJTextField);
		emaiJTextField.setColumns(10);
		
		
                try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                    if(rs.next()){
                        usrNameJTextField.setText(rs.getString(1));  
                        IdJTextField.setText(rs.getString(2));
                        idNumJTextField.setText(rs.getString(3));  
                        nameJTextField.setText(rs.getString(4));
                        genderJTextField.setText(rs.getString(5));  
                        countryJTextField.setText(rs.getString(6));
                        AddressJTextField.setText(rs.getString(7));  
                        phoneJTextField.setText(rs.getString(8));
                        emaiJTextField.setText(rs.getString(9));
                    }
                }catch(Exception e){ }
		
		

		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                           
                          
                            try{
	    			String username = usrNameJTextField.getText();
                                String ID = IdJTextField.getText(); 
	    			String IDNum =  idNumJTextField.getText();
	    			String name =  nameJTextField.getText();
                                String gender =  genderJTextField.getText();
	    			String country =  countryJTextField.getText();
	    			String address =  AddressJTextField.getText(); 
                                String phone =  phoneJTextField.getText();
                                String email = emaiJTextField.getText(); 
                                
                                String q1 = "update customer set id_type = '"+ID+"', number = '"+IDNum+"', name = '"+name+"', gender = '"+gender+"', country = '"+country+"', address = '"+address+"', phone = '"+phone+"', email = '"+email+"' where username = '"+username+"'";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Customer Detail Updated Successfully");
                                setVisible(false);
	    		}catch(SQLException e1){
	    			System.out.println(e1.getMessage());
	    		}
		    		catch(NumberFormatException s){
		    			JOptionPane.showMessageDialog(null, "Please enter a valid Number");
			}
			}
		});
                btnNewButton.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		btnNewButton.setBounds(100, 430, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		});
                btnExit.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		btnExit.setBounds(260, 430, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}
