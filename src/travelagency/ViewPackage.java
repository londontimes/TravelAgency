
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
import javax.swing.JPanel;

public class ViewPackage extends JFrame {
	private JPanel contentPane;
        Choice c1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPackage frame = new ViewPackage("");
                                        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewPackage(String username)  {
                setTitle("View Package Details");
		setBounds(580, 220, 850, 450);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/bookedDetails.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 350,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel la1 = new JLabel(i2);
                la1.setBounds(450,40,350,350);
                add(la1);
		
		JLabel lbltitle = new JLabel("VIEW PACKAGE DETAILS");
		lbltitle.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
		lbltitle.setBounds(88, 11, 350, 53);
		contentPane.add(lbltitle);
                
                JLabel lb3 = new JLabel("Username :");
                lb3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lb3.setBounds(35, 70, 200, 14);
		contentPane.add(lb3);
                
                JLabel l1 = new JLabel();
                l1.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l1.setBounds(271, 70, 200, 14);
		contentPane.add(l1);
                
                JLabel lblId = new JLabel("Package :");
                lblId.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                JLabel l2 = new JLabel();
                l2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l2.setBounds(271, 110, 200, 14);
		contentPane.add(l2);
                
                JLabel lb2 = new JLabel("Number of Persons :");
                lb2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lb2.setBounds(35, 150, 200, 14);
		contentPane.add(lb2);
                
                JLabel l3 = new JLabel();
                l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l3.setBounds(271, 150, 200, 14);
		contentPane.add(l3);
		
		JLabel lblName = new JLabel("ID :");
                lblName.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblName.setBounds(35, 190, 200, 14);
		contentPane.add(lblName);
		
		JLabel l4 = new JLabel();
		l4.setBounds(271, 190, 200, 14);
		contentPane.add(l4);

                
		JLabel lblGender = new JLabel("Number :");
                lblGender.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblGender.setBounds(35, 230, 200, 14);
		contentPane.add(lblGender);
                
                JLabel l5 = new JLabel();
                l5.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l5.setBounds(271, 230, 200, 14);
		contentPane.add(l5);
                
		JLabel lblphone = new JLabel("Phone :");
                lblphone.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblphone.setBounds(35, 270, 200, 14);
		contentPane.add(lblphone);
                
                JLabel l6 = new JLabel();
                l6.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l6.setBounds(271, 270, 200, 14);
		contentPane.add(l6);
		
		JLabel lblprice = new JLabel("Price :");
                lblprice.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblprice.setBounds(35, 310, 200, 14);
		contentPane.add(lblprice);
                
                JLabel l7 = new JLabel();
                l7.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l7.setBounds(271, 310, 200, 14);
		contentPane.add(l7);
           	
		Conn c = new Conn();
                try{

                    ResultSet rs = c.s.executeQuery("select * from bookPackage where username = '"+username+"'");
                    while(rs.next()){
                        l1.setText(rs.getString(1));
                        l2.setText(rs.getString(2));
                        l3.setText(rs.getString(3));
                        l4.setText(rs.getString(4));
                        l5.setText(rs.getString(5));
                        l6.setText(rs.getString(6));
                        l7.setText(rs.getString(7));
                        
                    }

                    rs.close();
                }catch(SQLException e){}

		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		}); 
                btnExit.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		btnExit.setBounds(160, 350, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}