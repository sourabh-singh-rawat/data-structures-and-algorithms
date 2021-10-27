public class CountSearch {
    public static void main(String[] args) {
        // 1. Search an element in a Linked
        // 2. Count the number of time an element occurs in a list
        // creating a new list
        LinkedList list = new LinkedList();

        push(list, 2);
        push(list, 31);
        push(list, 5);
        push(list, 123);
        push(list, 2);
        push(list, 2);
        print(list);
        count(list, 2);

        // System.out.println("\nPosition: " + search(list, 5));
    }

    static void count(LinkedList list, int val) {
        // check the times a val is reoccuring
        int count = 0;

        // iterate over the list
        Node cur = list.head;
        while (cur != null) {
            if (cur.val == val)
                count++;
            cur = cur.next;
        }

        System.out.println("\nCount of " + val + ": " + count);
    }

    static int search(LinkedList list, int val) {
        int pos = 0;
        // iterating over linked list
        Node cur = list.head;
        while (cur != null) {
            if (cur.val == val) {
                return pos;
            }
            pos++;
            cur = cur.next;
        }

        return -1;
    }

    static class LinkedList {
        Node head;
    }

    static class Node {
        int val;
        Node next;

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
        Node cur = list.head;
        while (cur != null) {
            System.out.print(cur.val + ", ");
            cur = cur.next;
        }
    }
}
