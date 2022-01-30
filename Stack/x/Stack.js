class Stack {
	constructor() {
		this.MAX = 2;
		this.top = -1;
		this.contents = [];
	}

	push(item) {
		// check if the stack is already full
		if (this.top >= this.MAX - 1) {
			console.log("Overflow, cannot add item to the stack.");
			return;
		}

		this.top++;
		this.contents[this.top] = item;
	}

	pop() {
		// check if there is item in the stack
		if (this.top < 0) {
			console.log("Underflow, cannot delete item from the stack.");
			return;
		}

		this.top--;
		let newArr = [];
		for (let i = 0; i <= this.top; i++) {
			newArr[i] = this.contents[i];
		}
		this.contents = newArr;
	}

	print() {
		if (this.top < 0) {
			console.log("Cannot print, no item in the stack.");
			return;
		}

		console.log(this.contents);
	}

	get length() {
		return this.contents.length;
	}
}

const stack = new Stack();
stack.print();
stack.push(1);
stack.push(0);
stack.push("hello");
stack.print();
stack.pop();
stack.pop();
stack.print();
stack.push(3);
console.log(stack);
