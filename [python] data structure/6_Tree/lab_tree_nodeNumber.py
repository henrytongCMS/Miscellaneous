from tree import TreeNode

myA = TreeNode('A')
myB = TreeNode('B')
myC = TreeNode('C')
myD = TreeNode('D')
myE = TreeNode('E')
myF = TreeNode('F')

myA.left  = myB
myA.right = myC
myB.left  = myD
myB.right = myE
myC.left  = myF

head = myA


def countTree(head):

    if head == None: 
        return 0

    else:
        return countTree(head.left) + countTree(head.right) + 1

print("Node number is: {}".format(countTree(head)))