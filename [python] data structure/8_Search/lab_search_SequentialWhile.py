
# for loop
def sequential_search_for(array, key):

    for i in range(0, 10):
        if array[i] == key:
            return i
    return -1


# while loop
def sequential_search_while(array, key):

    i = 0
    while i < 10:
        if array[i] == key:
            return i
        i += 1
    return -1


array = [6,9,8,5,4,7,3,1,2,0]
print(array)

key = int(input("Search: "))
print("Index = {}".format(sequential_search_for(array, key)))
print("Index = {}".format(sequential_search_while(array, key)))