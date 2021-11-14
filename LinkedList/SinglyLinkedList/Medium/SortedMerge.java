package Medium;

import x.*;

public class SortedMerge {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.append(1);
        l1.append(3);

        LinkedList l2 = new LinkedList();
        l2.append(2);
        l2.append(4);
        l2.append(6);

        l1.print();
        l2.print();
        System.out.println("\n");
        mergeSorted(l1, l2);
    }

    static void mergeSorted(LinkedList l1, LinkedList l2) {
        // l1 1(cur1)->3->null
        // l2 2(cur2)->4->6->null
        // iterate over both list
        // making dummyNode
        Node dummyNode = new Node(-1);
        Node cur1 = l1.head, cur2 = l2.head, cur3 = dummyNode;
        while (cur1 != null || cur2 != null) {
            // if l1 is empty add remaing l2 vals to new list
            if (cur1 == null) {
                cur3.next = cur2;
                break;
            }
            if (cur2 == null) {
                cur3.next = cur1;
                break;
            }

            // comp
            if (cur1.val < cur2.val) {
                cur3.next = new Node(cur1.val);
                cur1 = cur1.next;
            } else {
                cur3.next = new Node(cur2.val);
                cur2 = cur2.next;
            }
            cur3 = cur3.next;
        }
        LinkedList l3 = new LinkedList();
        l3.head = dummyNode.next;
        l3.print();
    }
}