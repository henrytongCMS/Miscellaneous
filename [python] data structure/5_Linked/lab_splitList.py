from linkedList import *

node_0 = Node('3')
node_1 = Node('4')
node_2 = Node('5')
node_3 = Node('7')
node_4 = Node('8')

head = node_0
node_0.next = node_1
node_1.next = node_2
node_2.next = node_3
node_3.next = node_4

node1_0 = Node(None)
node2_0 = Node(None)

head1 = node1_0
head2 = node2_0


def split():

    global head, head1, head2

    p = head
    t1 = head1
    t2 = head2

    while head != None:

        if int(head.data) % 2 != 0:
            if t1.data == None:       
                t1.data = head.data

            else:
                t1.next = Node(head.data)
                t1 = t1.next
            
        else:
            if t2.data == None:       
                t2.data = head.data
        
            else:
                t2.next = Node(head.data)
                t2 = t2.next

        head = head.next
        

mylink = Linked(head)
mylink.printList()

split()

mylink_1 = Linked(head1)
mylink_1.printList()

mylink_2 = Linked(head2)
mylink_2.printList()