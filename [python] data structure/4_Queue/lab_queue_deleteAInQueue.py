from myqueue import Queue

myq = Queue()

myq.Enqueue('A')
myq.Enqueue('B')
myq.Enqueue('C')
myq.Enqueue('D')
myq.Enqueue('A')
myq.Enqueue('E')

myq.PrintQueue()

len_now = myq.queueNo

def deleteqA(item):

    i = 0
    while i < len_now:
        
        if myq.queue[myq.front+1] != item:
            myq.Enqueue(myq.Dequeue())

        else:
            myq.Dequeue()

        i += 1

def deleteqA2(item):

    gap = 0
    for i in range(1, myq.queueNo+1):

        if myq.queue[myq.front+i] == item:
            gap += 1

        else:
            myq.queue[myq.front+i-gap] = myq.queue[myq.front+i]

    myq.queueNo -= gap
    myq.rear -= gap


deleteqA2('A')
myq.PrintQueue() # Should be empty