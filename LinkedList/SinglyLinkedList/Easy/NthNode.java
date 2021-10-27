class NthNode {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        push(list, 77);
        push(list, 31);
        push(list, 22);
        push(list, 14);
        push(list, 76);
        push(list, 83);
        push(list, 90);

        // return nth node of
        System.out.println(length(list));
        System.out.println("Value at position: " + printNthNode(list, 5));
        System.out.println("Value at position: " + nthNodeEnd(list, 0));
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

    static int length(LinkedList list) {
        Node cur = list.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }

        return count;
    }

    static int nthNodeEnd(LinkedList list, int pos) {
        int len = length(list);
        // return
        if (pos < 0 || len <= pos) {
            return -1;
        }

        Node cur = list.head;
        for (int i = 0; i < len - pos - 1; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    static int printNthNode(LinkedList list, int pos) {
        // iterate over list till pos
        Node cur = list.head;

        for (int i = 0; i < pos; i++) {
            if (cur == null) {
                break;
            }
            cur = cur.next;
        }

        return cur.val;
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