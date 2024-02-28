package testingGUI;

import java.awt.Point;
import java.util.ArrayList;

public class Graph {
	String name;
	boolean directed , weighted;
	ArrayList<Point> nodes = new ArrayList<Point>();
	ArrayList<Edge> edges = new ArrayList<Edge>();
	AdjacencyMatrix adjMat;
	
}
