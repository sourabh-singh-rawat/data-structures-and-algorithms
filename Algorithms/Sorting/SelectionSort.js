let arr = [ 5, 4, 3, 2, 1 ];
let count = 0;
const selectionSort = (arr) => {
	for (let j = 0; j < arr.length; j++) {
		// pick the smallest element in the list
		let minimum = arr[j];
		let minimumIndex = j;
		for (let i = j; i < arr.length; i++) {
			if (arr[i] < minimum) {
				minimum = arr[i];
				minimumIndex = i;
			}
			count++;
		}

		// move the smallest element to left most place
		let temp = arr[minimumIndex];
		arr[minimumIndex] = arr[j];
		arr[j] = temp;
	}
};

selectionSort(arr);
console.log(arr, count);
