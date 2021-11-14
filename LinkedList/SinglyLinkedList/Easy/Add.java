package Easy;

import x.*;

public class Add {
    // add two numbers represented by linked list
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList l3 = new LinkedList();

        l1.push(1);
        l1.print();

        l2.push(9);

        System.out.println();
        l2.print();

        // iterate list togther until both lists are finished
        int carry = 0;
        Node dummyNode = new Node(-1);
        Node cur1 = l1.head, cur2 = l2.head, cur3 = dummyNode;

        while (cur1 != null || cur2 != null) {
            // fill empty nodes with 0
            if (cur1 == null && cur2 != null)
                cur1 = new Node(0);
            if (cur1 != null && cur2 == null)
                cur2 = new Node(0);

            int sum = cur1.val + cur2.val + carry; // add nodes values with carry
            carry = sum / 10; // new carry

            cur3.next = new Node(sum % 10); // storing sum in the nodes

            // updating cursors
            cur1 = cur1.next;
            cur2 = cur2.next;
            cur3 = cur3.next;
        }

        // if there is still carry after adding last nodes.
        if (carry == 1)
            cur3.next = new Node(1);

        l3.head = dummyNode.next;
        System.out.println();
        l3.print();
    }
}
