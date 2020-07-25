package Algorithms.A_Star;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class AStar {
	// sorted by priority 按优先级排序 implemented as a heap (an array)
	private PriorityQueue<Node> open = null;
	// visited node
	private List<Node> closed = new ArrayList<Node>(); // space complexity =
														// 0(b*^d)
	private HeuristicNodeComparator sorter = new HeuristicNodeComparator();
	private static int nodecount;

	//
	public void search(Node start) {
		open = new PriorityQueue<Node>(20, sorter);
		start.setDistanceTravelled(0); // g(start) = 0
		open.add(start);
		// make sure algorithm is complete
		while (!open.isEmpty()) {
			Node node = open.poll();

			if (node.isGoalNode()) {
				List<Node> path = new ArrayList<Node>();
				while (node.getParent() != null) {
					path.add(node);
					node = node.getParent();
				}
				path.add(node);
				Collections.reverse(path);
				System.out.println("Path: " + path);
				System.exit(0);
			}

			pushSuccessors(node);
			closed.add(node);
		}
	}

	public void pushSuccessors(Node node) {
		Node[] children = node.children();
		for (int i = 0; i < children.length; i++) {
			nodecount++;
			Node child = children[i];
			float score = HeuristicCalculator.getHeuristicValue(
					node.getDistanceTravelled() + node.getDistanceToNode(child), child.getGoalDistance(),
					child.getTerrain(), child.getDanger());
			if ((open.contains(child) || closed.contains(child)) && child.getScore() < score) {
				continue;
			} else {
				open.remove(child);
				closed.remove(child);
				child.setParent(node);
				child.setDistanceTravelled(node.getDistanceTravelled() + node.getDistanceToNode(child));
				open.add(child);
			}
		}
	}

	public static void main(String[] args) {
		MiddleEarth me = new MiddleEarth();
		Node start = me.getStartNode();
		AStar astar = new AStar();
		astar.search(start);
	}
}
