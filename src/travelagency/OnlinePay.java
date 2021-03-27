
package travelagency;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class OnlinePay extends JFrame implements Runnable{

    private WebEngine webEngine;
    private JFXPanel panel;
    
    public void run() {
        
        setTitle("Search");
        setVisible(true);
        setBounds(450,100,900, 900);
        
        panel = new JFXPanel();
        add(panel);
        
        Platform.runLater(() -> {
            WebView view = new WebView();
            view.getEngine().load("https://google.com");

            panel.setScene(new Scene(view));
            setDefaultCloseOperation(HIDE_ON_CLOSE);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new OnlinePay());    
    }

}
