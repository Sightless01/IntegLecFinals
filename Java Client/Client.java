import hangman.*;           
import org.omg.CosNaming.*;  
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;      
import java.util.*;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.*;
import java.applet.Applet;


public class Client {	
  public static void main(String args[]) {
    String name = "";
    String word = "";
	String name_service="hangman";

    try{
      
      ORB orb = ORB.init(args, null); 
      org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

      NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef); 
      	     
      NameComponent nc = new NameComponent(name_service, "");
      NameComponent path[] = {nc};
      Hangman hangman = HangmanHelper.narrow(ncRef.resolve(path));
      
	  do {
		JPanel panel = new JPanel(new BorderLayout());
		JLabel jUserName = new JLabel("User Name");
        JTextField username = new JTextField();
		panel.add(jUserName, BorderLayout.NORTH);
		panel.add(username, BorderLayout.SOUTH);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
        int result = JOptionPane.showConfirmDialog(null, panel, "Login", JOptionPane.OK_CANCEL_OPTION);
 
        if (result == JOptionPane.OK_OPTION) {
            name = username.getText();
			word = hangman.startGame(name);
			if(word.equals("Player Already exists.")){
				String message = "Ooops!Player Already exists.";
                JOptionPane.showMessageDialog(new JFrame(), message, "Error",
                JOptionPane.ERROR_MESSAGE);
			}
		} else if (result == JOptionPane.CANCEL_OPTION){
			System.exit(0);
		}
      } while(word.equals("Player Already exists."));
      HangmanUI hangmanUI = new HangmanUI(hangman, name, word);
      hangmanUI.setLocationRelativeTo(null);
      hangmanUI.setResizable(false);
      hangmanUI.setVisible(true);     
    }catch(Exception e)
    {
    }
  }
}


