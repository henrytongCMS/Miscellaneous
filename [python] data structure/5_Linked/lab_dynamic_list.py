from linkedList import *

myList = [50,30,40,60]

head = None
tail = None

for i in range(len(myList)):

    newNode = Node(myList[i])

    if head == None:
        head = tail = newNode

    else:
        tail.next = newNode
        tail = tail.next

myList = Linked(head)
myList.printList()