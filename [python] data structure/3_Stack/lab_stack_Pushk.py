from stack import Stack

mystack = Stack()
mystack.stack = ['A','B','D','E',0]
mystack.top = 3
mystack.PrintStack()

tempstack = Stack()


def PushK(k, item):

    while mystack.top > -1:

        tempstack.Push(mystack.Pop())
        
        if mystack.top+2 == k:
            mystack.Push(item)
            break

    while tempstack.top > -1:
        mystack.Push(tempstack.Pop())
        

PushK(3, 'C')
mystack.PrintStack()