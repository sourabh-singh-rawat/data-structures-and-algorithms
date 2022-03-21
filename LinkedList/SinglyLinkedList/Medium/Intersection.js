// intersection of two linked lists
// list1 = 1->2->3->4
// list2 = 2->3->5
// assuming that the lists are sorted.
import { Node, LinkedList } from "../x/LinkedList.js";
const list1 = new LinkedList([1, 2, 3, 4, 8]);
const list2 = new LinkedList([7, 8, 9]);

const intersection = (list1, list2) => {
    let cur1 = list1.head,
        cur2 = list2.head,
        dummyNodeHead = new Node(-1),
        cur = dummyNodeHead;

    while (cur1 != null && cur2 != null) {
        if (cur1.val == cur2.val) {
            // intersection
            cur.next = new Node(cur1.val);
            cur = cur.next;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        // deciding which node to update based on the lower value
        else if (cur1.val < cur2.val) {
            cur1 = cur1.next;
        } else {
            cur2 = cur2.next;
        }
    }

    return dummyNodeHead;
};

let list = new LinkedList();
list.head = intersection(list1, list2).next;
list.print();
