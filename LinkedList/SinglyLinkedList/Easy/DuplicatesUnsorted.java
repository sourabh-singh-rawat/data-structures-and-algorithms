package Easy;

import x.*;

public class DuplicateUnsorted {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(22);
        list.push(77);
        list.push(22);
        list.push(31);
        list.push(22);
        list.push(21);

        list.print();

        removeDuplicateUnsorted(list);
        System.out.println("\n");
        list.print();
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