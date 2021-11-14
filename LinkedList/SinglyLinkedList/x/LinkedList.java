package x;

public class LinkedList {
    public Node head;

    public void push(int val) {
        // create a node
        Node node = new Node(val);

        // list empty?
        if (this.head == null) {
            this.head = node;
            return;
        }

        node.next = this.head;
        this.head = node;
    }

    public void print() {
        // using cursor to iterate over list
        Node cur = this.head;

        while (cur != null) {
            System.out.print(cur.val + ", ");
            cur = cur.next;
        }
    }

    public void append(int val) {
        // create a new node
        Node node = new Node(val);

        // list empty?
        if (this.head == null) {
            this.head = node;
            return;
        }

        // list not empty add from last
        // find last
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = node;
    }

    public int length() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }

        return count;
    }
}