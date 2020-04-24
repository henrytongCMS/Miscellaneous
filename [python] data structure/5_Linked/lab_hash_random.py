import random
from  linkedList import *

myList = random.sample(range(0,1001),100)

print(myList)

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