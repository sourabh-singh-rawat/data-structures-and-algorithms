let x = "babbab";
let y = "abaaba";

let arr = new Array(y.length + 1);
for (let i = 0; i < arr.length; i++) {
  arr[i] = new Array(x.length + 1).fill(0);
}

for (let i = 1; i < arr.length; i++) {
  for (let j = 1; j < arr[i].length; j++) {
    if (x[i - 1] === y[j - 1]) {
      arr[i][j] = arr[i - 1][j - 1] + 1;
    } else {
      arr[i][j] = Math.max(arr[i][j - 1], arr[i - 1][j]);
    }
  }
}

for (let i of arr) {
  console.log(i + "");
}
