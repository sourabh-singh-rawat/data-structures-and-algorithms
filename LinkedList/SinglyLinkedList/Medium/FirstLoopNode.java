package Medium;

import java.util.HashSet;
import x.*;

public class FirstLoopNode {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.append(1);
        l1.append(2);
        l1.append(3);
        l1.append(4);
        l1.append(5);

        l1.head.next.next.next.next.next = l1.head.next;
        getFirstLoopNode(l1);
    }

    static void getFirstLoopNode(LinkedList list) {
        Node cur = list.head;
        // 1(cur)->2->3->4->5->2; hashset = 1, 2, 3, 4, 5
        HashSet<Node> list_set = new HashSet<Node>();

        while (cur != null) {
            if (list_set.contains(cur)) {
                // loop exits
                System.out.println(cur.val);
                break;
            } else {
                // still no loop
                list_set.add(cur);
                cur = cur.next;
            }
        }
    }
}
