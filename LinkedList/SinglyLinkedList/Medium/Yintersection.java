package Medium;

import x.*;

public class Yintersection {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.append(1);
        l1.append(2);
        l1.append(3);
        l1.append(4);

        l2.append(5);
        l2.append(6);
        l2.head.next.next = l1.head.next.next; // 5

        System.out.println(findYIntersection(l1, l2));
    }

    static int findYIntersection(LinkedList l1, LinkedList l2) {
        int len1 = l1.length();
        int len2 = l2.length();
        int d = (len1 > len2) ? len1 - len2 : len2 - len1;

        Node cur1 = l1.head;
        Node cur2 = l2.head;

        if (len1 > len2) {
            // iterate over the bigger list l1
            for (int i = 0; i < d; i++) {
                cur1 = cur1.next;
            }
        } else {
            for (int i = 0; i < d; i++) {
                cur2 = cur2.next;
            }
        }

        // cur1 and cur2 are updated
        while (cur1 != null && cur2 != null) {
            if (cur1 == cur2) {
                return cur1.val;

            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        return -1;
    }
}
