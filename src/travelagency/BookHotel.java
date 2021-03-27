
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
import javax.swing.JTextField;

public class BookHotel extends JFrame {
	private JPanel contentPane;
        JTextField txtPersonJTextField,txtNumDaysJTextField;
        Choice c1,c2,c3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookHotel frame = new BookHotel("");
                                        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                                        frame.setTitle("Book Hotel");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BookHotel(String username) {
            
		setBounds(420, 220, 1100, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/book.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel la1 = new JLabel(i2);
                la1.setBounds(450,100,700,300);
                add(la1);
		
		JLabel lbltitle = new JLabel("BOOK HOTEL");
		lbltitle.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
		lbltitle.setBounds(118, 11, 300, 53);
		contentPane.add(lbltitle);
                
                JLabel lblUsrName = new JLabel("Username :");
                lblUsrName.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblUsrName.setBounds(35, 70, 200, 14);
		contentPane.add(lblUsrName);
                
                JLabel l1 = new JLabel(username);
                l1.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l1.setBounds(271, 70, 200, 14);
		contentPane.add(l1);
                
                JLabel lblId = new JLabel("Select Hotel :");
                lblId.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                c1 = new Choice();
                Conn c = new Conn();
                try{

                    ResultSet rs = c.s.executeQuery("select * from hotels");
                    while(rs.next()){
                        c1.add(rs.getString("name"));
                    }

                    rs.close();
                }catch(SQLException e){}

                c1.setBounds(271, 110, 175, 30);
                c1.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
                add(c1);
                
                JLabel la3 = new JLabel("Total Persons");
                la3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		la3.setBounds(35, 150, 200, 14);
		contentPane.add(la3);
                
                txtPersonJTextField = new JTextField();
                txtPersonJTextField.setText("0");
		txtPersonJTextField.setBounds(271, 150, 150, 25);
		contentPane.add(txtPersonJTextField);
		txtPersonJTextField.setColumns(10);
                
                JLabel la4 = new JLabel("Number of Days:");
                la4.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
                la4.setBounds(35, 190, 210, 20);
		contentPane.add(la4);
		
		txtNumDaysJTextField = new JTextField();
		txtNumDaysJTextField.setText("0");
		txtNumDaysJTextField.setBounds(271, 190, 150, 25);
		contentPane.add(txtNumDaysJTextField);
		txtNumDaysJTextField.setColumns(10);
		
		JLabel la5 = new JLabel("AC / Non-AC");
                la5.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		la5.setBounds(35, 230, 200, 14);
		contentPane.add(la5);
                
                c2 = new Choice();
                c2.add("AC");
                c2.add("Non-AC");
                c2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
                c2.setBounds(271, 230, 175, 30);
                add(c2);

                
		JLabel la6 = new JLabel("Food Included :");
                la6.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		la6.setBounds(35, 270, 200, 14);
		contentPane.add(la6);
                
                c3 = new Choice();
                c3.add("Yes");
                c3.add("No");
                c3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
                c3.setBounds(271, 270, 175, 30);
                add(c3);
                
		JLabel lbl1 = new JLabel("ID :");
                lbl1.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lbl1.setBounds(35, 310, 200, 14);
		contentPane.add(lbl1);
                
                JLabel l2 = new JLabel();
                l2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l2.setBounds(271, 310, 200, 14);
		contentPane.add(l2);
		
		JLabel lbl2 = new JLabel("Number :");
                lbl2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lbl2.setBounds(35, 350, 200, 14);
		contentPane.add(lbl2);
                
                JLabel l3 = new JLabel();
                l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l3.setBounds(271, 350, 200, 14);
		contentPane.add(l3);
           	
		JLabel lbl3 = new JLabel("Phone :");
                lbl3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lbl3.setBounds(35, 390, 200, 14);
		contentPane.add(lbl3);
                
                JLabel l4 = new JLabel();
                l4.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l4.setBounds(271, 390, 200, 14);
		contentPane.add(l4);

		
		JLabel lblDeposite = new JLabel("Total Price :");
                lblDeposite.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		lblDeposite.setBounds(35, 430, 200, 14);
		contentPane.add(lblDeposite);
		
		JLabel l5 = new JLabel();
                l5.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		l5.setBounds(271, 430, 200, 14);
                l5.setForeground(Color.RED);
		contentPane.add(l5);
                
                try{

                    ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                    while(rs.next()){
                        l2.setText(rs.getString("id_type"));
                        l3.setText(rs.getString("number"));
                        l4.setText(rs.getString("phone"));
                        
                    }

                    rs.close();
                }catch(SQLException e){}
                
                JButton btncheck = new JButton("Check Price");
		btncheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                           
                            try{
	    			String s1 = c1.getSelectedItem(); 
                                
                                String q1 = "select * from hotels where name = '"+c1.getSelectedItem()+"'";
                                ResultSet rs = c.s.executeQuery(q1);
                                if(rs.next()){
                                    
                                    int cost = Integer.parseInt(rs.getString("cost_per_day"));
                                    int food = Integer.parseInt(rs.getString("food_charges"));
                                    int ac = Integer.parseInt(rs.getString("ac_charges"));
                                    
                                    int persons = Integer.parseInt(txtPersonJTextField.getText());
                                    int days = Integer.parseInt(txtNumDaysJTextField.getText());
                                    
                                    String acprice = c2.getSelectedItem();
                                    String foodprice = c3.getSelectedItem();
                                    
                                    
                                    if(persons * days > 0) {
                                        int total = 0;
                                        total += acprice.equals("AC") ? ac : 1;
                                        total += foodprice.equals("Yes") ? food : 1;
                                        total += cost;
                                        total = total * persons * days;
                                        l5.setText("Tk "+total);
                                    }
                                    
                                    
                                }
                                
	    		}catch(Exception ee){
	    			System.out.println(ee.getMessage());
	    		}
                        }
		});
                btncheck.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		btncheck.setBounds(50, 470, 140, 30);
                btncheck.setBackground(Color.BLACK);
                btncheck.setForeground(Color.WHITE);
		contentPane.add(btncheck);
		

		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                           
                          
                            try{
	    			String s1 = c1.getSelectedItem(); 
                                
                                String q1 = "insert into bookHotel values('"+l1.getText()+"', '"+c1.getSelectedItem()+"', '"+txtPersonJTextField.getText()+"', '"+txtNumDaysJTextField.getText()+"', '"+c2.getSelectedItem()+"', '"+c3.getSelectedItem()+"', '"+l2.getText()+"', '"+l3.getText()+"', '"+l4.getText()+"', '"+l5.getText()+"')";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                                setVisible(false);
                            }catch(Exception ee){
	    			System.out.println(ee.getMessage());
                            }
                            
			}
		});
                btnNewButton.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		btnNewButton.setBounds(210, 470, 120, 30);
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
		btnExit.setBounds(350, 470, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}