package testingGUI;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.*;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public MainFrame() {
		this.setVisible(true);
		this.setTitle("Graph Manipulator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JSplitPane splitter = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		
		//all panels added:
		splitter.setLeftComponent(new ButtonsGrid());
		splitter.setRightComponent(new DrawGrid());
		splitter.setDividerLocation(300);
		this.add(splitter);
		
		
		
		/////////////////////////////////////////////////////
		this.setResizable(true);
		this.setLayout(new GridLayout());
		this.pack();
		
    }
}