class Loop {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        push(list, 77);
        push(list, 31);
        push(list, 22);
        push(list, 21);

        // 21->22->31->77->21
        list.head.next.next.next.next = list.head;
        System.out.println(floydLoopDetection(list));
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

    static boolean checkLoop(LinkedList list) {
        // iterate of list and assign node visited = true
        Node cur = list.head;
        while (cur != null) {
            if (cur.visited)
                return true;
            cur.visited = true;
            cur = cur.next;
        }

        return false;
    }

    static boolean floydLoopDetection(LinkedList list) {
        // iterate using fast and slow cur
        Node curFast = list.head;
        Node curSlow = list.head;

        while (curFast != null && curFast.next != null) {
            curFast = curFast.next.next;
            curSlow = curSlow.next;

            if (curSlow == curFast) {
                return true;
            }
        }

        return false;
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
}
