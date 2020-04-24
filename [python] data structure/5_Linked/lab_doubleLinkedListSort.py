from lab_doubleLinkedList import *

myA = doubleNode('A')
myB = doubleNode('B')
myC = doubleNode('C')
myD = doubleNode('D')

head = None

def doubleSort(node):

    if d.head == None:
        d.insertDoubleList(None, node)

    else:
        p = q = d.head
        if node.data < d.head.data:
            d.insertDoubleList(None, node)

        else:
            while p.data < node.data:
                q = p
                p = p.next
                if p == None: break

            d.insertDoubleList(q, node)


d = doubleLinked(head)

doubleSort(myD)
d.printDoubleList()

doubleSort(myB)
d.printDoubleList()

doubleSort(myC)
d.printDoubleList()

doubleSort(myA)
d.printDoubleList()
