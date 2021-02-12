package program.program;


public class Node {

    Node next;
    Node prev;
    int val;

    public Node() {

        prev = next = null;
        this.val = 0;

    }

    public Node(int v) {

        prev = next = null;
        this.val = v;
    }
}
