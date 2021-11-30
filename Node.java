import java.util.*;

// A node of a graph for the Spring 2018 ICS 340 program

public class Node{

	String name;
	String val;  // The value of the Node
	String abbrev;  // The abbreviation for the Node
	ArrayList<Edge> outgoingEdges;  
	ArrayList<Edge> incomingEdges;
	//implemented color variable
	String color;
	//implemented discovery time
	int discovery;
	//implemented finishing time
	int finish;
	//implemented previous/parent node
	Node previous;
	
	
	//create variables for colors and start/finish times
	public Node( String theAbbrev ) {
		setAbbrev( theAbbrev );
		val = null;
		name = null;
		outgoingEdges = new ArrayList<Edge>();
		incomingEdges = new ArrayList<Edge>();
		//color set as WHITE to show that it has not been discovered yet to start
		color = "WHITE";
		//both discovery and finish time at 0 to start
		discovery = 0;
		finish = 0;
		//null previous/parent node to start
		previous = null;
	}
	
	//implemented an equals function to determine if the names are equal
	public boolean equals(Node other) {
		return this.getName().equals(other.getName());
	}
	
	//implemented a getter to return the previous/parent node
	public Node getPrevious() {
		return previous;
	}
	
	//implemented a getter to return the color of a node
	public String getColor() {
		return color;
	}
	
	//implemented a getter to return the discovery time of a node
	public int getDiscovery() {
		return discovery;
	}
	
	//implemented a getter to return a finish time of a node
	public int getFinish() {
		return finish;
	}
	
	public String getAbbrev() {
		return abbrev;
	}
	
	public String getName() {
		return name;
	}
	
	public String getVal() {
		return val;
	}
	
	public ArrayList<Edge> getOutgoingEdges() {
		return outgoingEdges;
	}
	
	
	public ArrayList<Edge> getIncomingEdges() {
		return incomingEdges;
	}
	
	public void setPrevious(Node thePrevious) {
		previous = thePrevious;
	}
	
	//implemented a setter to set a color of a node
	public void setColor(String theColor) {
		color = theColor;
	}
	
	//implemented a setter to set a discovery time of a node
	public void setDiscovery(int theDiscovery) {
		discovery = theDiscovery;
	}
	
	//implemented a setter to set a finish time of a node
	public void setFinish(int theFinish) {
		finish = theFinish;
	}
	
	public void setAbbrev( String theAbbrev ) {
		abbrev = theAbbrev;
	}
	
	public void setName( String theName ) {
		name = theName;
	}
	
	public void setVal( String theVal ) {
		val = theVal;
	}
	
	public void addOutgoingEdge( Edge e ) {
		outgoingEdges.add( e );
	}
	
	public void addIncomingEdge( Edge e ) {
		incomingEdges.add( e );
	}
	
	//print function to print the abbrev of a node and its associated incoming edges
	public String printIn() {
		String output = "";
		output += "Node " + this.getAbbrev() + " has indegree " + this.getIncomingEdges().size() + ".";
		return output;
	}
	
	//print function to print the abbrev of a node and its associated outgoing edges
	public String printOut() {
		String output = "";
		output += "Node " + this.getAbbrev() + " has outdegree " + this.getOutgoingEdges().size() + ".";
		return output;
	}
	
	
	//print function toString to return the node's abbrev and its discovery and finish times
	public String toString() {
		String output = "";
		output += this.getAbbrev() + "\t" + this.getDiscovery() + "\t" + this.getFinish();
		return output;
	}
	
	//print function to return the node's abbrev
	public String printNode() {
		String output = "";
		output += this.getAbbrev();
		return output;
	}

	
}

