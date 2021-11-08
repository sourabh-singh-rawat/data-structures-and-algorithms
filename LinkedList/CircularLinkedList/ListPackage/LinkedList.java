package ListPackage;

public class LinkedList {
    public Node head;

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

    public void print() {
        Node cur = this.head;

        // if no node
        if (cur == null) {
            System.out.println("List is empty");
            return;
        }

        // iterate over the list to print data in each node.
        while (cur.next != head) {
            System.out.print(cur.val + ", ");
            cur = cur.next;
        }
        System.out.print(cur.val + ", ");
    }
}