// work in progress
import { LinkedList, Node } from "../x/LinkedList.js";

const list = new LinkedList([ 9, 9, 9 ]);
list.print();

// 9->2->1
const add1ToList = (list) => {
	let cur = list.head;
	let node = new Node(1);
	// 9 -> 2 -> 1 -> null
	// 1
	let carry = 1;
	while (cur != null) {
		let sum = cur.val + carry;
		cur.val = sum % 10;
		carry = parseInt(sum / 10);

		cur = cur.next;
	}

	if (carry) {
		// append new node with 1 to the end of the list
		let node = new Node(1);
		let cur = list.head;
		while (cur.next != null) {
			cur = cur.next;
		}
		cur.next = node;
	}
};

add1ToList(list);
list.print();
