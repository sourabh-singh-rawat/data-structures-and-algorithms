let arr = [5, 4, 3, 2, 1];

const swap = (arr, x, y) => {
  let temp = arr[x];
  arr[x] = arr[y];
  arr[y] = temp;
};

const bubbleSort = (arr) => {
  let swapped = false;

  for (let j = 0; j < arr.length; j++) {
    for (let i = 0; i < arr.length - j - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        swap(arr, i, i + 1);
        swapped = true;
      }
    }

    // stop, if no swap in previous iteration
    if (!swapped) break;
  }
};

console.log("Arr:", arr);
bubbleSort(arr);
console.log("Bubble sorted:", arr);
