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


Breadth-first search:
RULE 1
Visit the next unvisited vertex (if there is one) that’s adjacent to the current vertex, mark it,
and insert it into the queue.

RULE 2
If you can’t carry out Rule 1 because there are no more unvisited vertices, remove a vertex
from the queue (if possible) and make it the current vertex.


Minimum Spanning Trees - can be found using dfs


Directed Graphs
  - Edges only have one entry in the adjacency matrix
  - Topological Sorting
    - Step 1: Find a vertex that has no successors. The successors to a vertex are those vertices that are directly “downstream” from        it
    - Step 2: Delete this vertex from the graph, and insert its label at the beginning of a list
    - Works on unconnecgted graphs
    - Cannot handle cycles
  - Graph with no cycles is called a tree
