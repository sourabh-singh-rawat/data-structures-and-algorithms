// starting node of the loop
import { LinkedList } from "../x/LinkedList.js";

let list = new LinkedList([1, 2, 3, 4, 5, 6]);
list.head.next.next.next = list.head;

const firstLoopNode = (list) => {
    let cur = list.head;
    let prev = null;
    let set = new Set();

    while (cur != null) {
        // check if the cur.val is in set
        if (set.has(cur)) {
            // loop exists
            return prev;
        } else {
            set.add(cur);
        }
        prev = cur;
        cur = cur.next;
    }

    return "No loop detected";
};

console.log(firstLoopNode(list));
