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

    elif head.left == None and head.right == None:
        return 1

    else:
        if countTree(head.left) >= countTree(head.right):
            return countTree(head.left) + 1
        else:
            return countTree(head.right) + 1

print("Tree Height is: {}".format(countTree(head)))