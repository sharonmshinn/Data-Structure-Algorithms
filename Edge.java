//import java.util.*;

// Edge between two nodes
public class Edge {
	
	int dist;
	Node tail;
	Node head;
	//implemented a classification variable for DelivB
	String classification;
	
	public Edge( Node tailNode, Node headNode, int dist) {
		setDist( dist );
		setTail( tailNode );
		setHead( headNode );
		//Classification set to an empty String
		classification = "";
	}
	
	//Implemented a getter for classification
	public String getClassification() {
		return classification;
	}
	
	public Node getTail() {
		return tail;
	}
	
	public Node getHead() {
		return head;
	}
	
	public int getDist() {
		return dist;
	}
	
	//implemented a setter for classification
	public void setClassification(String theClass) {
		classification = theClass;
	}
	
	public void setTail( Node n ) {
		tail = n;
	}
	
	public void setHead( Node n ) {
		head = n;
	}
	
	public void setDist( int i ) {
		dist = i;
	}
	
	//implemented a toString to print the edge's tail and head with its classification
	public String toString() {
		String output = "";
		output += this.getTail().getAbbrev() + "->" + this.getHead().getAbbrev() + "\t" + this.getClassification();
		return output;
	}
}
