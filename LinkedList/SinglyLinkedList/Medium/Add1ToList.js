import { LinkedList, Node } from "../x/LinkedList.js";

const list = new LinkedList([ 9, 2, 1 ]); // 123
list.print();

// 9->2->1
const add1ToList = (list) => {
	let cur = list.head;
	let node = new Node(1);
	// 9 -> 2 -> 1 -> null
	// 1
	let carry = 0;
	while (cur != null) {
		let sum = cur.val + node.val;
		cur.val = sum % 10;
		carry = parseInt(sum / 10);

		cur = cur.next;
	}
};

add1ToList(list);
list.print();
