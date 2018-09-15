import javax.swing.*;
import java.awt.*;
public class Example{
	public static void main(String args[]){
		JFrame jf= new JFrame("App");
		JButton b1= new JButton("Save");
		JLabel jlb= new JLabel("GUI's of Swing");
		jf.setLayout(new FlowLayout());
		jf.add(jlb);
		jf.add(b1);
		
		jf.setSize(500,100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	
}