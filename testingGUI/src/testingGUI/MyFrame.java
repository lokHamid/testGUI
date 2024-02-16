package testingGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame() {
        // Set up the JFrame
        setTitle("Button Example");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JButton
        JButton myButton = new JButton("Click Me");
        
        myButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("button clicked");
			}
		});

        // Add the button to the JFrame
        add(myButton);

        // Set layout manager (optional, default is BorderLayout)
        // setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        // Create an instance of your JFrame subclass
        MyFrame myFrame = new MyFrame();

        // Make the frame visible
        myFrame.setVisible(true);
    }
}