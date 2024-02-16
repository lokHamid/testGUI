package testingGUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame f=new JFrame("Button Example");  
	    JButton b=new JButton("Click Here");  
	    JLabel label1 = new JLabel();
	    label1.setText("test");
	    label1.setBounds(100, 20, 100, 100);
	    b.setBounds(100,100,95,30); 
	    b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	    f.add(b);  
	    f.add(label1);
	    JPanel panel = new JPanel();
	    panel.setSize(200, 200);
	    f.add(panel);
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);
	}

}
