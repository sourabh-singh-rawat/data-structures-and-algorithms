import { LinkedList } from "../x/LinkedList.js";

const list = new LinkedList([ 1, 2, 3, 4, 5 ]);

const reveseThreePointers = (list) => {
	let cur = list.head;
	let prev = null;
	let next = null;

	// [ null<-1<-2(prev) null(next, cur) ]
	while (cur != null) {
		next = cur.next;
		cur.next = prev;
		prev = cur;
		cur = next;
	}

	list.head = prev;
};

// reveseThreePointers(list);
const reverseStack = (list) => {
	// storing each node stack;
	let stack = [];
	let cur = list.head;
	while (cur != null) {
		stack.push(cur.val);
		cur = cur.next;
	}

	return new LinkedList(stack.reverse());
};
console.log("Reversed array using three pointer: ");
reveseThreePointers(list);
list.print();

console.log("Reversed array using stack: makes new list");
reverseStack(list).print();
