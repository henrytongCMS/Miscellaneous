from tree import TreeNode
import lab_tree_binary_search as ltbs

def printTree(head):

    if head == None: 
        return

    else:
        printTree(head.left)
        print(head.data, end=' ')
        printTree(head.right)


for i in range(len(ltbs.data)):
    ltbs.createBinaryTree(ltbs.head, TreeNode(ltbs.data[i]))

printTree(ltbs.head)