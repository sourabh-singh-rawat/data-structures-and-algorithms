// Merging two sorted linked list into a single list
import { Node, LinkedList } from "../x/LinkedList.js";

// two lists
let list1 = new LinkedList([1, 3, 5, 7, 8]);
let list2 = new LinkedList([2, 4, 6]);
// 1,2,3,3,4,4,5,6

let sortedMerge = (list1, list2) => {
    let cur1 = list1.head;
    let cur2 = list2.head;
    let dummyNodeHead = new Node(-1);
    let cur = dummyNodeHead;

    while (cur1 != null || cur2 != null) {
        if (cur1 == null) {
            cur.next = cur2;
            break;
        }

        if (cur2 == null) {
            cur.next = cur1;
            break;
        }

        // lets iterate the smaller values first
        if (cur1.val < cur2.val) {
            cur.next = new Node(cur1.val);
            cur1 = cur1.next;
        } else {
            cur.next = new Node(cur2.val);
            cur2 = cur2.next;
        }
        cur = cur.next;
    }

    return dummyNodeHead;
};

let list = new LinkedList();
list.head = sortedMerge(list1, list2).next;
list.print();
