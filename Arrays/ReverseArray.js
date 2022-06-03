const arr = [5, 4, 3, 2, 1];

const swap = (arr, x, y) => {
  let temp = arr[x];
  arr[x] = arr[y];
  arr[y] = temp;
};

// without recursion
const reverseArr = (arr) => {
  let left = 0;
  let right = arr.length - 1;

  while (left < right) {
    swap(arr, left, right);
    left++;
    right--;
  }
};

// using recursion
const reverse = (arr, left, right) => {
  if (left < right) {
    swap(arr, left, right);
    reverse(arr, left + 1, right - 1);
  }
};

console.log("Arr: ", arr);
reverseArr(arr);
console.log("Reversed Arr: ", arr);
reverse(arr, 0, arr.length - 1);
console.log("Reversed arr using recursion: ", arr);
