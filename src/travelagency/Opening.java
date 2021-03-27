
package travelagency;

import javax.swing.JFrame;


public class Opening {
    
    public static void main(String[] args) {

        OpeningFrame f1 = new OpeningFrame();
        f1.setVisible(false); 
    } 
}

class OpeningFrame extends JFrame  {
   
    public OpeningFrame() {
        new Login().setVisible(true);
 
    }
}
