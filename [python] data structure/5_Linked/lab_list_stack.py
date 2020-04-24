from linkedList import Node

class list_stack:

    def __init__(self, head):
        self.head = head


    def push(self, newNode):

        if self.head == None:
            self.head = newNode

        else:
            newNode.next = self.head
            self.head = newNode


    def pop(self):

        p = ""  
        if self.head == None:
            return None

        else:
            p = self.head
            self.head = self.head.next
            return p


    def top(self):

        return self.head.data


    def printStack(self):

        p = self.head
        if p!= None:
            while p != None:
                print(p.data, end=' ')
                p = p.next
            print()


mystack = list_stack(None)

mystack.push(Node('A'))
mystack.push(Node('B'))
mystack.push(Node('C'))
mystack.push(Node('D'))
mystack.printStack()

print("Top of stack is: {}".format(mystack.top()))

item = mystack.pop()
mystack.printStack()
print("Pop from stack: {}".format(item.data))

print("Top of stack is: {}".format(mystack.top()))