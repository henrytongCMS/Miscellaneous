from tree import TreeNode

data = [5,7,3,4,6,8,9,1,2]
head = None

def createBinaryTree(h, newNode):

    global head

    if head == None:
        head = newNode

    else:
        if newNode.data < h.data:
            if h.left == None:
                h.left = newNode
            else:
                createBinaryTree(h.left, newNode)

        else:
            if h.right == None:
                h.right = newNode
            else:
                createBinaryTree(h.right, newNode)