// class Graph {
//   constructor() {
//     this.adjacentList = {}; //empty Object Literal objects
//   }

//   addVertex(vertex) {
//     if (!this.adjacentList[vertex]) {
//       this.adjacentList[vertex] = [];
//       console.log(vertex);
//     } else {
//       console.log("Already formation present");
//     }
//   }
//   addEdge(vertex1, vertex2) {
//     this.adjacentList[vertex1].push(vertex2);
//     this.adjacentList[vertex2].push(vertex1);
//   }
// }

// let graph = new Graph();
// graph.addVertex("A");
// graph.addVertex("B");
// graph.addVertex("C");
// graph.addVertex("D");
// graph.addVertex("E");
// graph.addVertex("F");
// graph.addVertex("G");

// graph.addEdge("A", "B");
// graph.addEdge("B", "C");
// graph.addEdge("C", "E");
// graph.addEdge("E", "G");
// graph.addEdge("G", "B");
// graph.addEdge("G", "F");
// graph.addEdge("F", "D");
// graph.addEdge("D", "A");

// console.log(graph.adjacentList);

class Graph {
  constructor() {
    this.adjacenctList = {}; // empty object literal objects.
  }

  addCity(cityName) {
    //console.log(this.adjacencyList[cityName])
    if (!this.adjacenctList[cityName]) {
      this.adjacenctList[cityName] = []; // create the city
      //console.log("City added..")
    } else {
      console.log("City already exists ");
    }
  }

  addConnection(city1, city2, distance) {
    if (!this.adjacenctList[city1] || !this.adjacenctList[city2]) {
      console.log(
        "one or both cities not present in graph to connect to each others"
      );
      return;
    } else {
      //console.log("ready to connect")
      this.adjacenctList[city1].push({ city: city2, distance: distance });
      this.adjacenctList[city2].push({ city: city1, distance: distance });
    }
  }

  pringGraph(){
    console.log("City Connection details");

    for(let city in this.adjacenctList){
        // console.log(city);
        let connection = this.adjacenctList[city].map(obj => " connected to "+ obj.city+ " Distance is " + obj.distance + " miles");
        console.log(city + " -> " +connection)
        console.log(' ');
    }
  }
}

let graph = new Graph();
graph.addCity("Chicago");
graph.addCity("New York");
graph.addCity("Phoenix");
graph.addCity("Seattle");
graph.addCity("Florida");
graph.addCity("Anchorage");
graph.addCity("Raleigh");
graph.addCity("Denver");

graph.addConnection("Chicago", "Seattle", 700);
graph.addConnection("Chicago", "New York", 555);
graph.addConnection("New York", "Raleigh", 600);
graph.addConnection("Raleigh", "Florida", 1755);
graph.addConnection("Denever", "New York", 955);
graph.addConnection("Anchorage", "Denver", 1555);
graph.addConnection("Phoenix", "New York", 800);
graph.addConnection("Chicago", "Phoenix", 400);

console.log(graph.adjacenctList);
graph.pringGraph()
