
package travelagency;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Signup extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField userNameJTextField;
    private JTextField nameJTextField;
    private JPasswordField passwordJTextField;
    private JTextField answerJTextField;
    private JButton btnCreate, btnBack;
    private JComboBox comboBox;


    public static void main(String[] args) {
        new Signup().setVisible(true);
    }

    public Signup() {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Sign Up");
        
        setBounds(600, 250, 700, 406);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JLabel lblUsername = new JLabel("Username :");
	lblUsername.setForeground(Color.DARK_GRAY);
	lblUsername.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	lblUsername.setBounds(99, 86, 92, 30);
	contentPane.add(lblUsername);

	JLabel lblName = new JLabel("Name :");
	lblName.setForeground(Color.DARK_GRAY);
	lblName.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	lblName.setBounds(99, 123, 92, 30);
	contentPane.add(lblName);

	JLabel lblPassword = new JLabel("Password :");
	lblPassword.setForeground(Color.DARK_GRAY);
	lblPassword.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	lblPassword.setBounds(99, 160, 92, 30);
	contentPane.add(lblPassword);

	JLabel lblAnswer = new JLabel("Answer :");
	lblAnswer.setForeground(Color.DARK_GRAY);
	lblAnswer.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	lblAnswer.setBounds(99, 234, 92, 30);
	contentPane.add(lblAnswer);

	comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "Your NickName?", "Your Lucky Number?",
			"Your child SuperHero?", "Your childhood Name ?" }));
        comboBox.setFont(new Font("SAN_SERIF",Font.PLAIN,14));
	comboBox.setBounds(265, 202, 148, 25);
	contentPane.add(comboBox);

	JLabel lblSecurityQuestion = new JLabel("Security Question :");
	lblSecurityQuestion.setForeground(Color.DARK_GRAY);
	lblSecurityQuestion.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
	lblSecurityQuestion.setBounds(99, 197, 140, 30);
	contentPane.add(lblSecurityQuestion);
        
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/signup.png"));
        Image i1 = c1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel l6 = new JLabel(i2);
        l6.setBounds(460, 70, 200, 200);
        add(l6);

        userNameJTextField = new JTextField();
	userNameJTextField.setBounds(265, 91, 148, 25);
	contentPane.add(userNameJTextField);
	userNameJTextField.setColumns(10);

	nameJTextField = new JTextField();
	nameJTextField.setColumns(10);
	nameJTextField.setBounds(265, 128, 148, 25);
	contentPane.add(nameJTextField);

        passwordJTextField = new JPasswordField();
	passwordJTextField.setColumns(10);
	passwordJTextField.setBounds(265, 165, 148, 25);
	contentPane.add(passwordJTextField);

	answerJTextField = new JTextField();
	answerJTextField.setColumns(10);
	answerJTextField.setBounds(265, 239, 148, 25);
	contentPane.add(answerJTextField);

	btnCreate = new JButton("Create");
	btnCreate.addActionListener(this);
	btnCreate.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
	btnCreate.setBounds(140, 289, 100, 30);
        btnCreate.setBackground(Color.BLACK);
        btnCreate.setForeground(Color.WHITE);
	contentPane.add(btnCreate);

	btnBack = new JButton("Back");
	btnBack.addActionListener(this);
	btnBack.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
	btnBack.setBounds(300, 289, 100, 30);
	btnBack.setBackground(Color.BLACK);
        btnBack.setForeground(Color.WHITE);
	contentPane.add(btnBack);

	JPanel panel = new JPanel();
	panel.setForeground(new Color(34, 139, 34));
	panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 0), 2), "Create-Account",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
	panel.setBounds(31, 30, 640, 310);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
          
            Conn con = new Conn();
            
            if(ae.getSource() == btnCreate)
                {                   
                    String sql = "insert into account(username, name, password, question, answer) values(?, ?, ?, ?, ?)";
                    PreparedStatement st = con.c.prepareStatement(sql);

                    st.setString(1, userNameJTextField.getText());
                    st.setString(2, nameJTextField.getText());
                    st.setString(3, passwordJTextField.getText());
                    st.setString(4, (String) comboBox.getSelectedItem());
                    st.setString(5, answerJTextField.getText());

                    int i = st.executeUpdate();
                    if (i > 0){
                        JOptionPane.showMessageDialog(null ,"Account Created Successfully ");
                    }

                    userNameJTextField.setText("");
                    nameJTextField.setText("");
                    passwordJTextField.setText("");
                    answerJTextField.setText("");
            }
            
            if(ae.getSource() == btnBack){
                this.setVisible(false);
                new Login().setVisible(true);
			
            }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,"User Name Already Exits.");
        }
    }
}
