from stack import Stack

mystack = Stack()
mystack.stack = ['A','B','C','D','E']
mystack.top = 4
mystack.PrintStack()

tempstack = Stack()

def PopK(k):

    while mystack.top > -1:

        tempstack.Push(mystack.Pop())
        
        if mystack.top+1 == k:
            mystack.Pop()
            break

    while tempstack.top > -1:
        mystack.Push(tempstack.Pop())
        

PopK(3)
mystack.PrintStack()