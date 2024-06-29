function selectionSort(arr) {
  let n = arr.length;

  // One by one move the boundary of the unsorted subarray
  for (let i = 0; i < n - 1; i++) {
    // Find the minimum element in the unsorted array
    let minIndex = i;
    for (let j = i + 1; j < n; j++) {
      if (arr[j] < arr[minIndex]) {
        minIndex = j;
      }
    }

    // Swap the found minimum element with the first element
    let temp = arr[minIndex];
    arr[minIndex] = arr[i];
    arr[i] = temp;
  }

  return arr;
}

// Example usage:
const array = [64, 25, 12, 22, 11];
console.log("Unsorted array:", array);
const sortedArray = selectionSort(array);
console.log("Sorted array:", sortedArray);
