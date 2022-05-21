const arr = [1, 7, 3, 5, 3, 4];

function swap(arr, x, y) {
  let temp = arr[x];
  arr[x] = arr[y];
  arr[y] = temp;
}

function partition(arr, left, right) {
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
}

function quickSort(arr, left, right) {
  if (left < right) {
    let pi = partition(arr, left, right);

    quickSort(arr, left, pi - 1);
    quickSort(arr, pi + 1, right);
  }
}

console.log(arr);
quickSort(arr, 0, arr.length - 1);
console.log("QuickSorted:", arr);
