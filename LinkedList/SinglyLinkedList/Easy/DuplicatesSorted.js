import { LinkedList } from "../x/LinkedList.js";

const list = new LinkedList([ 11, 22, 22, 22, 33, 44, 55 ]);

const duplicatesSorted = (list) => {
	// 11(cur), 22, 22, 33, 44, 55
	let cur = list.head;
	while (cur.next != null) {
		while (cur.val == cur.next.val) {
			cur.next = cur.next.next;
		}
		cur = cur.next;
	}
};

duplicatesSorted(list);
list.print();
