
package travelagency;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class CheckPackage extends JFrame{
    public static void main(String[] args) {
        
      new CheckPackage().setVisible(true);
      
    }

    CheckPackage() {   
        
      setDefaultCloseOperation(HIDE_ON_CLOSE);
      setBounds(550, 220, 900, 600);  
      setVisible(true);
      String[] package1 = new String[]{"package1.jpg","GOLD PACKAGE","6 days and 7 Nights", "Free wifi", "Half Day City Tour", "Drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "English Speaking Guide", "", "Summer Special", "TK 20000 only"};
      String[] package2 = new String[]{"package2.jpg","SILVER PACKAGE","4 days and 5 Nights", "Free Wifi", "Amaiging hotel view", "Drinks on Arrival", "Night Safari", "Stay in 5 Star Hotel", "Boat with Dinner", "", "Winter Special", "Tk 15000 only"};
      String[] package3 = new String[]{"package3.jpg","BRONZE PACKAGE","2 days and 3 Nights", "Free wifi", "Free Horse Riding & other Games", "Drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "", "Winter Special", "TK 10000 only"};
      
      JTabbedPane tabbedPane = new JTabbedPane();
      JPanel p1 = createPackage(package1);
      p1.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
      tabbedPane.addTab("Package 1", null, p1);
      
      JPanel p2 = createPackage(package2);
      p2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
      tabbedPane.addTab("Package 2", null, p2);
      
      JPanel p3 = createPackage(package3);
      p3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
      tabbedPane.addTab("Package 3", null, p3);
      
      add(tabbedPane, BorderLayout.CENTER);    
   }
    
    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
      
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/"+pack[0]));
        Image i3 = i1.getImage().getScaledInstance(550, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel limg = new JLabel(i2);
        limg.setBounds(400,0,450,420);
        p1.add(limg);

        JLabel l1 = new JLabel(pack[1]);
        l1.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l1.setBounds(50, 5, 350, 53);
        p1.add(l1);

        JLabel l2 = new JLabel(pack[2]);
        l2.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l2.setForeground(Color.RED);
        l2.setBounds(35, 70, 200, 21);
        p1.add(l2);

        JLabel l4 = new JLabel(pack[3]);
        l4.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l4.setForeground(Color.BLUE);
        l4.setBounds(35, 110, 200, 14);
        p1.add(l4);

        JLabel l3 = new JLabel(pack[4]);
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l3.setForeground(Color.RED);
        l3.setBounds(35, 150, 200, 14);
        p1.add(l3);

        JLabel l5 = new JLabel(pack[5]);
        l5.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l5.setForeground(Color.BLUE);
        l5.setBounds(35, 190, 200, 14);
        p1.add(l5);

        JLabel l6 = new JLabel(pack[6]);
        l6.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l6.setForeground(Color.RED);
        l6.setBounds(35, 230, 200, 14);
        p1.add(l6);

        JLabel l7 = new JLabel(pack[7]);
        l7.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l7.setForeground(Color.BLUE);
        l7.setBounds(35, 270, 200, 14);
        p1.add(l7);

        JLabel l8 = new JLabel(pack[8]);
        l8.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l8.setForeground(Color.RED);
        l8.setBounds(35, 310, 200, 14);
        p1.add(l8);

        JLabel l9 = new JLabel(pack[9]);
        l9.setForeground(Color.BLUE);
        l9.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l9.setBounds(35, 400, 200, 30);
        p1.add(l9);

        JLabel l10 = new JLabel(pack[10]);
        l10.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l10.setBounds(35, 460, 400, 40);
        p1.add(l10);
        
        JLabel l11 = new JLabel(pack[11]);
        l11 .setForeground(Color.RED);
        l11 .setFont(new Font("SAN_SERIF", Font.PLAIN, 28));
        l11 .setBounds(600, 460, 400, 40);
        p1.add(l11 );
        
        return p1;
    }
}

