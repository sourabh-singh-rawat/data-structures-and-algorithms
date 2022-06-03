const arr = [5, 4, 3, 2, 1, 4];

// swaps two elements in an arr using their index
const swap = (arr, x, y) => {
  let temp = arr[x];
  arr[x] = arr[y];
  arr[y] = temp;
};

// partion around the pivot element.
const partition = (arr, left, right) => {
  let pivot = arr[right];
  let pivotIndex = left - 1;

  for (let i = left; i < right; i++) {
    if (arr[i] < pivot) {
      pivotIndex++;
      swap(arr, i, pivotIndex);
    }
  }

  pivotIndex++;
  swap(arr, pivotIndex, right);
  return pivotIndex;
};

// apply quickSort on both halves
const quickSort = (arr, left, right) => {
  if (left < right) {
    let pi = partition(arr, left, right);

    quickSort(arr, left, pi - 1);
    quickSort(arr, pi + 1, right);
  }
};

console.log("Arr: ", arr);
quickSort(arr, 0, arr.length - 1);
console.log("Quick sorted:", arr);
