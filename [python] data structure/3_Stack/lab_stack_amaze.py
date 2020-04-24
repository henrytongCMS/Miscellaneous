import numpy as np
from stack import Stack

maze = [[1,1,1,1,1,1,1,1,1,1,1,1],
        [1,0,0,1,1,1,0,0,0,0,1,1],
        [1,1,0,0,0,0,0,1,0,1,1,1],
        [1,1,0,1,1,1,0,1,0,1,1,1],
        [1,1,0,1,0,0,0,1,1,0,1,1],
        [1,1,0,1,0,1,1,1,1,0,1,1],
        [1,1,0,1,0,0,0,0,0,0,1,1],
        [1,1,1,1,0,1,1,1,1,1,1,1],
        [1,1,0,0,0,0,0,0,0,0,1,1],
        [1,1,0,1,1,1,0,1,1,0,1,1],
        [1,1,0,1,1,0,0,1,1,0,0,1],
        [1,1,1,1,1,1,1,1,1,1,1,1]]

print(np.matrix(maze))

start_x, start_y = 1, 1
exit_x, exit_y = 10, 10

path_x = Stack()
path_x.stack = [start_x,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
path_x.top = 0

path_y = Stack()
path_y.stack = [start_y,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
path_y.top = 0

x = start_x
y = start_y

maze[x][y] = 2

while path_x.top > -1 and path_y.top > -1:

        # print("(x,y)=({},{}) (top_x,top_y)=({},{}) (path_x,path_y)=({},{})".format(
        #         x, y, path_x.top, path_y.top, path_x.stack[path_x.top], path_y.stack[path_y.top]))

        print("(path_x,path_y)=({},{})".format(path_x.stack[path_x.top], path_y.stack[path_y.top]))

        if(x == exit_x and y == exit_y): break
        
        go = False

        if maze[x-1][y] == 0: # north
                x -= 1
                go = True

        elif maze[x][y+1] == 0: # east
                y += 1
                go = True

        elif maze[x+1][y] == 0: # south
                x += 1
                go = True

        elif maze[x][y-1] == 0: # west
                y -= 1
                go = True
               
        else: # dead end
                go = False
                print("Dead end...")


        if go:
                path_x.Push(x)
                path_y.Push(y)
                maze[x][y] = 2

        else:                
                path_x.Pop()
                path_y.Pop()
                x, y = path_x.stack[path_x.top], path_y.stack[path_y.top]



print(">>> Maze solved! <<<")
print(np.matrix(maze))