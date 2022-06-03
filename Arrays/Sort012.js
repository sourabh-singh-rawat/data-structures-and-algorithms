// Sort an array of 0s, 1s and 2s
const arr = [0, 2, 1, 2, 0];

// Naive
const sort = (arr) => {
  let tempArr = [];
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === 0) {
      tempArr.push(0);
    }
  }

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === 1) {
      tempArr.push(1);
    }
  }

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === 2) {
      tempArr.push(2);
    }
  }

  for (let i = 0; i < arr.length; i++) {
    arr[i] = tempArr[i];
  }
};

console.log("Arr:", arr);
sort(arr);
console.log("Sorted: ", arr);
