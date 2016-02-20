# Undirected graphs

Need a list of vertices and either an adjacency matrix or an adjacency list.

-Adjacency matrix: used to represent connections among vertices in a graph
-Adjacency list: linked list containing adjacent vertices given for each vertex

#############################################################################################
Depth-first search:
- depth-first search uses a stack to remember where it should go when it reaches a
  dead end
- Pick a starting point A.
  - 1.Visit the vertex
  - 2.Push it on to a stack so you can remember it
  - 3.Mark it so you won't visit it again
-Go to an adjacent vertex


-Rule 1: If possible, visit an adjacent unvisited vertex, mark it, and push it on the stack

-Rule 2: If you can’t follow Rule 1, then, if possible, pop a vertex off the stack
