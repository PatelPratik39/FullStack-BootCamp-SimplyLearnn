class Stack {
  constructor() {
    this.array = []; // array Object created
  }
  push(element) {
    if (this.array.length <= 6) {
      this.array.push(element); //need to wright the code to add element
      console.log("Add Push successfully");
    } else {
      this.array.push();
    }
  }

  pop() {
    if (this.array.length == 0) {
      console.log("Stack is empty or undefined");
    } else {
      this.array.pop(); // remove top most element from array
    }
  }
  peek() {
    //peek retrieve top most element from stack but not remove an element
    if (this.array.length == 0) {
      console.log("Stack is empty or undefined");
    } else {
      //   this.array.peek(); // remove top most element from array
      return this.array[this.array.length - 1]; //it gives top most element
    }
  }

  isEmpty() {
    if (this.array.length == 0) {
      return true;
    } else {
      return false;
    }
  }

  //   print stack top to bottom
  printStack() {
    for (let i = this.array.length - 1; i >= 0; i--) {
      console.log(this.array[i]);
    }
  }
}
