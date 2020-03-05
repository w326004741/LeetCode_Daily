package Algorithms.A_Star;

import java.util.Comparator;
public class HeuristicNodeComparator implements Comparator<Node>{
	public int compare(Node node1, Node node2) {
		if (node1.getScore() > node2.getScore()){
			return 1;
		}else if (node1.getScore() < node2.getScore()){
			return -1;
		}else{
			return 0;
		}
	}
}
