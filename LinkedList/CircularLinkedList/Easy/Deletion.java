package Easy;

import x.*;

class Deletion {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.head.next.next.next.next = ll.head; // circular
        delete(ll, 4);
        ll.print();
    }

    // delete item from linkedlist
    static void delete(LinkedList l, int key) {
        // find the reference of item in the list
        Node cur = l.head, prev = null;
        do {
            if (cur.val == key)
                break; // item found
            prev = cur;
            cur = cur.next;
        } while (cur.next != l.head);

        // item found is at first? or anywhere else
        // first value 1(head, cur)->2->3->4->head
        if (cur == l.head) {
            while (cur.next != l.head) {
                cur = cur.next;
            }

            cur.next = l.head.next;
            l.head = l.head.next;
        }
        // anywhere else
        else {
            prev.next = cur.next;
        }
    }
}