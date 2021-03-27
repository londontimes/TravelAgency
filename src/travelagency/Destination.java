
package travelagency;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Destination extends JFrame implements Runnable {

    JLabel l1, l2, l3, l4, l5, l6, l12, l13;
    Thread th;

    public void run() {
        try {

            l2.setVisible(true);
            Thread.sleep(2000);
            l2.setVisible(false);
            l3.setVisible(true);
            l3.setVisible(true);
            Thread.sleep(2000);
            l3.setVisible(false);
            l4.setVisible(true);
            Thread.sleep(2000);
            l4.setVisible(false);
            l5.setVisible(true);
            Thread.sleep(2000);
            l5.setVisible(false);
            l6.setVisible(true);
            Thread.sleep(2000);
            l6.setVisible(false);
            
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public Destination() {
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setTitle("Destination");
        setBounds(580, 220, 900, 700);
        getContentPane().setBackground(new Color(220, 250, 250));
        
        th = new Thread(this);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/dest1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 700);
        add(l2);

        setLayout(null);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/dest2.png"));
        Image i5 = i4.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i4);
        l3.setBounds(0, 0, 900, 700);
        add(l3);
        l3.setVisible(false);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/dest3.jpg"));
        Image i8 = i7.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(0, 0, 900, 700);
        add(l4);
        l4.setVisible(false);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/dest4.jpg"));
        Image i11 = i10.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(0, 0, 900, 700);
        add(l5);
        l5.setVisible(false);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("travelagency/icons/dest5.jpg"));
        Image i14 = i13.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(0, 0, 900, 700);
        add(l6);
        l6.setVisible(false);

        th.start();

    }

    public static void main(String args[]) {
        new Destination().setVisible(true);

    }

}
