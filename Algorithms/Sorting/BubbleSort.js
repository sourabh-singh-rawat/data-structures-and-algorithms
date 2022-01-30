let arr = [ 5, 4, 3, 2, 1 ];

const bubbleSort = (arr) => {
	for (let j = 0; j < arr.length; j++) {
		for (let i = 0; i < arr.length - 1 - j; i++) {
			if (arr[i] > arr[i + 1]) {
				let temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
	}
};

bubbleSort(arr);
console.log(arr);
