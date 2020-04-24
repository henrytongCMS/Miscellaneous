
# recursive method
def sequential_search_rec(array, key, length):

    if length == 0:
        return -1

    elif array[length-1] == key:
        return length -1

    else:
        return sequential_search_rec(array, key, length-1)


array = [6,9,8,5,4,7,3,1,2,0]
print(array)

key = int(input("Search: "))
print("Index = {}".format(sequential_search_rec(array, key, len(array)-1)))