import javax.swing.*;
import java.awt.*;
public class SwingDemo {
	SwingDemo(){
		JFrame jfrm = new JFrame("A Simple Application");
		JButton buttonSave, buttonExit;
		buttonSave= new JButton("Save");
		buttonExit= new JButton("Exit");
		JLabel jlab= new JLabel("Swing means powerful GUIs.");
		jfrm.setLayout(new FlowLayout());
		jfrm.add(jlab);
		jfrm.add(buttonSave);
		jfrm.add(buttonExit);
		
		jfrm.setSize(500, 100);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jfrm.setVisible(true);		
	}

}

