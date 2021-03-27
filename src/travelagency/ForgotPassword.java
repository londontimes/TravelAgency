
package travelagency;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class ForgotPassword extends JFrame implements ActionListener{

    private JPanel P1;
    private JTextField userNameTxtField,nameTxtField,QnTxtField,ansTxtField,PassTxtField;
    private JButton btnSearch,btnRetieve,btnBack;

    public static void main(String[] args) {
	new ForgotPassword().setVisible(true);
    }

    public ForgotPassword() {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Forgot Password");

        setBounds(500, 200, 850, 400);
	P1 = new JPanel();
	P1.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(P1);
        P1.setBackground(Color.WHITE);
	P1.setLayout(null);

	JLabel l1 = new JLabel("Username :");
	l1.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	l1.setBounds(109, 83, 87, 35);
	P1.add(l1);

	JLabel l2 = new JLabel("Name :");
	l2.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	l2.setBounds(109, 122, 75, 35);
	P1.add(l2);

	JLabel l3 = new JLabel("Your Security Q: ");
	l3.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	l3.setBounds(109, 154, 156, 35);
	P1.add(l3);

	JLabel l4 = new JLabel("Answer :");
	l4.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	l4.setBounds(109, 192, 104, 21);
	P1.add(l4);

	JLabel l5 = new JLabel("Password :");
	l5.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	l5.setBounds(109, 224, 104, 21);
	P1.add(l5);

	userNameTxtField = new JTextField();
	userNameTxtField.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	userNameTxtField.setForeground(new Color(105, 105, 105));
	userNameTxtField.setBounds(277, 88, 139, 25);
	P1.add(userNameTxtField);
	userNameTxtField.setColumns(10);

	nameTxtField = new JTextField();
	nameTxtField.setEditable(false);
	nameTxtField.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	nameTxtField.setForeground(new Color(165, 42, 42));
	nameTxtField.setColumns(10);
	nameTxtField.setBounds(277, 123, 139, 25);
	P1.add(nameTxtField);

	QnTxtField = new JTextField();
	QnTxtField.setEditable(false);
	QnTxtField.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	QnTxtField.setForeground(new Color(72, 61, 139));
	QnTxtField.setColumns(10);
	QnTxtField.setBounds(277, 161, 221, 25);
	P1.add(QnTxtField);

	ansTxtField = new JTextField();
	ansTxtField.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	ansTxtField.setForeground(new Color(205, 92, 92));
	ansTxtField.setColumns(10);
	ansTxtField.setBounds(277, 193, 139, 25);
	P1.add(ansTxtField);

	PassTxtField = new JTextField();
	PassTxtField.setEditable(false);
	PassTxtField.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	PassTxtField.setForeground(new Color(50, 205, 50));
	PassTxtField.setColumns(10);
	PassTxtField.setBounds(277, 225, 139, 25);
	P1.add(PassTxtField);
        
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/forgotpassword.jpg"));
        Image i1 = c1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel l6 = new JLabel(i2);
        l6.setBounds(580, 70, 200, 200);
        add(l6);

	btnSearch = new JButton("Search");
	btnSearch.addActionListener(this);
	btnSearch.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	btnSearch.setBounds(428, 83, 90, 31);
	btnSearch.setBackground(new Color(247, 243, 176));
        btnSearch.setForeground(Color.BLACK);
        P1.add(btnSearch);

	btnRetieve = new JButton("Retrieve");
	btnRetieve.addActionListener(this);
	btnRetieve.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	btnRetieve.setBounds(426, 188, 95, 31);
	btnRetieve.setBackground(new Color(247, 243, 176));
        btnRetieve.setForeground(Color.BLACK);
	P1.add(btnRetieve);

	btnBack = new JButton("Back");
	btnBack.addActionListener(this);
	btnBack.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	btnBack.setBounds(233, 270, 101, 31);
        btnBack.setBackground(new Color(247, 243, 176));
        btnBack.setForeground(Color.BLACK);
	P1.add(btnBack);
        
	JPanel panel = new JPanel();
	panel.setBounds(47, 45, 508, 281);
        panel.setBackground(new Color(182, 222, 250));
	P1.add(panel);
    }
    
    public void actionPerformed(ActionEvent ae){        
        
        try{            
            Conn con = new Conn();
                
            if(ae.getSource() == btnSearch){
                String sql = "select * from account where username=?";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, userNameTxtField.getText());
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
                    nameTxtField.setText(rs.getString("name"));
                    QnTxtField.setText(rs.getString("question"));
		}

            }
            if(ae.getSource() == btnRetieve){
                String sql = "select * from account where answer=?";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, ansTxtField.getText());
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
                    	PassTxtField.setText(rs.getString("password"));
		}

            }
            if(ae.getSource() == btnBack){
                this.setVisible(false);
		new Login().setVisible(true);
			
            }
            
        }catch(Exception e){
            
        }
    }

}