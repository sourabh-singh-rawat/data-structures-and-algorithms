package Medium;

import java.util.HashSet;

import x.*;

// https://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list/
class RemoveLoop {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.append(1);
        l1.append(2);
        l1.append(3);
        l1.append(4);
        l1.append(5);

        l1.head.next.next.next.next.next = l1.head.next;
        // removeLoop(l1);
        // l1.print();
        removeLoopHashing(l1);
        l1.print();
    }

    // 1. Hashing
    static void removeLoopHashing(LinkedList list) {
        // visit and store each node address in the hashset
        // before visiting check if the current node address exist in the hashset
        // if found in hashset
        HashSet<Node> node_list = new HashSet<Node>();
        // start iterating over list
        Node cur = list.head, prev = null;
        while (cur != null) {
            if (node_list.contains(cur)) {
                System.out.println("Loop exists");
                break;
            } else {
                node_list.add(cur);
                prev = cur;
                cur = cur.next;
            }
        }
        // 1->2->3->4->2;
        // cur is the node to make null
        prev.next = null;
    }

    // 2. GFG - shank
    // detect loop and count size of the loop
    static int count(LinkedList list) {
        // detect if there is loop (floyd)
        int count = 1;
        Node curF = list.head, curS = list.head;
        while (curF != null && curF.next != null) {
            curF = curF.next.next;
            curS = curS.next;

            if (curF == curS)
                break;
        }

        // curF == curS;
        while (curF.next != curS) {
            count++;
            curF = curF.next;
        }

        return count;
    }

    // one ptr to head and one to head + loop length
    static void removeLoop(LinkedList list) {
        int k = count(list);
        Node ptr1 = list.head, ptr2 = list.head;
        for (int i = 0; i < k; i++) {
            ptr2 = ptr2.next;
        }

        // iterate till ptr1 and ptr2 are same
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        // iterate again to find the last node
        while (ptr1.next != ptr2) {
            ptr1 = ptr1.next;
        }

        ptr1.next = null;
    }
}