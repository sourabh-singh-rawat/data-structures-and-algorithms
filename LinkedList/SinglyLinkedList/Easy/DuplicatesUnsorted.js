import { LinkedList } from "../x/LinkedList.js";

const list = new LinkedList([ 22, 11, 22, 22, 22, 33, 44, 55 ]);

const duplicatesUnSorted = (list) => {
	let cur = list.head;
	while (cur != null) {
		// finding cur item in the list
		//[ 23(cur), 44, 233,  33, 44(prev), 23(curNext) ]
		let next = cur.next;
		let prev = cur;
		while (next != null) {
			if (next.val == cur.val) {
				prev.next = next.next;
				break;
			}

			prev = next;
			next = next.next;
		}
		cur = cur.next;
	}
};

const duplicatesUnSortedSet = (list) => {
	let set = new Set();
	let cur = list.head;
	let prev = null;

	while (cur != null) {
		if (set.has(cur.val)) {
			// value exist in set
			// [ 11, 22(prev), 22, 22(cur), 33, 44, 55 ]
			prev.next = cur.next;
			cur = cur.next;
			continue;
		}

		// storing value in the set
		set.add(cur.val);
		prev = cur;
		cur = cur.next;
	}
};
duplicatesUnSortedSet(list);
list.print();
