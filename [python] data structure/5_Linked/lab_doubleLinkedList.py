class doubleNode:

    def __init__(self, data): 
        
        self.data = data  # store data
        self.pre  = None  # store the reference (previous item) # self for circular linked
        self.next = None  # store the reference (next item) # self for circular linked


class doubleLinked:

    def __init__(self, head): 
        
        self.head = head


    def printDoubleList(self):

        p = self.head
        if p != None:
            while p != None:
                print(p.data, end=' ')
                p = p.next
            print()


    def insertDoubleList(self, target, item):

        if self.head == None:
            self.head = item

        elif target == None:
            item.next = self.head
            self.head.pre = item
            self.head = item

        elif target.next == None:
            target.next = item
            item.pre = target

        else: 
            item.pre = target
            item.next = target.next
            target.next.pre = item
            target.next = item


    def deleteDoubleList(self, target):

        if target == self.head:
            if self.head.next == None:
                self.head = None
            
            else:
                q = target
                self.head = self.head.next
                q.next = None
                self.head.pre = None

        elif target.next != None: 
            target.next.pre = target.pre
            target.pre.next = target.next
            target.next = target.pre = None

        else:
            target.pre.next = None
            target.pre = None