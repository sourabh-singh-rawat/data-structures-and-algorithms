package Basic;

import x.*;

public class CountSearch {
    public static void main(String[] args) {
        // 1. Search an element in a Linked
        // 2. Count the number of time an element occurs in a list
        // creating a new list
        LinkedList list = new LinkedList();

        list.push(2);
        list.push(31);
        list.push(5);
        list.push(123);
        list.push(2);
        list.push(2);
        list.print();
        count(list, 2);

        System.out.println("123 is at position: " + search(list, 123));

        // System.out.println("\nPosition: " + search(list, 5));
    }

    static void count(LinkedList list, int val) {
        // check the times a val is reoccuring
        int count = 0;

        // iterate over the list
        Node cur = list.head;
        while (cur != null) {
            if (cur.val == val)
                count++;
            cur = cur.next;
        }

        System.out.println("\nCount of " + val + ": " + count);
    }

    static int search(LinkedList list, int val) {
        int pos = 0;
        // iterating over linked list
        Node cur = list.head;
        while (cur != null) {
            if (cur.val == val) {
                return pos;
            }
            pos++;
            cur = cur.next;
        }

        return -1;
    }

}
