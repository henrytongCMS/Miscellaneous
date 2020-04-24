from tree import TreeNode

# Tree 1
mA = TreeNode('A')
mB = TreeNode('B')
mC = TreeNode('C')
mD = TreeNode('D')
mE = TreeNode('E')
mF = TreeNode('F')

mA.left  = mB
mA.right = mC
mB.left  = mD
mB.right = mE
mC.left  = mF

mhead = mA

# Tree 2
nA = TreeNode('A')
nB = TreeNode('B')
nC = TreeNode('C')
nD = TreeNode('D')
nE = TreeNode('E')
nF = TreeNode('F')

nA.left  = nB
nA.right = nC
nB.left  = nD
nB.right = nE
nC.right  = nF

nhead = nA

def isSameTree(mhead, nhead):

    if mhead == None and nhead == None:
        return True

    elif mhead != None and nhead != None:
        return  (mhead.data == nhead.data) and isSameTree(mhead.left, nhead.left) and isSameTree(mhead.right, nhead.right) 

    return False


print("Is same tree? {}".format(isSameTree(mhead, nhead)))