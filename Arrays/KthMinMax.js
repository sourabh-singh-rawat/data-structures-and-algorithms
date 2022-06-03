import { mergeSort } from "../Algorithms/Sorting/MergeSort.js";
const arr = [27, 1, 54, -23, 61, 3];
const minMax = { min: 0, max: 0 };
const k = 3;

console.log("Original:", arr);
mergeSort(arr, 0, arr.length - 1);
console.log("Merge sorted:", arr);

const left = 0;
const right = arr.length - 1;
minMax.min = arr[left];
minMax.max = arr[right];

console.log(minMax);
console.log(k, "minimum is", arr[k - 1]);
console.log(k, "maximum is", arr[right - k + 1]);
