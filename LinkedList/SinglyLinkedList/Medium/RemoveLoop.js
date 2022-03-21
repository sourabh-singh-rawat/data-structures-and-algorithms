import { LinkedList } from "../x/LinkedList.js";
import { detectLoop } from "../Easy/Loop.js";

const list = new LinkedList([1, 2, 3, 4, 5]);
list.head.next.next.next.next.next = list.head;

const removeLoopHashing = (list) => {
    // using set
    const set = new Set();
    // first lets iterate over list
    let cur = list.head;
    let prev = null;
    while (cur != null) {
        // check if the item already exists in the set
        if (set.has(cur)) {
            // need to break the loop somehow
            // 1->2->3->4->5(prev)->1(cur exists)
            prev.next = null;
            return;
        }

        // item not in the set
        // storing item in the set
        set.add(cur);
        prev = cur;
        cur = cur.next;
    }
};

// 1->2(F)(S)->3->4->5->1
// const  () => {}

console.log(
    detectLoop(list) ? "Loop Detected" : `No loop detected: ${list.print()}`
);
removeLoopHashing(list);
console.log("Removed Loop");
list.print();
