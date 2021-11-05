public class DuplicateUnsorted {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        push(list, 22);
        push(list, 77);
        push(list, 22);
        push(list, 31);
        push(list, 22);
        push(list, 21);

        print(list);

        removeDuplicateUnsorted(list);
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

    static void removeDuplicate(LinkedList list) {
        Node cur = list.head;

        while (cur.next != null) {
            // link to next node till same value
            while (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
    }

    // removing duplicates in unsorted linked list
    static void removeDuplicateUnsorted(LinkedList list) {
        // iterate over list pick each node
        Node current = list.head;
        while (current != null) {
            // compare it with other nodes
            Node compNode = current.next;
            Node prev = current;
            while (compNode != null) {
                // check if duplicates exist cur.val == ptr.val
                // 1->4->(prev)1->null(comp) = 4->null
                if (current.val == compNode.val) {
                    // prev.next = cur.next
                    prev.next = compNode.next;
                    compNode = compNode.next;
                    continue;
                }
                prev = compNode;
                compNode = compNode.next;
            }
            current = current.next;
        }
    }
}