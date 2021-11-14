package Basic;

import x.*;

public class Length {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(3);
        list.push(2);
        list.push(1);
        list.print();
        System.out.println();
        System.out.println("Iterative Count: " + length(list));
        System.out.println("Recursive Count: " + recursiveLength(list.head));

    }

    static int length(LinkedList list) {
        int count = 0;
        Node ptr = list.head;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }

        return count;
    }

    static int recursiveLength(Node head) {
        return recursiveLengthInner(head);
    }

    static int recursiveLengthInner(Node head) {
        // base case
        if (head == null) {
            return 0;
        }

        return recursiveLengthInner(head.next) + 1;
    }

}
