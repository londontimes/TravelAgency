/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelagency;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About() {

        setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setTitle("About");
        setLayout(null);
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 430, 120, 20);
        b1.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        b1.addActionListener(this);

        Font f = new Font("SAN_SERIF", Font.PLAIN, 40);
        setFont(f);

        s = "                                    About Projects          \n  "
                + "\nThe objective of this Travel Agency and Tourism Management System"
                + " is to develop a system that automates the processes "
                + "of activities of a travel and the purpose is to design a "
                + "system which one can perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this application. The travel agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:"
                + "\nGives proper information"
                + "\nSimplifies the manual work"
                + "\nIt minimizes the documentation related work"
                + "\nProvides up to date information"
                + "\nFriendly Environment by providing warning messages."
                + "\ntravelers details can be provided"
                + "\nbooking confirmation notification"
                ;

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        t1.setBounds(20, 100, 450, 300);

        add(t1);

        Font f1 = new Font("SAN_SERIF", Font.PLAIN, 18);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
        t1 = new TextArea();

        JLabel l1 = new JLabel("About Project");
        add(l1);
        l1.setBounds(170, 10, 180, 80);
        l1.setFont(new Font("SAN_SERIF", Font.PLAIN, 28));
        l1.setForeground(Color.red);

        Font f2 = new Font("SAN_SERIF", Font.PLAIN, 18);
        l1.setFont(f2);

        setBounds(700, 220, 500, 550);

        setLayout(null);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String args[]) {
        new About().setVisible(true);
    }

}
