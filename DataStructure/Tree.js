// One Level Hierachy

// class Node {
//   constructor(data) {
//     this.data = data;
//     this.left = null;
//     this.right = null;
//   }
// }
// class BinaryTree {
//   constructor() {
//     this.root = null; // root is null
//   }
//   insert(data) {
//     let newNode = new Node(data); //100

//     if (this.root == null) {
//       this.root = newNode;
//       console.log("root node created..");
//     } else {
//       //console.log("logic to write the node may be left or right")
//       this.insertNode(this.root, newNode);
//     }
//   }

//   insertNode(node, newNode) {
//     if (node.left == null) {
//       node.left = newNode;
//       console.log("added left of root node");
//     } else {
//       console.log("added right of root node");
//       node.right = newNode;
//     }
//   }
// }

// let tree = new BinaryTree();
// tree.insert(100);
// tree.insert(10);
// tree.insert(50);
// tree.insert(200);
// console.log(tree);

class Node {
  constructor(data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}
class BinaryTree {
  constructor(data) {
    this.root = new Node(data); // root is null
  }
  //   insert(data) {
  //     let newNode = new Node(data); //100

  //     if (this.root == null) {
  //       this.root = newNode;
  //       console.log("root node created..");
  //     } else {
  //       //console.log("logic to write the node may be left or right")
  //       this.insertNode(this.root, newNode);
  //     }
  //   }

  insertNode(node, newNode) {
    if (node.left == null) {
      node.left = newNode;
      console.log("added left of root node");
    } else if (node.right == null) {
      console.log("added right of root node");
      node.right = newNode;
    } else {
      console.log("root node already conatins two child node");
    }
  }
}

let root = new BinaryTree(100);
let child1 = new BinaryTree(50);
let child2 = new BinaryTree(100);
root.insertNode(root, child1);
root.insertNode(root, child2);
console.log(root);

let child3 = new BinaryTree(30);
let child4 = new BinaryTree(60);
root.insertNode(child1, child3);
root.insertNode(child1, child4);
console.log(child1);

let child5 = new BinaryTree(20);
let child6 = new BinaryTree(25);
root.insertNode(child3, child5);
root.insertNode(child3, child6);
console.log(child3);
