
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{

	private JPanel panel;
	private JTextField textField;
	private JPasswordField passwordField;
        private JButton btnlogin,btnSignUp,btnForgotPass;


	public Login() {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Login");
            
	setBackground(new Color(132, 195, 240));	
        setBounds(550, 250, 700, 400);
		
        panel = new JPanel();
	panel.setBackground(Color.WHITE);
	setContentPane(panel);
	panel.setLayout(null);

	JLabel l1 = new JLabel("Username: ");
        l1.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	l1.setBounds(120, 92, 95, 24);
	panel.add(l1);

	JLabel l2 = new JLabel("Password: ");
        l2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	l2.setBounds(120, 127, 95, 24);
	panel.add(l2);

	textField = new JTextField();
	textField.setBounds(210, 93, 157, 30);
	panel.add(textField);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(210, 128, 157, 30);
	panel.add(passwordField);

	JLabel l3 = new JLabel("");
	l3.setBounds(377, 79, 46, 34);
	panel.add(l3);

	JLabel l4 = new JLabel("");
	l4.setBounds(377, 124, 46, 34);
	panel.add(l3);

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/login.png"));
        Image i1 = c1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1); 
        JLabel l6 = new JLabel(i2);
        l6.setBounds(480, 100, 150, 150);
        add(l6);
        
        
	btnlogin = new JButton("Login");
	btnlogin.addActionListener(this);      
	btnlogin.setForeground(new Color(139, 69, 19));
        btnlogin.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	btnlogin.setBackground(new Color(255, 235, 205));
	btnlogin.setBounds(149, 181, 113, 30);
	panel.add(btnlogin);
		
        btnSignUp = new JButton("SignUp");
	btnSignUp.addActionListener(this);
	
	btnSignUp.setForeground(new Color(139, 69, 19));
	btnSignUp.setBackground(new Color(255, 235, 205));
        btnSignUp.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	btnSignUp.setBounds(289, 181, 113, 30);
	panel.add(btnSignUp);

	btnForgotPass = new JButton("Forgot Password");
	btnForgotPass.addActionListener(this);
	
        btnForgotPass.setForeground(new Color(205, 92, 92));
	btnForgotPass.setBackground(new Color(253, 245, 230));
        btnForgotPass.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	btnForgotPass.setBounds(199, 231, 179, 25);
	panel.add(btnForgotPass);

	JLabel l5 = new JLabel("Trouble in Login?");
	l5.setFont(new Font("SAN_SERIF", Font.PLAIN, 15));
	l5.setForeground(new Color(255, 0, 0));
	l5.setBounds(70, 235, 130, 20);
	panel.add(l5);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(182, 222, 250));
        panel2.setBounds(24, 40, 434, 263);
        panel.add(panel2);
	}
        
       
        
        public void actionPerformed(ActionEvent ae){
            
         if(ae.getSource() == btnlogin){
                Boolean status = false;
		try {
                    Conn con = new Conn();
                    String sql = "select * from account where username=? and password=?";
                    PreparedStatement st = con.c.prepareStatement(sql);

                    st.setString(1, textField.getText());
                    st.setString(2, passwordField.getText());

                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        this.setVisible(false);
                        //new Loading(textField.getText()).setVisible(true);
                        new Dashboard(textField.getText()).setVisible(true);
                    } else
			JOptionPane.showMessageDialog(null, "Invalid Login or Password!");
                       
		} catch (Exception e2) {
                    e2.printStackTrace();
		}
            }
            if(ae.getSource() == btnSignUp){
                setVisible(false);
		Signup su = new Signup();
		su.setVisible(true);
            }   
            if(ae.getSource() == btnForgotPass){
                setVisible(false);
		ForgotPassword forgot = new ForgotPassword();
		forgot.setVisible(true);
            }
        }
        
  	public static void main(String[] args) {
                new Login().setVisible(true);
	}

}
