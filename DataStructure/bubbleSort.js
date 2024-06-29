let data = [4,1,7,9,6,4,3,6]
console.log("Unsorted Data :  " + data );

let sortedData = buubleSort(data);
console.log(sortedData);

function buubleSort(arr) {
    let len = arr.length;
    let swapped;

    do {
      swapped = false;
      for (let i = 0; i < len; i++) {
        // if (arr[i] < arr[i + 1]) {    //Desc
            if (arr[i] > arr[i + 1]) {   //ascending
          // swap logic
          let temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          swapped = true;
        }
      }
    } while (swapped);
    return arr;
}