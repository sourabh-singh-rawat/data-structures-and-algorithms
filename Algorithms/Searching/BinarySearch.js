const arr = [1, 2, 3, 4, 5];
const item = 5;

function binarySearch(arr, left, right, item) {
  if (left <= right) {
    let mid = Math.floor((left + right) / 2);
    let midItem = arr[mid];

    if (midItem === item) {
      return console.log("found at index:", mid);
    } else if (item < midItem) {
      return binarySearch(arr, left, mid - 1, item);
    } else if (item > midItem) {
      return binarySearch(arr, mid + 1, right, item);
    }

    return console.log("not found!");
  }
}

binarySearch(arr, 0, arr.length, item);
