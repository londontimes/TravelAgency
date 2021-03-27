
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

public class ViewBookedHotel extends JFrame {
	private JPanel contentPane;
        Choice c1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBookedHotel frame = new ViewBookedHotel("");
                                        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                                        frame.setTitle("Booked Hotel Details");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewBookedHotel(String username)  {
		setBounds(580, 220, 850, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/bookedDetails.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 350,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel la1 = new JLabel(i2);
                la1.setBounds(450,50,350,450);
                add(la1);
		
		JLabel lbltitle = new JLabel("VIEW BOOKED HOTEL DETAILS");
		lbltitle.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
		lbltitle.setBounds(88, 11, 350, 53);
		contentPane.add(lbltitle);
                
                JLabel lblUsr = new JLabel("Username :");
                lblUsr.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblUsr.setBounds(35, 70, 200, 14);
		contentPane.add(lblUsr);
                
                JLabel l1 = new JLabel();
                l1.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l1.setBounds(271, 70, 200, 14);
		contentPane.add(l1);
                
                JLabel lblId = new JLabel("Name :");
                lblId.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                JLabel l2 = new JLabel();
                l2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l2.setBounds(271, 110, 200, 14);
		contentPane.add(l2);
                
                JLabel lblNumPer = new JLabel("Number of Persons :");
                lblNumPer.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblNumPer.setBounds(35, 150, 200, 14);
		contentPane.add(lblNumPer);
                
                JLabel l3 = new JLabel();
                l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l3.setBounds(271, 150, 200, 14);
		contentPane.add(l3);
		
		JLabel lblName = new JLabel("Number of Days :");
                lblName.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblName.setBounds(35, 190, 200, 14);
		contentPane.add(lblName);
		
		JLabel l4 = new JLabel();
                l4.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l4.setBounds(271, 190, 200, 14);
		contentPane.add(l4);

                
		JLabel lblAC = new JLabel("AC / Non-AC :");
                lblAC.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblAC.setBounds(35, 230, 200, 14);
		contentPane.add(lblAC);
                
                JLabel l5 = new JLabel();
                l5.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l5.setBounds(271, 230, 200, 14);
		contentPane.add(l5);
                
		JLabel lblfood = new JLabel("Food Included (Yes/No) :");
                lblfood.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblfood.setBounds(35, 270, 200, 14);
		contentPane.add(lblfood);
                
                JLabel l6 = new JLabel();
                l6.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l6.setBounds(271, 270, 200, 14);
		contentPane.add(l6);
		
		JLabel lblID = new JLabel("ID :");
                lblID.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblID.setBounds(35, 310, 200, 14);
		contentPane.add(lblID);
                
                JLabel l7 = new JLabel();
                l7.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l7.setBounds(271, 310, 200, 14);
		contentPane.add(l7);
           	
		JLabel lblNum = new JLabel("Number :");
                lblNum.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblNum.setBounds(35, 350, 200, 14);
		contentPane.add(lblNum);
                
                JLabel l8 = new JLabel();
                l8.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l8.setBounds(271, 350, 200, 14);
		contentPane.add(l8);

		
		JLabel lblPhone = new JLabel("Phone :");
                lblPhone.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblPhone.setBounds(35, 390, 200, 14);
		contentPane.add(lblPhone);
		
		JLabel l9 = new JLabel();
                l9.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l9.setBounds(271, 390, 200, 14);
		contentPane.add(l9);
                
                JLabel lblCost = new JLabel("Cost :");
                lblCost.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblCost.setBounds(35, 430, 200, 14);
		contentPane.add(lblCost);
		
		JLabel l10 = new JLabel();
                l10.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l10.setBounds(271, 430, 200, 14);
		contentPane.add(l10);
                
                Conn c = new Conn();
                try{

                    ResultSet rs = c.s.executeQuery("select * from bookHotel where username = '"+username+"'");
                    while(rs.next()){
                        l1.setText(rs.getString(1));
                        l2.setText(rs.getString(2));
                        l3.setText(rs.getString(3));
                        l4.setText(rs.getString(4));
                        l5.setText(rs.getString(5));
                        l6.setText(rs.getString(6));
                        l7.setText(rs.getString(7));
                        l8.setText(rs.getString(8));
                        l9.setText(rs.getString(9));
                        l10.setText(rs.getString(10));
                        
                        
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
		btnExit.setBounds(160, 470, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}