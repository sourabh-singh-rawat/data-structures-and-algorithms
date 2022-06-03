// const arr = [5, 4, 3, 2, 1];

export const mergeSort = (arr, left, right) => {
  const mid = Math.floor((left + right) / 2);
  if (left < right) {
    mergeSort(arr, left, mid);
    mergeSort(arr, mid + 1, right);
    merge(arr, left, mid, right);
  }
};

const merge = (arr, left, mid, right) => {
  // length of both halves
  let n1 = mid - left + 1;
  let n2 = right - mid;

  // creating new temp arrays
  let tempL = new Array(n1);
  let tempR = new Array(n2);

  // copy the values in temp arr
  for (let i = 0; i < n1; i++) tempL[i] = arr[left + i];
  for (let j = 0; j < n2; j++) tempR[j] = arr[mid + 1 + j];

  // comparing the values in each temp arr and then storing then updating main arr accordingly
  let i = 0;
  let j = 0;
  let k = left;
  while (i < n1 && j < n2) {
    if (tempL[i] < tempR[j]) {
      arr[k] = tempL[i];
      i++;
    } else {
      arr[k] = tempR[j];
      j++;
    }
    k++;
  }

  // if any left, copy rest of the tempL values
  while (i < n1) {
    arr[k] = tempL[i];
    i++;
    k++;
  }

  // if any left, copy rest of the tempR values
  while (j < n2) {
    arr[k] = tempR[j];
    j++;
    k++;
  }
};

// console.log("Arr: ", arr);
// mergeSort(arr, 0, arr.length - 1);
// console.log("Merge sorted: ", arr);
