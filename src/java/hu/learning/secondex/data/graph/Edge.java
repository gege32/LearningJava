package hu.learning.secondex.data.graph;


import hu.learning.secondex.data.graph.Node;

public class Edge {
	
	public Edge(Node beginNode, Node endNode, int thickness) {
	
	}
	
	static Edge edge1 = new Edge(Node.node1, Node.node2, 1);
	static Edge edge2 = new Edge(Node.node2, Node.node5, 1);
	static Edge edge3 = new Edge(Node.node3, Node.node6, 1);
	static Edge edge4 = new Edge(Node.node3, Node.node4, 1);
	static Edge edge5 = new Edge(Node.node4, Node.node6, 1);
	static Edge edge6 = new Edge(Node.node5, Node.node6, 1);
	
	
}