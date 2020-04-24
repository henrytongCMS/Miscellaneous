import numpy as np

class Stack:

    capacity = 100
    stack = list(np.zeros(capacity))
    top = -1

    def Push(self, key):

        if self.top == self.capacity - 1:
            print("Stack is full")

        else:
            self.top += 1
            self.stack[self.top] = key
            print("Data push to stack: {}".format(key))


    def Pop(self):

        if self.top == -1:
            print("Stack is empty")

        else:
            data = self.stack[self.top]
            self.top -= 1
            print("Data pop from stack: {}".format(data))
            return data


    def PrintStack(self):

        for i in range(self.top+1):
            print(self.stack[i], end=" ")
        print()