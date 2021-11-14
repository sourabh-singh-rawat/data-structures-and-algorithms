package Easy;

import x.*;

class Deletion {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        list.print();
        System.out.println();
        deletePosition(list, 4);
        list.print();

        System.out.println();
        deleteValue(list, 1);
        list.print();
    }

    static void deletePosition(LinkedList list, int position) {
        // list empty?
        if (list.head == null) {
            System.out.println("cannot delele list is empty");
            return;
        }

        Node curr = list.head;
        Node prev = null;
        // list not empty
        // iterate over list till we reach position
        for (int i = 0; curr != null && i < position; i++) {
            prev = curr;
            curr = curr.next;
        }

        // position more than no of nodes
        if (curr == null) {
            System.out.println("Position out of bound");
            return;
        }

        // delete first value
        if (prev == null) {
            list.head = list.head.next;
            return;
        }

        // delete
        prev.next = curr.next;
    }

    static void deleteValue(LinkedList list, int value) {
        // check if list is empty
        if (list.head == null) {
            System.out.println("Cannot delete. List is empty");
            return;
        }

        // list not empty
        // search for value in list
        Node cur = list.head;
        Node prev = null;

        while (cur != null) {
            if (cur.val == value) {
                break; // curr value is the value where data is found
            }
            prev = cur;
            cur = cur.next;
        }

        if (cur == null) {
            System.out.println("Cannot delete. Item not found in the list.");
            return;
        }

        // item to be deleted is the first item
        if (prev == null) {
            list.head = cur.next;
            return;
        }

        // delete
        prev.next = cur.next;
    }

}