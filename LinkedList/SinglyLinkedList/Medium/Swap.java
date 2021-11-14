package Medium;

import x.*;

public class Swap {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        list.print();
        System.out.println();
        swap(list, 1, 6);
        list.print();
    }

    static void swap(LinkedList list, int x, int y) {
        // iterate over list
        Node cur = list.head;
        Node prev = null, xNode = null, yNode = null, xPrevNode = null, yPrevNode = null;
        while (cur != null) {
            // find x and y
            if (cur.val == x) {
                // x found
                // store address of x and y and prev nodes
                xPrevNode = prev;
                xNode = cur;
            }
            if (cur.val == y) {
                // y found
                yPrevNode = prev;
                yNode = cur;
            }
            prev = cur;
            cur = cur.next;
        }
        // do nothing if x and y not found in the list
        if (xNode == null || yNode == null)
            return;

        // update head if x or y are becomming head after swapping
        if (xPrevNode == null) {
            list.head = yNode;
        } else {
            xPrevNode.next = yNode;
        }

        if (yPrevNode == null) {
            list.head = xNode;
        } else {
            yPrevNode.next = xNode;
        }

        Node temp = yNode.next;
        yNode.next = xNode.next;
        xNode.next = temp;
    }

    // static void swap(LinkedList l1, int x, int y) {
    // // find values in the list also there refernces
    // Node cur = l1.head, prev = null;
    // Node curX = null, prevX = null, curY = null, prevY = null;

    // while (cur != null) {
    // // find X
    // if (cur.val == x) { // found
    // curX = cur;
    // prevX = prev;
    // }

    // if (cur.val == y) {
    // curY = cur;
    // prevY = prev;
    // }

    // prev = cur;
    // cur = cur.next;
    // }

    // // not found
    // if (curX == null || curY == null)
    // return;

    // // x and y found
    // // head
    // if (prevX == null) {
    // prevY.next = curX;
    // l1.head = curY;
    // } else if (prevY == null) {
    // prevX.next = curY;
    // l1.head = curX;
    // } else {
    // prevX.next = curY;
    // prevY.next = curX;
    // }

    // Node temp = curY.next;
    // curY.next = curX.next;
    // curX.next = temp;
    // }
}