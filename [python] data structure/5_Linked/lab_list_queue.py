from linkedList import Node

class list_queue:

    def __init__(self):
        self.front = self.rear = None


    def insertQueue(self, newNode):
        
        if self.rear == None:
            self.front = self.rear = newNode
        
        else:
            self.rear.next = newNode
            self.rear = newNode


    def deleteQueue(self):

        p = ""
        if self.rear == None:
            return None
        
        else:
            p = self.front
            self.front = self.front.next
            return p


    def printQueue(self):

        p = self.front
        if p!= None:
            while p != None:
                print(p.data, end=' ')
                p = p.next
            print()



myqueue = list_queue()

myqueue.insertQueue(Node('A'))
myqueue.insertQueue(Node('B'))
myqueue.insertQueue(Node('C'))
myqueue.insertQueue(Node('D'))
myqueue.printQueue()

item = myqueue.deleteQueue()
myqueue.printQueue()
print("Delete from queue: {}".format(item.data))