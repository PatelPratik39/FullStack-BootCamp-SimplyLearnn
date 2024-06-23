class Queue {
  constructor() {
    this.items = [];
  }
  enqueue(element) {
    if (this.items.length <= 4) {
      this.items.push(element);
      console.log("Add Items in Queue");
    } else {
      console.log("Queue is Full");
    }
  }
  dequeue() {
    if (this.isEmpty()) {
      return "Queue is Empty";
    } else {
      return this.items.shift(); //remove elements
    }
  }

  isEmpty() {
    if (this.items.length == 0) {
      return true;
    } else {
      return false;
    }
  }
  peek() {
    if (this.isEmpty()) {
      return "Queue is empty";
    } else {
      return this.items[0]; // retrieve first elements
    }
  }
  size() {
    return this.items.length;
  }
}


let queue = new Queue();
console.log("Empty "+ queue.isEmpty());
queue.enqueue(100);
queue.enqueue(200);
queue.enqueue(300);
queue.enqueue(400);
queue.enqueue(500);
queue.enqueue(600);
console.log("Size " + queue.size());
console.log("Dequeue " + queue.dequeue());
console.log("Peek " + queue.peek());
console.log("Size " + queue.size());
console.log("Empty " + queue.isEmpty());