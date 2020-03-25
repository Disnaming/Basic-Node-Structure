package code;

import java.util.ArrayList;
import java.util.List;

public class node {
    private String name;
    private List<edge> edges;

    public node(String ID) {
        name = ID;
        edges = new ArrayList<edge>();
    }

    public void addEdge(edge e) {
        edges.add(e);
    }

    public void removeEdge(edge e) {
        edges.remove(e);
    }

    public String getName() {
        return name;
    }

    public void listEdges() {
        for (int i = 0; i < edges.size(); i++) {
            edge e = edges.get(i);
            System.out.println(e.getNode1().getName());
            System.out.println(e.getNode2().getName());
        }
    }
}
