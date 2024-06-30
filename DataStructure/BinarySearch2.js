let arr = [4, 1, 7, 2, 5, 9, 8, 6, 3, 21];
target = 9;
// Sort the array
arr.sort((a, b) => a - b);

const result = binarySearch(arr, target);
console.log(
  result !== -1 ? `Element found at index ${result}` : "Element not found"
);

function binarySearch(arr, target){
    let low = 0;
    let high = arr.length - 1;


    while(low <= high) {
        const mid = Math.floor((low + high)/2);
        const guess = arr[mid];

        if(guess === target){
          return mid; // Return the index of the found element
        }

        if(guess > target){
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return -1;
}