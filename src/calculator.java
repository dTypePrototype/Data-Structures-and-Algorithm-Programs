import java.awt.event.*;
import javax.swing.*;
public class calculator {
	public static void main(String[] args) {
		JFrame f=new JFrame("CALCULATOR");
		JTextField inputEdit1=new JTextField();
		inputEdit1.setBounds(50,50,150,20);
		JTextField inputEdit2=new JTextField();
		inputEdit2.setBounds(50,100,150,20);
		JButton addButt= new JButton("+");
		addButt.setBounds(50,150,50,50);
		JButton subButt= new JButton("-");
		subButt.setBounds(120,150,50,50);
		JLabel output = new JLabel("");
		output.setBounds(50,200,50,50);

		addButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a= Integer.parseInt(inputEdit1.getText().toString());
				int b= Integer.parseInt(inputEdit2.getText().toString());
				int res= a+b;
				String s= String.valueOf(res);
				output.setText(s);
				
					
				
			}
		});
		subButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a= Integer.parseInt(inputEdit1.getText().toString());
				int b= Integer.parseInt(inputEdit2.getText().toString());
				int res= a-b;
				String s= String.valueOf(res);
				output.setText(s);
				
					
				
			}
		});
		f.add(output);
		f.add(addButt);
		f.add(subButt);
		f.add(inputEdit1);
		f.add(inputEdit2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
