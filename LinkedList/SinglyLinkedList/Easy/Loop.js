import { LinkedList } from "../x/LinkedList.js";

const list = new LinkedList([ 1, 2, 3, 4, 5 ]);
list.head.next.next.next.next.next = list.head;

// detecting loop
const detectLoop = (list) => {
	let curS = list.head;
	let curF = list.head;

	// 1(curS, curF)->2(curS)(curF)->3(curF)(curS)->4(curS)(curF)->5(curF)(curS)->1(curS, curF)
	// iterating over list
	while (curF != null && curF.next != null) {
		curS = curS.next;
		curF = curF.next.next;
		if (curS == curF) {
			return true;
		}
	}
	return false;
};

if (!detectLoop(list)) {
	list.print();
} else {
	console.log("cannot print list because of loop");
}
