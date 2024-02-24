package testingGUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonsGrid extends JPanel {
	private static final long serialVersionUID = 1L;
	private static final int SCREEN_WIDTH = 300;
	private static final int SCREEN_HEIGHT = 300;
	
	
	public ButtonsGrid(){
		JMenuBar menuBar = new JMenuBar();
		
		JMenu new_menu = new JMenu("New");
		JMenu edit_menu = new JMenu("Edit");
		JMenu help_menu = new JMenu("Help");
		JMenu file_menu = new JMenu("File");
		
		//new Menu items: 
		JMenuItem graph_item = new JMenuItem("Graph");
		JMenuItem tree_item = new JMenuItem("Tree");
		new_menu.add(graph_item);
		new_menu.add(tree_item);
		//file menu items:
		JMenuItem load_item = new JMenuItem("Load");
		JMenuItem save_item = new JMenuItem("Save");
		file_menu.add(load_item);
		file_menu.add(save_item);
		
		menuBar.add(new_menu);
		menuBar.add(file_menu);
		menuBar.add(help_menu);
		menuBar.add(edit_menu);
		this.add(menuBar);
		this.setSize(new Dimension(SCREEN_HEIGHT,SCREEN_WIDTH));
		this.setBackground(Color.white);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
	}
	
	

}
