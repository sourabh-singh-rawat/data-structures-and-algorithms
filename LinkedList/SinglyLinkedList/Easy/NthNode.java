package Easy;

import x.*;

class NthNode {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(77);
        list.push(31);
        list.push(22);
        list.push(14);
        list.push(76);
        list.push(83);
        list.push(90);

        // return nth node of
        System.out.println("Value at position: " + nthNodeEnd(list, 0));
        System.out.println("Value at position: " + printNthNode(list, 5));
    }

    static int nthNodeEnd(LinkedList list, int pos) {
        int len = list.length();
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
}