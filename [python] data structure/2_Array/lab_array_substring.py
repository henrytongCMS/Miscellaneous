
def subString(parent, child):

    position = []

    for i in range(len(parent)):
        for j in range(len(child)):

            # print("child[j]="+child[j])
            # print("parent[i+j]="+parent[i+j])
            # print("i={}".format(i))
            # print("j={}".format(j))
            # print("len(child)-1={}".format(len(child)-1))

            if child[j] != parent[i+j]:
                # print("break")
                break

            if j == len(child)-1:
                position.append(i)

        # print("-"*10)

    return position


parent = "This is a bookis"
child = "is"

position = subString(parent, child)

print("parent: " + parent)
print("child: " + child)

if(len(position) == 0):
    print("Substring not match!")

else:
    print("Substring match!")
    for i in position:
        print("Position: {}".format(i))