#實作雙向鏈結串列
class Node:
    # 宣告資料成員
    data = 0

    #建構子初始化資料成員
    def __init__(self, data):
	    self.data = data
	    self.pre = self
	    self.next = self

def printList(head):
    p = head
    if p!=None:
        while True:
            print(p.data, end=' ')
            p = p.next
            if p==head:
                break
    print()

def insertDoubleLinkedListSort(head, ptr):
    if head==None:                                  # 串列為空
        return ptr
    else:
        p = q = head
        if ptr.data<head.data:                     # 加入第一個位置
            ptr.next = head
            ptr.pre = head.pre
            head.pre.next = ptr
            head.pre = ptr
            return ptr
        else:
            p = p.next
            while p.data<ptr.data and p!=head:
                q = p
                p = p.next
            if p!=head:                             # 加入中間位置
                #print('medium: ', q.data, p.data)
                ptr.next = p
                ptr.pre = q
                p.pre = ptr
                q.next = ptr
            else:                                   # 加入最後位置
                #print('final: ', q.data, p.data)
                ptr.pre = q
                ptr.next = p
                q.next = ptr
                p.pre = ptr
            return head

myA = Node('A')
myB = Node('B')
myC = Node('C')
myD = Node('D')

head = None
head = insertDoubleLinkedListSort(head, myB)
printList(head)

head = insertDoubleLinkedListSort(head, myD)
printList(head)

head = insertDoubleLinkedListSort(head, myC)
printList(head)

head = insertDoubleLinkedListSort(head, myA)
printList(head)
