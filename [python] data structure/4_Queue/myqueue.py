import numpy as np

class Queue:

    capacity = 50
    queue = list(np.zeros(capacity))
    rear = 0
    front = 0
    queueNo = 0

    def Enqueue(self, key):

        if self.rear == self.capacity:
            print("Queue is full")

        else:
            self.rear = (self.rear + 1) % self.capacity
            self.queue[self.rear] = key
            self.queueNo += 1
            print("Data add to queue: {}".format(key))


    def Dequeue(self):

        if self.queueNo == 0:
            print("Queue is empty")

        else:
            self.front = (self.front + 1) % self.capacity
            data = self.queue[self.front]
            self.queueNo -= 1
            print("Data delete from queue: {}".format(data))
            return data


    def PrintQueue(self):

        for i in range(1, self.queueNo+1):
            print(self.queue[(self.front+i) % self.capacity], end=" ")
        print()