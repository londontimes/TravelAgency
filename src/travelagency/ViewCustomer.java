
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
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewCustomer extends JFrame {
	Connection conn = null;
	PreparedStatement pst = null;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCustomer frame = new ViewCustomer("");
                                        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewCustomer(String username) throws SQLException {
            
                setTitle("View Customer Details");
		System.out.println(username);
                setBounds(580, 220, 900, 680);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/viewall.jpg"));
                Image i3 = i1.getImage().getScaledInstance(600, 200,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(0,450,600,200);
                add(l1);
                
                ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/viewall.jpg"));
                Image i5 = i4.getImage().getScaledInstance(600, 200,Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JLabel l2 = new JLabel(i6);
                l2.setBounds(250,450,600,200);
                add(l2);
		
		JLabel lbltitle = new JLabel("CUSTOMER DETAILS");
		lbltitle.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
		lbltitle.setBounds(330, 11, 300, 53);
		contentPane.add(lbltitle);
                
                JLabel lblUsrName = new JLabel("Username :");
                lblUsrName.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblUsrName.setBounds(35, 70, 200, 14);
		contentPane.add(lblUsrName);
                
                JLabel lblUsrName2 = new JLabel();
                lblUsrName2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblUsrName2.setBounds(220, 70, 200, 14);
		contentPane.add(lblUsrName2);

                
                JLabel lblId = new JLabel("ID :");
                lblId.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                JLabel lblId2 = new JLabel();
                lblId2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblId2.setBounds(220, 110, 200, 14);
		contentPane.add(lblId2);
           
                
                JLabel lblNum = new JLabel("ID Number :");
                lblNum.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblNum.setBounds(35, 150, 200, 14);
		contentPane.add(lblNum);
                
                JLabel lblNum2 = new JLabel();
                lblNum2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblNum2.setBounds(220, 150, 200, 14);
		contentPane.add(lblNum2);
                
		JLabel lblName = new JLabel("Name :");
                lblName.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblName.setBounds(35, 190, 200, 14);
		contentPane.add(lblName);
                
                JLabel lblName2 = new JLabel();
                lblName2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblName2.setBounds(220, 190, 200, 14);
		contentPane.add(lblName2);

                
		JLabel lblGender = new JLabel("Gender :");
                lblGender.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblGender.setBounds(35, 230, 200, 14);
		contentPane.add(lblGender);
                
                JLabel lblGender2 = new JLabel();
                lblGender2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblGender2.setBounds(220, 230, 200, 14);
		contentPane.add(lblGender2);

                
		JLabel lblCountry = new JLabel("Country :");
                lblCountry.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblCountry.setBounds(450, 70, 200, 19);
		contentPane.add(lblCountry);
                
                JLabel lblCountry2 = new JLabel();
                lblCountry2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblCountry2.setBounds(550, 70, 200, 19);
		contentPane.add(lblCountry2);
                
		
		JLabel lblAddress = new JLabel("Address :");
                lblAddress.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblAddress.setBounds(450, 110, 200, 14);
		contentPane.add(lblAddress);
                
                JLabel lblAddress2 = new JLabel();
                lblAddress2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblAddress2.setBounds(550, 110, 200, 14);
		contentPane.add(lblAddress2);
                
           	
		JLabel lblPhone = new JLabel("Phone :");
                lblPhone.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblPhone.setBounds(450, 150, 200, 14);
		contentPane.add(lblPhone);
                
                JLabel lblPhone2 = new JLabel();
                lblPhone2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblPhone2.setBounds(550, 150, 200, 14);
		contentPane.add(lblPhone2);
		
		JLabel lblEmail = new JLabel("Email :");
                lblEmail.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblEmail.setBounds(450, 190, 200, 14);
		contentPane.add(lblEmail);
                
                JLabel lblEmail2 = new JLabel();
                lblEmail2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblEmail2.setBounds(550, 190, 200, 14);
		contentPane.add(lblEmail2);

		
		
                try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                    if(rs.next()){
                        lblUsrName2.setText(rs.getString(1));  
                        lblId2.setText(rs.getString(2));
                        lblNum2.setText(rs.getString(3));  
                        lblName2.setText(rs.getString(4));
                        lblGender2.setText(rs.getString(5));  
                        lblCountry2.setText(rs.getString(6));
                        lblAddress2.setText(rs.getString(7));  
                        lblPhone2.setText(rs.getString(8));
                        lblEmail2.setText(rs.getString(9));
                    }
                }catch(Exception e){ }
		
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		});
                btnExit.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		btnExit.setBounds(350, 330, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}
