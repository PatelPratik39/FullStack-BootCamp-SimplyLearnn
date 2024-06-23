class Node {
  constructor(data) {
    this.data = data; // data as instance variable
    this.next = null; // next is use to refer to another node
  }
}

class LinkedList {
  constructor(head = null) {
    console.log("lonked List constructor callled...");
    this.head = head;
  }
  appendNode(newNode) {
    let node = this.head; // head is null 1st time head is null
    if (node == null) {
    //   console.log("If Called ...");
      this.head = newNode; //girstNode is 100, next is null
      return;
    }
    while (node.next) {
    //   console.log("While Loop");
      node = node.next;
    } // travels from left to right then add new node in next property
    node.next = newNode; // newNode with data as 200 and next is null append to 100 node data.
  }

  printList() {
    let node = this.head; // first node
    //console.log("HEAD")
    process.stdout.write("[HEAD->");
    while (node) {
      //console.log(node.data)   // give the value as 100, 200
      process.stdout.write(node.data + "->");
      node = node.next; // it point to 2nd node, it point to 3rd node
    }
    process.stdout.write("NULL]");
    //console.log("NULL")
  }
  insertAt(index, newNode) {
    let node = this.head; // first node
    if (index == 0) {
      newNode.next = node;
      this.head = newNode;
      return;
    }

    while (--index) {
    //   console.log("while loop");
      if (node.next != null) {
        node = node.next;
      } else {
        throw new Error("out of index");
      }
    }
    let tempVal = node.next;
    node.next = newNode;
    newNode.next = tempVal;
  }

  removeNode(index) {
    let node = this.head; // making node as first node
    if (index == 0) {
      if (node != null) {
        // if there is no node present in list
        node = node.next;
        this.head = node;
      } else {
        throw new Error("No node present");
      }
      return;
    }
    while (--index) {
      if (node.next != null) {
        node = node.next;
      } else {
        throw new Error("No node present");
      }
    }
    node.next = node.next.next;
  }

  reverse() {
    let previousNode = null;
    let currentNode = this.head; ///so now nextNode is 2nd node
    if (currentNode == null) {
      return;
    }
    let nextNode;
    while (currentNode) {
      currentNode.next = previousNode;
      previousNode = currentNode;

      currentNode = nextNode;
    }
    this.head = previousNode;
  }
}

let myList = new LinkedList();
let firstNode = new Node(100);
let secondNode = new Node(200);
let thirdNode = new Node(300);
let fourthNode = new Node(400);
let fifthNode = new Node(500);

myList.appendNode(firstNode);
myList.appendNode(secondNode);
myList.appendNode(thirdNode);
myList.appendNode(fourthNode);
myList.appendNode(fifthNode);
// myList.printList();
// myList.insertAt(3, newFirstNode);
// console.log();
myList.printList();
myList.printList();
// myList.removeNode(3); // 1 position node as first node with data or value as 200
console.log();
myList.reverse();
myList.printList();
myList.reverse();
console.log();
myList.printList();
