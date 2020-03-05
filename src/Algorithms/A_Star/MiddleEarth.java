package Algorithms.A_Star;

public class MiddleEarth {
	private Node a;
	
	public MiddleEarth() {
		//Create nodes and specifies approximate distance to goal
		a = new Node("A", 160);
		
		Node b = new Node("B", 168);	
		b.setTerrain(0.0f);
		b.setDanger(0.6f);
		
		Node c = new Node("C", 147);
		c.setTerrain(0.0f);
		c.setDanger(0.3f);
		
		Node d = new Node("D", 145);
		d.setTerrain(0.2f);
		d.setDanger(0.0f);
		
		Node e = new Node("E", 120);
		e.setTerrain(0.2f);
		e.setDanger(0.2f);
		
		Node f = new Node("F", 115);
		f.setTerrain(0.4f);
		f.setDanger(0.1f);
		
		Node g = new Node("G", 148);
		g.setTerrain(0.1f);
		g.setDanger(0.9f);
		
		Node h = new Node("H", 870);
		h.setTerrain(0.5f);
		h.setDanger(0.5f);
		
		Node i = new Node("I", 80);
		i.setTerrain(0.6f);
		i.setDanger(0.8f);
		
		Node j = new Node("J", 90);
		j.setTerrain(0.7f);
		j.setDanger(0.3f);
		
		Node k = new Node("K", 111);
		k.setTerrain(0.9f);
		k.setDanger(1.0f);
		
		Node l = new Node("L", 120);
		l.setTerrain(0.5f);
		l.setDanger(0.4f);
		
		Node m = new Node("M", 70);
		m.setTerrain(0.8f);
		m.setDanger(0.7f);
		
		Node n = new Node("N", 680);
		n.setTerrain(0.3f);
		n.setDanger(0.2f);
		
		Node o = new Node("O", 88);
		o.setTerrain(0.2f);
		o.setDanger(0.4f);
		
		Node p = new Node("P", 40);
		p.setTerrain(0.6f);
		p.setDanger(0.5f);
		
		Node q = new Node("Q", 60);
		q.setTerrain(0.3f);
		q.setDanger(0.5f);
		
		Node r = new Node("R", 23);
		r.setTerrain(0.6f);
		r.setDanger(0.9f);
		
		Node s = new Node("S", 27);
		s.setTerrain(0.9f);
		s.setDanger(0.9f);
		
		Node t = new Node("T", 45);
		t.setTerrain(0.6f);
		t.setDanger(0.9f);
		
		Node u = new Node("U", 68);
		u.setTerrain(0.7f);
		u.setDanger(0.4f);
		
		Node v = new Node("V", 0);
		v.setGoalNode(true);
		
		//Add Edges along with the actual distance to the child node
		a.addChildNode(b, 50);
		a.addChildNode(c, 30);
		a.addChildNode(d, 13);
		
		b.addChildNode(a, 50);
		b.addChildNode(c, 27);
		b.addChildNode(g, 38);
		
		c.addChildNode(a, 30);
		c.addChildNode(b, 27);
		c.addChildNode(g, 47);
		
		d.addChildNode(a, 13);
		d.addChildNode(e, 27);
		d.addChildNode(f, 35);
		
		e.addChildNode(d, 27);
		e.addChildNode(i, 42);
		
		f.addChildNode(d, 35);
		f.addChildNode(j, 26);
		
		g.addChildNode(b, 38);
		g.addChildNode(c, 47);
		g.addChildNode(k, 41);
		g.addChildNode(l, 63);
		
		h.addChildNode(i, 23);
		h.addChildNode(n, 47);
		h.addChildNode(p, 67);
		h.addChildNode(m, 24);
		
		i.addChildNode(e, 42);
		i.addChildNode(h, 23);
		i.addChildNode(j, 20);
		
		j.addChildNode(f, 26);
		j.addChildNode(i, 20);
		j.addChildNode(n, 23);
		
		k.addChildNode(g, 41);
		
		l.addChildNode(o, 22);
		l.addChildNode(g, 63);
		
		m.addChildNode(h, 24);
		
		n.addChildNode(j, 23);
		n.addChildNode(h, 47);
		n.addChildNode(q, 42);
		n.addChildNode(p, 32);
		
		o.addChildNode(l, 22);
		o.addChildNode(u, 57);
		
		p.addChildNode(h, 67);
		p.addChildNode(n, 32);
		p.addChildNode(q, 28);
		p.addChildNode(t, 58);
		p.addChildNode(r, 20);
		
		q.addChildNode(n, 42);
		q.addChildNode(p, 28);
		
		r.addChildNode(p, 20);
		r.addChildNode(t, 41);
		r.addChildNode(v, 24);
		
		s.addChildNode(v, 30);
		
		t.addChildNode(p, 58);
		t.addChildNode(r, 41);
		t.addChildNode(u, 22);
		
		u.addChildNode(o, 57);
		u.addChildNode(t, 22);
	}

	public Node getStartNode(){
		return a;
	}
}
