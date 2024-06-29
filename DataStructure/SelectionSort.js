let unsortedData = [4, 1, 7, 2, 5, 9, 8, 3];
console.log("unsorted data " + unsortedData);
let sortedData = selectionSort(unsortedData);
console.log("sorted data " + sortedData);

function selectionSort(arr) {
  let len = arr.length;

  for (let i = 0; i < len - 1; i++) {
    let minIndex = i;

    // find the minimum elements in the unsorted part of the array

    for (let j = i + 1; j < len; j++) {
      if(arr[j] < arr[minIndex]){     //< asc
    //   if (arr[j] > arr[minIndex]) {
        minIndex = j;
      }
    }

    // swap the minium elements with first element of unsorted part or list
    if (minIndex != i) {
      let temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }
  return arr;
}
