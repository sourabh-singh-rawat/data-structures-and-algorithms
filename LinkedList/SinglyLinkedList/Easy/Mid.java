public class Mid {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        push(list, 77);
        push(list, 11);
        push(list, 31);
        push(list, 23);
        push(list, 2);
        push(list, 14);
        midFS(list);
    }

    static void mid(LinkedList list) {
        int mid = length(list) / 2;

        // iterate over the loop mid times
        Node cur = list.head;
        for (int i = 0; i < mid; i++) {
            cur = cur.next;
        }

        System.out.println(cur.val);
    }

    static void midFS(LinkedList list) {
        // travese list using fast and slow pointers
        Node curFast = list.head;
        Node curSlow = list.head;

        while (curFast != null && curFast.next != null) {
            curFast = curFast.next.next;
            curSlow = curSlow.next;
        }

        System.out.println("Mid: " + curSlow.val);
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
