// head -> 1 -> 2(prev) -> 3(cur) -> null;
// head -> 1 -> 2(prev) -> null  3(cur) -> head;
import { LinkedList } from "../x/LinkedList.js";

const list = new LinkedList();
list.append(1);
list.append(2);
list.append(3);
list.append(31);
list.append(98);

list.lastElementToFront = function() {
	// find the last element
	let cur = this.head,
		prev = null;

	while (cur.next != null) {
		prev = cur;
		cur = cur.next;
	}

	cur.next = this.head;
	this.head = cur;
	prev.next = null;
};

list.print();
list.lastElementToFront();
list.print();
