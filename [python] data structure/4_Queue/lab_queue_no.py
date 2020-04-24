from myqueue import Queue

myq = Queue()

myq.Enqueue('A')
myq.Enqueue('B')
myq.Enqueue('C')
myq.Enqueue('D')
myq.Enqueue('E')

myq.PrintQueue()
print("Elements in queue: ", myq.queueNo) # Please check queue.py for details

myq.Dequeue()
myq.PrintQueue()
print("Elements in queue: ", myq.queueNo) # Please check queue.py for details

myq.Enqueue('F')
myq.PrintQueue()
print("Elements in queue: ", myq.queueNo) # Please check queue.py for details