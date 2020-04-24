import numpy as np
import collections

matrix = [[0,1,1,0,0,0,0,0],
          [1,0,0,1,1,0,0,0],
          [1,0,0,0,0,1,1,0],
          [0,1,0,0,0,0,0,1],
          [0,1,0,0,0,0,0,1],
          [0,0,1,0,0,0,0,1],
          [0,0,1,0,0,0,0,1],
          [0,0,0,1,1,1,1,0]]

visited = []

def BFS(graph, root):

    queue = collections.deque([root])
    visited.append(root)

    while queue:
        vertex = queue.popleft()
        for neighbor in range(8):
            if graph[vertex][neighbor] == 1:
                if neighbor not in visited:
                    visited.append(neighbor)
                    queue.append(neighbor)


BFS(matrix, 0)
print("Visited nodes: ", np.array(visited)+1)