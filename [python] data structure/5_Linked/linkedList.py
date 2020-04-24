class Node:

    def __init__(self, data): 
        
        self.data = data # store data
        self.next = None # store the reference (next item)


class Linked:

    def __init__(self, head): 
        
        self.head = head


    def printList(self):

        p = self.head
        if p != None:
            while p != None:
                print(p.data, end=' ')
                p = p.next
            print()


    def countList(self):

        count = 0
        p = self.head
        while p != None:
            count += 1
            p = p.next

        return count


    def deleteList(self, target):

        p = self.head
        while p != None:
            if p.data == target:
                q = p.next
                p.next = q.next
                break
            p = p.next 


    def insertList(self, target, item):

        p = self.head
        q = Node(item)
        while p != None:
            if p.data == target:
                q.next = p.next
                p.next = q
                break
            p = p.next


    def updateList(self, target, item):

        p = self.head
        while p != None:
            if p.data == target:
                p.data = item
            p = p.next
                

    def reverseList(self):

        previous = None
        current = self.head
        preceding = self.head.next

        while preceding != None:
            current.next = previous
            previous = current
            current = preceding
            preceding = current.next

        current.next = previous # last node
        self.head = current 