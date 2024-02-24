package testingGUI;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class DrawGrid extends JPanel implements MouseListener{
	private static final long serialVersionUID = 1L;
	private static final int SCREEN_WIDTH = 1500;
	private static final int SCREEN_HEIGHT = 1000;
	private static final int NODE_SIZE = 50;
	//private static final int TOTAL_NUM_OF_NODES = (SCREEN_WIDTH * SCREEN_HEIGHT)/NODE_SIZE;
	int clickX;
	int clickY;
	ArrayList<Point> nodes = new ArrayList<Point>();
	boolean clicked = false;
	
	public DrawGrid(){
		this.setPreferredSize(new Dimension(SCREEN_HEIGHT,SCREEN_WIDTH));
		this.setVisible(true);
		this.setBackground(Color.BLACK);
		this.addMouseListener(this);
		this.setLayout(new FlowLayout());
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawGrid(g);
		if(clicked) {
			drawNode(g);
		}
	}
	//drawing the grid;
	public void drawGrid(Graphics g) {
		for(int i=0;i<SCREEN_HEIGHT;i++) {
			g.drawLine(i*NODE_SIZE, 0, i*NODE_SIZE,SCREEN_HEIGHT);
			g.drawLine(0,i*NODE_SIZE, SCREEN_WIDTH, i*NODE_SIZE);
		}
		JLabel box = new JLabel();
		box.setBackground(Color.BLACK);
		box.addMouseListener(this);
		box.setBounds(0,0,NODE_SIZE,NODE_SIZE);
		this.add(box);
	}
	//drawing the node:
	public void drawNode(Graphics g) {
		Graphics2D g2D = (Graphics2D)g;
		g2D.setColor(Color.white);
		for(Point element : nodes) {
			g2D.drawOval((int)element.getX()*NODE_SIZE, (int)element.getY()*NODE_SIZE, NODE_SIZE, NODE_SIZE);
		}
		clicked = false;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		clicked = true;
		clickX = e.getX() / NODE_SIZE;
		clickY = e.getY() / NODE_SIZE;
		nodes.add(new Point(clickX,clickY));
//		System.out.println("clicked at (" + clickX + " , " + clickY + ")");
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
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}
