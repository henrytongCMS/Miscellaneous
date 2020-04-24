import numpy as np


matrix = [[0,1,1,0,0,0,0,0],
          [1,0,0,1,1,0,0,0],
          [1,0,0,0,0,1,1,0],
          [0,1,0,0,0,0,0,1],
          [0,1,0,0,0,0,0,1],
          [0,0,1,0,0,0,0,1],
          [0,0,1,0,0,0,0,1],
          [0,0,0,1,1,1,1,0]]

visited = []

def DFS(graph, node):

    global visited

    if node not in visited:
        visited.append(node)
        for n in range(8):
            if graph[node][n] == 1:
                DFS(graph, n)


DFS(matrix, 0)
print("Visited nodes: ", np.array(visited)+1)