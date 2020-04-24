from stack import Stack

mystack = Stack()
mystack.stack = ['A','C','B','A','D','F',0,0,0,0]
mystack.top = 5
mystack.PrintStack()

tempstack = Stack()

for i in range(mystack.top+1):

    if mystack.stack[mystack.top] != "A":
        tempstack.Push(mystack.Pop())
    else:
        mystack.Pop()

for j in range(tempstack.top+1):
    mystack.Push(tempstack.Pop())


tempstack.PrintStack() # should be empty
mystack.PrintStack()