from myqueue import Queue

myq = Queue()

myq.Enqueue('A')
myq.Enqueue('B')
myq.Enqueue('C')
myq.Enqueue('D')
myq.Enqueue('E')
myq.Enqueue('F')

print("Origin: ", end=" ")
myq.PrintQueue()

len_now = myq.queueNo

def insertqK(k, data):

    i = 0
    while i < len_now:

        myq.Enqueue(myq.Dequeue())
        
        if myq.front+2 == k:
            myq.Enqueue(data)
            
        i += 1


def deleteqK(k):

    i = 0
    while i < len_now-1:

        if myq.front+2 == k:
            print("yes")
            myq.Dequeue()

        myq.Enqueue(myq.Dequeue())
            
        i += 1


# insertqK(3, 'B')
# print("Insert: ", end=" ")
# myq.PrintQueue()

deleteqK(3)
print("Delete: ", end=" ")
myq.PrintQueue()