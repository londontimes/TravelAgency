
package travelagency;

import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DeleteCustomer extends JFrame {
	private JPanel contentPane;
        Choice c1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteCustomer frame = new DeleteCustomer("");
                                        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DeleteCustomer(String username) throws SQLException {
            
                setTitle("Delete Customer");
            
		setBounds(580, 220, 850, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/delete.png"));
                Image i3 = i1.getImage().getScaledInstance(400, 400,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(450,100,300,300);
                add(l1);
		
		JLabel lbltitle = new JLabel("DELETE CUSTOMER DETAILS");
		lbltitle.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lbltitle.setBounds(118, 11, 300, 53);
		contentPane.add(lbltitle);
                
                JLabel lblusr = new JLabel("Username :");
                lblusr.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblusr.setBounds(35, 70, 200, 14);
		contentPane.add(lblusr);
                
                JLabel l10 = new JLabel();
                l10.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l10.setBounds(271, 70, 150, 30);
		contentPane.add(l10);
                
                
                JLabel lblId = new JLabel("ID :");
                lblId.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                JLabel l2 = new JLabel();
                l2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l2.setBounds(271, 110, 200, 14);
		contentPane.add(l2);
                
                JLabel lbLnum = new JLabel("Number :");
                lbLnum.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lbLnum.setBounds(35, 150, 200, 14);
		contentPane.add(lbLnum);
                
                JLabel l3 = new JLabel();
                l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l3.setBounds(271, 150, 200, 14);
		contentPane.add(l3);
		
		JLabel lblName = new JLabel("Name :");
                lblName.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblName.setBounds(35, 190, 200, 14);
		contentPane.add(lblName);
		
		JLabel l4 = new JLabel();
                l4.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l4.setBounds(271, 190, 200, 14);
		contentPane.add(l4);

                
		JLabel lblGender = new JLabel("Gender :");
                lblGender.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblGender.setBounds(35, 230, 200, 14);
		contentPane.add(lblGender);
                
                JLabel l5 = new JLabel();
                l5.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l5.setBounds(271, 230, 200, 14);
		contentPane.add(l5);
                
		JLabel lblCountry = new JLabel("Country :");
                lblCountry.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblCountry.setBounds(35, 270, 200, 14);
		contentPane.add(lblCountry);
                
                JLabel l6 = new JLabel();
                l6.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l6.setBounds(271, 270, 200, 14);
		contentPane.add(l6);
		
		JLabel lblAddress = new JLabel("Permanent Address :");
                lblAddress.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblAddress.setBounds(35, 310, 200, 14);
		contentPane.add(lblAddress);
                
                JLabel l7 = new JLabel();
                l7.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l7.setBounds(271, 310, 200, 14);
		contentPane.add(l7);
           	
		JLabel lblPhone = new JLabel("Phone :");
                lblPhone.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblPhone.setBounds(35, 350, 200, 14);
		contentPane.add(lblPhone);
                
                JLabel l8 = new JLabel();
                l8.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l8.setBounds(271, 350, 200, 14);
		contentPane.add(l8);

		
		JLabel lblEmail = new JLabel("Email :");
                lblEmail.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblEmail.setBounds(35, 390, 200, 14);
		contentPane.add(lblEmail);
		
		JLabel l9 = new JLabel();
                l9.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l9.setBounds(271, 390, 200, 14);
		contentPane.add(l9);
                

                try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                    if(rs.next()){
                        l10.setText(rs.getString(1));
                        l2.setText(rs.getString(2));  
                        l3.setText(rs.getString(3));
                        l4.setText(rs.getString(4));  
                        l5.setText(rs.getString(5));
                        l6.setText(rs.getString(6));  
                        l7.setText(rs.getString(7));
                        l8.setText(rs.getString(8));  
                        l9.setText(rs.getString(9));
                    }
                }catch(Exception e){ }
		

		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();   
                          
                            try{ 
                                
                                String q1 = "delete from account where username = '"+username+"'";
                                String q2 = "delete from bookHotel where username = '"+username+"'";
                                String q3 = "delete from bookpackage where username = '"+username+"'";
                                String q4 = "delete from customer where username = '"+username+"'";
                                c.s.executeUpdate(q1);
                                c.s.executeUpdate(q2);
                                c.s.executeUpdate(q3);
                                c.s.executeUpdate(q4);
                                
	    			JOptionPane.showMessageDialog(null, "Customer Detail Deleted Successfully");
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