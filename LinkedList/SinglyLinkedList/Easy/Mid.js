import { LinkedList } from "../x/LinkedList.js";

const list = new LinkedList([ 1, 2, 3, 4, 5 ]);

const midPointOfList = (list) => {
	let curS = list.head;
	let curF = list.head;
	while (curF != null && curF.next != null) {
		curS = curS.next;
		curF = curF.next.next;
	}

	return curS;
};

console.log(midPointOfList(list).val);
