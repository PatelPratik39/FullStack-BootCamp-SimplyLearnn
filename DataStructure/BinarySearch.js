let arr = [4, 1, 7, 2, 5, 9, 8, 6, 3, 21];
target = 9;
console.log(arr);
let sortedArray = arr.sort();
console.log(sortedArray);

// descending sorting

arr.sort((a, b) => a - b); //asending order
console.log(arr);

arr.sort((a, b) => b - a); //Descending order
console.log(arr);

let index = binarySearch(arr, target);

console.log(
  index !== -1
    ? `Element ${target} present in position as ${index}`
    : `Element ${target} present`
);

// if (index != -1) {
//   console.log(`Element ${target} present in position as ${index}`);
// } else {
//   console.log(`Element ${target} present`);
// }

function binarySearch(arr, target) {
  let left = 0;
  let right = arr.length - 1;

  while (left <= right) {
    let mid = Math.floor((left + right) / 2);
    console.log("Mid value : " + mid);

    if (arr[mid] == target) {
      return mid;
    }
    // If taraget is greater than target than,  ignore the left half

    if (arr[mid] < target) {
      left = mid + 1;
    } else {
      //if target is less than, ignore the right half
      right = mid - 1;
    }
  }
  return -1;
}
