package Easy;

import ListPackage.*;

public class isCircular {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.append(1);
        l1.append(2);
        l1.append(3);
        l1.append(4);
        l1.head.next.next.next.next = l1.head;

        // l1.print();
        System.out.println(isListCircular(l1) ? "circular" : "not circular");
    }

    static boolean isListCircular(LinkedList l1) {
        if (l1.head == null)
            return true;

        // head->1->2->3->4->null
        // lastnode->head
        Node cur = l1.head;
        while (cur.next != null) {
            if (cur.next == l1.head)
                return true;

            cur = cur.next;
        }

        return false;
    }
}
