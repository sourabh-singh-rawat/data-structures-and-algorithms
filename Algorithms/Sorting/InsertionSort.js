let arr = [ 5, 4, 3, 2, 1 ];

const insertionSort = (arr) => {
	for (let i = 1; i < arr.length; i++) {
		let cur = arr[i];
		let prev = i - 1;

		// compare 4 with previous value?
		while (prev >= 0 && arr[prev] > cur) {
			arr[prev + 1] = arr[prev];
			prev--;
		}

		arr[prev + 1] = cur;
	}
};

insertionSort(arr);
console.log(arr);
