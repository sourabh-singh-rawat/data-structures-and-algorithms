package Basic;

import x.*;

class LastElementToFront {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.append(1);
        l1.append(2);
        l1.append(3);
        l1.append(4);

        l1.print();
        System.out.println();
        lastToFront(l1);
        l1.print();
    }

    static void lastToFront(LinkedList list) {
        if (list.head == null || list.head.next == null) // list with 0 or 1 values
            return;

        // find last and prev nodes
        Node last = list.head, prev = list.head;
        while (last.next != null) {
            prev = last;
            last = last.next;
        }

        prev.next = null;
        last.next = list.head;
        list.head = last;
    }
}