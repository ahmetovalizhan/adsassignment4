# Assignment 4 - Graph Traversal and Representation System

## Project Overview

This project demonstrates graph representation and traversal algorithms in Java.

The graph is implemented using an adjacency list structure.  
Each graph consists of vertices and edges.

Implemented algorithms:
- Breadth-First Search (BFS)
- Depth-First Search (DFS)

Graphs of different sizes were tested:
- Small graph (10 vertices)
- Medium graph (30 vertices)
- Large graph (100 vertices)

---

# Classes Description

## Vertex Class

Represents a graph node.

Fields:
- id — unique vertex identifier

Methods:
- constructor
- getter
- toString()

---

## Edge Class

Represents a connection between two vertices.

Fields:
- source
- destination

Methods:
- constructor
- getters
- toString()

---

## Graph Class

Represents graph structure using adjacency list.

Main methods:
- addVertex()
- addEdge()
- printGraph()
- bfs()
- dfs()

Adjacency list stores neighbors for every vertex.

Example:

0 -> [1, 2]
1 -> [0, 3]

---

# BFS Algorithm

Breadth-First Search explores vertices level by level.

BFS uses:
- Queue
- Visited set

Steps:
1. Start from selected vertex
2. Add vertex to queue
3. Visit neighbors
4. Continue until queue becomes empty

Use cases:
- Shortest path
- Social networks
- GPS systems

Time Complexity:

```math
O(V + E)
```

Where:
- V = vertices
- E = edges

---

# DFS Algorithm

Depth-First Search explores graph deeply before backtracking.

DFS uses:
- Recursion
- Visited set

Steps:
1. Visit current vertex
2. Move deeper recursively
3. Backtrack when needed

Use cases:
- Path finding
- Maze solving
- Topological sorting

Time Complexity:

```math
O(V + E)
```

---

# Experimental Results

| Graph Size | BFS Time | DFS Time |
|------------|----------|----------|
| 10 vertices | Measured in program | Measured in program |
| 30 vertices | Measured in program | Measured in program |
| 100 vertices | Measured in program | Measured in program |

## Observations

- Larger graphs require more traversal time.
- BFS and DFS have similar complexity.
- Traversal order depends on graph structure.

---

# Reflection

This assignment helped me understand graph traversal algorithms and adjacency list representation.

I learned the difference between BFS and DFS and how traversal order changes depending on graph structure.

One challenge during implementation was understanding recursion in DFS and managing visited vertices correctly.

---

# Screenshots

Include screenshots of:
- Graph structure
- BFS traversal
- DFS traversal
- Performance results