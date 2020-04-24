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

# Print the tree with infix method

def printTree(head):

    if head == None: 
        return

    else:
        printTree(head.left)
        print(head.data, end=' ')
        printTree(head.right)


printTree(head)