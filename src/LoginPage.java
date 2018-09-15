import java.awt.event.*;
import javax.swing.*;
public class LoginPage {
	public static void main(String[] args) {
		String username="admin";
		String password="123abc";
		JFrame f=new JFrame("Login");
		JLabel head=new JLabel("Login");
		head.setBounds(100,50,150,20);
		JLabel userLabel=new JLabel("Username:");
		userLabel.setBounds(50,100,150,20);
		JTextField tf=new JTextField();
		tf.setBounds(50,130,150,20);
		JLabel passwdLabel=new JLabel("Password:");
		passwdLabel.setBounds(50,170,150,20);
		JPasswordField pwdf=new JPasswordField();
		pwdf.setBounds(50,200,150,20);
		JButton b=new JButton("Done");
		b.setBounds(75,250,95,30);		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((tf.getText().toString()).equals(username)){
					if((pwdf.getText().toString()).equals(password)) {
						JFrame f1=new JFrame(tf.getText().toString());
						JLabel popupText= new JLabel("You have successfully logged in!");
						popupText.setBounds(50,50,200,20);
						f1.setSize(400,400);
						f1.add(popupText);
						f1.setLayout(null);
						f1.setVisible(true);
					}
					
				}
			}
		});
		f.add(b);
		f.add(head);
		f.add(userLabel);
		f.add(passwdLabel);
		f.add(tf);
		f.add(pwdf);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
