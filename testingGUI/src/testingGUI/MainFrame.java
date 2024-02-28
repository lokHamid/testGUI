package testingGUI;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.*;
import javax.swing.border.Border;

public class MainFrame extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	JMenuItem load_item;
	JMenuItem save_item;
	JMenuItem graph_item;
	JMenuItem tree_item;
	
	public MainFrame() {
		JPanel panel = new JPanel(new BorderLayout());
		JSplitPane splitter = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		
		//all panels added:
		splitter.setLeftComponent(new ButtonsGrid());
		splitter.setRightComponent(new JScrollPane(new DrawGrid()));
		splitter.setDividerLocation(100);
		splitter.setLastDividerLocation(100 + 200);
		
		panel.add(splitter,BorderLayout.CENTER);
		panel.add(retrieveMenuBar(),BorderLayout.NORTH);
		
		
		/////////////////////////////////////////////////////;
		this.add(panel); // container panel for all components
		this.setVisible(true);
		this.setTitle("Graph Manipulator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLayout(new FlowLayout());
		this.pack();
		
    }
	
	
	
	
	private JMenuBar retrieveMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		
		JMenu new_menu = new JMenu("New");
		JMenu edit_menu = new JMenu("Edit");
		JMenu help_menu = new JMenu("Help");
		JMenu file_menu = new JMenu("File");
		
		//new Menu items: 
		graph_item = new JMenuItem("Graph");
		tree_item = new JMenuItem("Tree");
		//action listeners:
		graph_item.addActionListener(this);
		tree_item.addActionListener(this);
		new_menu.add(graph_item);
		new_menu.add(tree_item);
		//file menu items:
		load_item = new JMenuItem("Load");
		save_item = new JMenuItem("Save");
		//action listeners : 
		load_item.addActionListener(this);
		save_item.addActionListener(this);
		
		file_menu.add(load_item);
		file_menu.add(save_item);
		menuBar.add(new_menu);
		menuBar.add(file_menu);
		menuBar.add(help_menu);
		menuBar.add(edit_menu);
		
		return menuBar;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == load_item) {
			//load item.
		}else if(e.getSource() == save_item) {
			//save item.
		}else if(e.getSource() == graph_item) {
			ButtonsGrid.popupNewgraph();
			//create new graph.
		}else if(e.getSource() == tree_item) {
			//create new tree.
		}
		
	}

	
	
	
}