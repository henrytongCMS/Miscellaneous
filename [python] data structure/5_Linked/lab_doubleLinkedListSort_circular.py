from lab_doubleLinkedList import *

myA = doubleNode('A')
myB = doubleNode('B')
myC = doubleNode('C')
myD = doubleNode('D')

head = None

def printDoubleList():

    p = d.head
    if p != None:
        while True:
            print(p.data, end=' ')
            p = p.next
            if p == d.head: break
        print()


def doubleSortCircular(node):
   
    if d.head == None:
        d.head = node
        d.head.pre = node
        d.head.next = node

    else:
        p = q = d.head

        if node.data < d.head.data:   # insert at first position
            node.next = d.head
            node.pre = d.head.pre
            d.head.pre.next = node
            d.head.pre = node
            d.head = node

        else:
            while p.data <= node.data:
                q = p
                p = p.next
                if p == d.head: break

            if p != d.head:         # insert at middle
                node.next = p
                node.pre = q
                p.pre = node
                q.next = node

            else:                   # insert at last
                node.pre = q
                node.next = p
                q.next = node
                p.pre = node



d = doubleLinked(head)

doubleSortCircular(myB)
printDoubleList()

doubleSortCircular(myD)
printDoubleList()

doubleSortCircular(myC)
printDoubleList()

doubleSortCircular(myA)
printDoubleList()