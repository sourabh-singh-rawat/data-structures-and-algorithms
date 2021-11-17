package Medium;

import x.*;

class Intersection {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.append(1);
        l1.append(2);
        l1.append(3);
        l1.append(4);
        l1.append(6);

        l2.append(2);
        l2.append(4);
        l2.append(6);
        l2.append(8);

        intersection(l1, l2);
    }

    static void intersection(LinkedList l1, LinkedList l2) {
        // iterate over both list till one is over
        // check if two values match
        // if match move the value to dummyNode
        // else iterate to next node of low val list
        Node dummyNode = new Node(-1);
        Node cur1 = l1.head, cur2 = l2.head, cur3 = dummyNode;
        while (cur1 != null && cur2 != null) {
            if (cur1.val == cur2.val) {
                cur3.next = new Node(cur2.val);
                cur2 = cur2.next;
                cur3 = cur3.next;
            } else if (cur1.val < cur2.val) {
                cur1 = cur1.next;
            } else {
                cur2 = cur2.next;
            }
        }

        LinkedList ll = new LinkedList();
        ll.head = dummyNode.next;
        ll.print();
    }
}