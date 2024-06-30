/*
 Quick Sort - >

 Its a highly efficient sorting algorithem
 its based on Divide and conquer paradigm.
 - it works by selecting 'pivot' element from an array and partitioning the other elements into two subArrats,
 according to whether they are less than or greater than the pivot. 
*/

let unsortedData = [4, 1, 7, 2, 5, 9, 8, 3];
console.log("unsorted data " + unsortedData);
let sortedData = quickSort(unsortedData, 0, unsortedData.length - 1);
console.log("sorted data " + sortedData);

function quickSort(array, low = 0, high = array.length - 1) {
  if (low < high) {
    const pi = partition(array, low, high);
    console.log("Pivot index : "+ pi );
    quickSort(array, low, pi - 1);
    quickSort(array, pi + 1, high);
  }
  return array;
}

function partition(array, low, high) {
  const pivot = array[high];
  let i = low - 1;

  for (let j = low; j < high; j++) {
    if (array[j] > pivot) {
      i++;
      [array[i], array[j]] = [array[j], array[i]]; // Swap elements
    }
  }
  [array[i + 1], array[high]] = [array[high], array[i + 1]]; // Swap elements
  return i + 1;
}
