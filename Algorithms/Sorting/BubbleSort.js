let arr = [5, 4, 3, 2, 1];

const bubbleSort = (arr) => {
  let swapped = false;

  for (let j = 0; j < arr.length; j++) {
    for (let i = 0; i < arr.length - j - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        let temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
        swapped = true;
      }
    }

    if (!swapped) break;
  }
};

console.log("Array:", arr);
bubbleSort(arr);
console.log("Bubble Sorted Array:", arr);
