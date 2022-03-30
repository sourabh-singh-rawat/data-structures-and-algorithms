import { Node, LinkedList } from "../x/LinkedList.js";

const list1 = new LinkedList([10, 15, 30]);
const list2 = new LinkedList([3, 6, 9, 20, 1]);
list1.head.next.next.next = list2.head.next.next.next;

list1.print(); // 3, 6, 9, 15, 30
list2.print(); // 10, 15, 30

// answer should be 15
// making lists of same size

const yIntersection = (list1, list2) => {
    const len1 = list1.length;
    const len2 = list2.length;
    const diff = len1 - len2;

    let cur1 = list1.head;
    let cur2 = list2.head;

    if (len1 > len2) {
        for (let i = 0; i < diff; i++) {
            cur1 = cur1.next;
        }
    } else {
        for (let i = 0; i < diff; i++) {
            cur2 = cur2.next;
        }
    }

    // iterate both list
    while (cur1 != null && cur2 != null) {
        if (cur1 === cur2) {
            console.log("Y intersection found! at " + cur1.val);
            break;
        }
        cur1 = cur1.next;
        cur2 = cur2.next;
    }
};
yIntersection(list1, list2);
