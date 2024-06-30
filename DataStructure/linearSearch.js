let arr = [4, 1, 7, 2, 5, 9, 8, 6, 3];
let target = 6;

let found = linearSearch(arr, target);
console.log(
  found !== -1 ? `Element found at index ${found}` : "Element not found"
);
// if (found) {
//   console.log(`element ${target} present in array`);
// } else {
//   console.log(`element ${target} not present in array`);
// }

function linearSearch(arr, target) {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === target) {
      return i;
    }
  }
  return -1;
}
