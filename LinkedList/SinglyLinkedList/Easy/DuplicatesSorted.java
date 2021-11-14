package Easy;

import x.*;

public class DuplicatesSorted {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(77);
        list.push(31);
        list.push(22);
        list.push(22);
        list.push(22);
        list.push(21);

        list.print();

        removeDuplicate(list);
        System.out.println("\n");
        list.print();
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
}
