const arr = [5, 4, 3, 2, 1];

const rotateByOne = (arr, direction) => {
  if (direction === "left") {
    const first = arr[0];
    for (let i = 0; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[arr.length - 1] = first;
  }

  if (direction === "right") {
    const last = arr[arr.length - 1];
    for (let i = arr.length - 1; i >= 0; i--) {
      arr[i] = arr[i - 1];
    }
    arr[0] = last;
  }
};

console.log("Original:", arr);
rotateByOne(arr, "left");
console.log("Rotate by one: left", arr);
rotateByOne(arr, "right");
console.log("Rotate by one: right", arr);
