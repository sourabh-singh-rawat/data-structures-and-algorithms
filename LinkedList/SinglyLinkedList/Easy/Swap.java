public class Swap {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        push(list, 6);
        push(list, 5);
        push(list, 4);
        push(list, 3);
        push(list, 2);
        push(list, 1);

        swap(list, 1, 6);
        System.out.println("\n");
        print(list);
    }

    static class LinkedList {
        Node head;
    }

    static class Node {
        int val;
        Node next;
        boolean visited;

        Node(int val) {
            this.val = val;
        }
    }

    static void push(LinkedList list, int val) {
        // create a new node
        Node node = new Node(val);

        // list empty?
        if (list.head == null) {
            list.head = node;
            return;
        }

        // list not empty
        node.next = list.head;
        list.head = node;
    }

    static void print(LinkedList list) {
        Node curr = list.head;

        // if no node
        if (list.head == null) {
            System.out.println("List is empty");
            return;
        }

        // iterate over the list to print data in each node.
        while (curr != null) {
            System.out.print(curr.val + ", ");
            curr = curr.next;
        }
    }

    static void swap(LinkedList list, int x, int y) {
        // iterate over list
        Node cur = list.head;
        Node prev = null, xNode = null, yNode = null, xPrevNode = null, yPrevNode = null;
        while (cur != null) {
            // find x and y
            if (cur.val == x) {
                // x found
                // store address of x and y and prev nodes
                xPrevNode = prev;
                xNode = cur;
            }
            if (cur.val == y) {
                // y found
                yPrevNode = prev;
                yNode = cur;
            }
            prev = cur;
            cur = cur.next;
        }
        // do nothing if x and y not found in the list
        if (xNode == null || yNode == null)
            return;

        // update head if x or y are becomming head after swapping
        if (xPrevNode == null) {
            list.head = yNode;
        } else {
            xPrevNode.next = yNode;
        }

        if (yPrevNode == null) {
            list.head = xNode;
        } else {
            yPrevNode.next = xNode;
        }

        Node temp = yNode.next;
        yNode.next = xNode.next;
        xNode.next = temp;
    }
}