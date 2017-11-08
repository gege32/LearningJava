package hu.learning.secondex.data.graph;

import java.util.ArrayList;
import java.util.List;
import hu.learning.secondex.data.graph.Edge;
import hu.learning.secondex.data.graph.Node;

public class Graph {
	
	List<Edge> edgesList;
	List<Node> nodesList;
	
	public boolean isCompleteGraph(){
		List<Node> nodesList = new ArrayList<Node>();
		nodesList.add(Node.node1);
		nodesList.add(Node.node2);
		nodesList.add(Node.node3);
		nodesList.add(Node.node4);
		nodesList.add(Node.node5);
		nodesList.add(Node.node6);
		int nodeN = nodesList.size();
		List<Edge> edgesList = new ArrayList<Edge>();
		edgesList.add(Edge.edge1);
		edgesList.add(Edge.edge2);
		edgesList.add(Edge.edge3);
		edgesList.add(Edge.edge4);
		edgesList.add(Edge.edge5);
		edgesList.add(Edge.edge6);
		int edgeN = edgesList.size();
		if (((nodeN * (nodeN-1))/2 == edgeN)){
			return true;
		}
		return false;
	}
}

	

