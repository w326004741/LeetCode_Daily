package algorithms.A_Star;

import java.util.*;
public class Node {
	private String nodeName;
	private Node parent;
	private Map<Node, Integer> children = new HashMap<Node, Integer>();
	private boolean visited = false;
	private Colour colour = Colour.White;
	private boolean goalNode;
	private int approxDistance = 0;
	private int distanceTravelled = 0;
	private float terrain = 0.0f;
	private float danger = 0.0f;
	
	public Node(String name){
		this.nodeName = name;
	}
	
	public Node(String name, int goalDistance){
		this.nodeName = name;
		this.approxDistance = goalDistance;
	}
	
	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public Node[] children(){
		return (Node[]) children.keySet().toArray(new Node[children.size()]);
	}
	
	public boolean isLeaf(){
		if (children.size() > 0){
			return false;
		}else{
			return true;
		}
	}
	
	public int getDistanceToNode(Node n){
		return children.get(n);
	}
	
	public int getDistanceTravelled() {
		return distanceTravelled;
	}

	public void setDistanceTravelled(int depth) {
		this.distanceTravelled = depth;
	}
	
	public float getScore() {
		return HeuristicCalculator.getHeuristicValue(distanceTravelled, approxDistance, terrain, danger);
	}

	public int getChildNodeCount(){
		return children.size();
	}

	public void setTerrain(float terrain) {
		this.terrain = terrain;
	}

	public void setDanger(float danger) {
		this.danger = danger;
	}

	public float getTerrain() {
		return terrain;
	}

	public float getDanger() {
		return danger;
	}

	public void addChildNode(Node child, int distance){
		children.put(child, new Integer(distance));
	}
	
	public void removeChild(Node child){
		children.remove(child);
	}
	
	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Colour getColour() {
		return colour;
	}

	public void colour(Colour colour) {
		this.colour = colour;
	}
	
	public boolean isGoalNode() {
		return goalNode;
	}

	public void setGoalNode(boolean goalNode) {
		this.goalNode = goalNode;
	}

	public int getGoalDistance() {
		return approxDistance;
	}

	public void setGoalDistance(int goalDistance) {
		this.approxDistance = goalDistance;
	}
	
	public String toString() {
		return this.nodeName;
	}
}
