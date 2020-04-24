from linkedList import *

node_0 = Node('A')
node_1 = Node('B')
node_2 = Node('A')
node_3 = Node('D')

head = node_0
node_0.next = node_1
node_1.next = node_2
node_2.next = node_3

mylink = Linked(head)

mylink.printList()
print("Count = {}".format(mylink.countList()))

mylink.insertList("B", "Z")
mylink.printList()

mylink.deleteList("B") # delete who next to target
mylink.printList()

mylink.updateList("A", "Z")
mylink.printList()

mylink.reverseList()
mylink.printList()