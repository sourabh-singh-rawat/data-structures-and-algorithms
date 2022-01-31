// count the times an item occuerred in a list
import { LinkedList } from "../x/LinkedList.js";

let item = 25;

let list = new LinkedList();
list.append(11);
list.append(25);
list.append(13);
list.append(67);
list.append(98);
list.append(25);
list.print();

list.countSearch = function(item) {
	// count this item occurence in list
	let cur = this.head;
	let count = 0;

	while (cur != null) {
		if (cur.val === item) {
			count++;
		}
		cur = cur.next;
	}

	return count;
};

console.log(`${item} occurred ${list.countSearch(item)} times`);
