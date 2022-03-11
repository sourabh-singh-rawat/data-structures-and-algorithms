class LinkedList {
	constructor(arr) {
		this.head = null;
		if (arr) for (let item of arr) this.append(item);
	}

	// adds item to the beginning of the list
	push(val) {
		let node = new Node(val);

		// check if the list is empty
		if (this.head === null) {
			this.head = node;
			return;
		}

		// node -> item head -> item;
		node.next = this.head;
		this.head = node;
	}

	// add item to the end of the list
	append(val) {
		const node = new Node(val); // create a new node

		// list empty
		if (this.head === null) {
			this.head = node;
			return;
		}

		// go to the ned of the list and append the val
		let cur = this.head;
		while (cur.next !== null) {
			cur = cur.next;
		}
		cur.next = node;
	}

	print() {
		let cur = this.head;
		let newArr = [];
		while (cur !== null) {
			newArr.push(cur.val);
			cur = cur.next;
		}
		console.log(newArr);
	}

	get length() {
		let count = 0;
		let cur = this.head;
		while (cur != null) {
			count++;
			cur = cur.next;
		}

		return count;
	}
}

class Node {
	constructor(val) {
		this.val = val;
		this.next = null;
	}
}

export { Node, LinkedList };

// let list = new LinkedList();
// list.push(1);
// list.push(2);
// list.push(3);
// list.push(32);
// list.push(43);
// list.print();
// console.log(list.length);
