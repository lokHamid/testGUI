package testingGUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;


public class ButtonsGrid extends JPanel implements MouseListener{
	public static ArrayList<Graph> all_graphs = new ArrayList<Graph>();
	
	private static final long serialVersionUID = 1L;
	private static final int SCREEN_WIDTH = 300;
	private static final int SCREEN_HEIGHT = 300;
	private boolean clicked=false;
	public static String highlighted_graph_buffer= null;
	JLabel graph_treeTEXT;
	public ButtonsGrid(){ ///Constructor.
		graph_treeTEXT = new JLabel();
		graph_treeTEXT.addMouseListener(this);
		graph_treeTEXT.setVisible(false);
		
		this.add(graph_treeTEXT);
		this.setLayout(new FlowLayout());
		this.setSize(new Dimension(SCREEN_HEIGHT,SCREEN_WIDTH));
		this.setBackground(Color.white);
		this.setVisible(true);
	}

	

	@Override
	public void mouseClicked(MouseEvent e) {
		clicked = !clicked;
		graph_treeTEXT.setForeground(clicked ? Color.GRAY : Color.BLACK);
		DrawGrid.graphHighlighted = !DrawGrid.graphHighlighted;
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void popupNewgraph() {
		JDialog dialog = new JDialog();
		JTextField field = new JTextField(20);
		JButton create = new JButton("Create");
		JCheckBox directed = new JCheckBox("directed graph");
		JCheckBox weighted = new JCheckBox("weighted graph");
		
		directed.addItemListener(new ItemListener() {
			public boolean isDirected;
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					isDirected = true;
				}else {
					isDirected = false;
				}
				
			}
		});
		
		weighted.addItemListener(new ItemListener() {
			public boolean weighted;
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					weighted = true;
				}else {
					weighted = false;
				}
				
			}
		});
		
		//***********************************************
		create.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				if(text != null) {
					dialog.dispose();
				}
				
			}
		});
		//************************************************
		dialog.add(directed);
		dialog.add(weighted);
		dialog.add(field);
		dialog.add(create);
		dialog.setLayout(new FlowLayout());
		dialog.setSize(300,200);
		dialog.setTitle("create new graph");
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
		dialog.setModal(true);
	}
	
	

}
