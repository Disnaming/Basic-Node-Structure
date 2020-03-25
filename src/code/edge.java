package code;

public class edge {
    private node n1;
    private node n2;

    public edge(node a, node b) {
        n1 = a;
        n2 = b;
    }

    public node getNode1() {
        return n1;
    }

    public node getNode2() {
        return n2;
    }
}
