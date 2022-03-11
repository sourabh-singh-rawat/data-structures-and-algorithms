import { LinkedList } from "../x/LinkedList.js";

const list = new LinkedList();
list.append(13);
list.append(41);
list.append(89);
list.append(9);
list.append(45);
list.append(23);

list.print();

let count = list.length;
let counter = 0;
list.recursiveLength = function() {
	if (count == 0) {
		return;
	}
	count--;
	counter++;
	this.recursiveLength();
};
list.recursiveLength();
console.log(counter);
