from  linkedList import *

myList = [5,28,19,15,20,33,12,17,10]

head = [None] * len(myList)
tail = [None] * len(myList)

for i in range(len(myList)):

    mod = myList[i] % 9
    newNode = Node(myList[i])

    if head[mod] == None:
        head[mod] = tail[mod] = newNode

    else:
        tail[mod].next = newNode
        tail[mod] = tail[mod].next


for i in range(9):

    myList = Linked(head[i])
    print('bucket[{}]:'.format(i), end=' ')

    if head[i] == None:
        print()
    else:
        myList.printList()