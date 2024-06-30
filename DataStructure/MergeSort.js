let unsortedData = [4, 1, 7, 2, 5, 9, 8, 3];
console.log("unsorted data " + unsortedData);
//mergeSort(unsortedData);
let sortedData = mergeSort(unsortedData);
console.log("sorted data " + sortedData);

function mergeSort(arr) {
  if (arr.length <= 1) {
    //
    return arr;
  } else {
    let mid = Math.floor(arr.length / 2); // 4
    let leftHalf = arr.slice(0, mid); // 0 to 3 position 4-1 2nd parameter size-1
    console.log("mid " + mid);
    let rightHalf = arr.slice(mid);
    //console.log(leftHalf+"="+rightHalf)
    // recursively sort each halves
    let sortedLeftHalf = mergeSort(leftHalf);
    let sortedRightHalf = mergeSort(rightHalf);

    let result = merge(sortedLeftHalf, sortedRightHalf);
    return result;
  }
}

function merge(leftArray, rightArray) {
  let result = [];
  let leftIndex = 0;
  let rightIndex = 0;

  // merge left and right into result in sorted order.
  while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
    if (leftArray[leftIndex] > rightArray[rightIndex]) {
      result.push(leftArray[leftIndex]);
      leftIndex++;
    } else {
      result.push(rightArray[rightIndex]);
      rightIndex++;
    }
  }

  let remainingData = result
    .concat(leftArray.slice(leftIndex))
    .concat(rightArray.slice(rightIndex));
  return remainingData;
}

// console.log(Math.ceil(10.1)) // 11
// console.log(Math.ceil(10.9)) //11

// console.log(Math.ceil(10.1)) // 10
// console.log(Math.ceil(10.9)) //10
