const arr = [1, 2, 3, 4, 5];
const item = 5;

// iterate over each array element and compare element with item
const linearSearch = (arr, item) => {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === item) return console.log("found item at index:", i);
  }
  return console.log("item not found.");
};

linearSearch(arr, item);
