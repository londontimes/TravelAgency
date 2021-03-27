
package travelagency;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckHotels extends JFrame implements Runnable {

    JLabel l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16;
    JLabel caption;
    Thread th;

    public void run() {
        try {

            l2.setVisible(true);
            caption.setText("Royal Tulip Sea Pearl Beach Resort & Spa");
            l2.add(caption);
            Thread.sleep(2000);
            l2.setVisible(false);
            
            l3.setVisible(true);
            caption.setText("Long Beach Hotel");
            l3.add(caption);
            l3.setVisible(true);
            Thread.sleep(2000);
            l3.setVisible(false);
            
            l4.setVisible(true);
            caption.setText("Seagull Hotel");
            l4.add(caption);
            Thread.sleep(2000);
            l4.setVisible(false);
            
            l5.setVisible(true);
            caption.setText("Sayeman Beach Resort");
            l5.add(caption);
            Thread.sleep(2000);
            l5.setVisible(false);
            
            l6.setVisible(true);
            caption.setText("Hotel Sea Crown");
            l6.add(caption);
            Thread.sleep(2000);
            l6.setVisible(false);
          
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public CheckHotels() {
        
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setTitle("Hotel Pictures");

        setBounds(580, 220, 900, 700);
        getContentPane().setBackground(new Color(220, 250, 250));
        
        th = new Thread(this);
    
        caption = new JLabel();
        caption.setBounds(50, 550, 1000, 70);
        caption.setForeground(Color.WHITE);
        caption.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        add(caption);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/hotel1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 700);
        add(l2);

        setLayout(null);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/hotel2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i4);
        l3.setBounds(0, 0, 900, 700);
        add(l3);
        l3.setVisible(false);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/hotel3.jpg"));
        Image i8 = i7.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(0, 0, 900, 700);
        add(l4);
        l4.setVisible(false);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/hotel4.jpg"));
        Image i11 = i10.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(0, 0, 900, 700);
        add(l5);
        l5.setVisible(false);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/hotel5.jpg"));
        Image i14 = i13.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(0, 0, 900, 700);
        add(l6);
        l6.setVisible(false);

        th.start();

    }

    public static void main(String args[]) {
        new CheckHotels().setVisible(true);

    }

}
