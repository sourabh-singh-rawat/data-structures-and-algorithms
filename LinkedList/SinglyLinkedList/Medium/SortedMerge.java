public class SortedMerge {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        append(l1, 1);
        append(l1, 3);

        LinkedList l2 = new LinkedList();
        append(l2, 2);
        append(l2, 4);
        append(l2, 6);

        print(l1);
        print(l2);
        System.out.println("\n");
        mergeSorted(l1, l2);
    }

    static void mergeSorted(LinkedList l1, LinkedList l2) {
        // l1 1(cur1)->3->null
        // l2 2(cur2)->4->6->null
        // iterate over both list
        // making dummyNode
        Node dummyNode = new Node(-1);
        Node cur1 = l1.head, cur2 = l2.head, cur3 = dummyNode;
        while (cur1 != null || cur2 != null) {
            // if l1 is empty add remaing l2 vals to new list
            if (cur1 == null) {
                cur3.next = cur2;
                break;
            }
            if (cur2 == null) {
                cur3.next = cur1;
                break;
            }

            // comp
            if (cur1.val < cur2.val) {
                cur3.next = new Node(cur1.val);
                cur1 = cur1.next;
            } else {
                cur3.next = new Node(cur2.val);
                cur2 = cur2.next;
            }
            cur3 = cur3.next;
        }
        LinkedList l3 = new LinkedList();
        l3.head = dummyNode.next;
        print(l3);
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

    static void append(LinkedList list, int val) {
        // create a new node
        Node node = new Node(val);

        // list empty?
        if (list.head == null) {
            list.head = node;
            return;
        }

        // list not empty add from last
        // find last
        Node cur = list.head;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = node;
    }

    static void print(LinkedList list) {
        Node cur = list.head;

        // if no node
        if (cur == null) {
            System.out.println("List is empty");
            return;
        }

        // iterate over the list to print data in each node.
        while (cur != null) {
            System.out.print(cur.val + ", ");
            cur = cur.next;
        }
    }
}