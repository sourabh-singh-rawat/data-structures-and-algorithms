let arr = [ 24, 23, 121, 12, 12121 ];

const partition = (arr, low, high) => {
	let pivot = arr[high];
	let i = low - 1; // index of pivot in sorted list

	for (let j = low; j < arr.length - 1; j++) {
		if (arr[j] < pivot) {
			i++;
			let temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	// swap 5 and 4;
	let temp = arr[high];
	arr[high] = arr[i + 1];
	arr[i + 1] = temp;

	return i + 1;
};

const quickSort = (arr, low, high) => {
	if (low < high) {
		let pi = partition(arr, low, high);
		quickSort(arr, low, pi - 1);
		quickSort(arr, pi + 1, high);
	}
};

quickSort(arr, 0, arr.length - 1);
console.log(arr);
