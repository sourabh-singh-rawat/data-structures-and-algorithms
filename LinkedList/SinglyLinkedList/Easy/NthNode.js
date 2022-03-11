import { LinkedList } from "../x/LinkedList.js";

const list = new LinkedList([ 1, 2, 3, 4, 5 ]);

// item at nth node
const nthNode = (list, position) => {
	let cur = list.head;
	for (let i = 0; i < position && cur != null; i++) {
		cur = cur.next;
	}

	return cur != null ? `item found at position ${position}: ${cur.val}` : `cannot find item at ${position} position`;
};

console.log(nthNode(list, 41));
