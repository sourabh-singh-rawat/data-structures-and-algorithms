package Easy;

import x.*;

class Split {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(5);
        ll.append(7);

        ll.head.next.next.next = ll.head;
        split(ll);

    }

    public static void split(LinkedList l) {
        Node cur = l.head;
        int count = 0;
        do {
            count++;
            cur = cur.next;
        } while (cur != l.head);

        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        for (int i = 0; i < (count / 2) + 1; i++) {
            l1.append(cur.val);
            cur = cur.next;
        }

        do {
            l2.append(cur.val);
            cur = cur.next;
        } while (cur != l.head);

        l1.print2();
        System.out.println();
        l2.print2();
    }
}