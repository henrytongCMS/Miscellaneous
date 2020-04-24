
# binary search -- iterative method
def binary_search_while(array, key):

    low = 0
    high = len(array) - 1

    while low <= high:
        
        middle = (low + high) // 2

        if array[middle] < key:
            low = middle + 1
        elif array[middle] > key:
            high = middle - 1
        else:
            return middle

    return -1


# binary search -- recursive method
def binary_search_rec(array, key, low, high):

    if low > high:
        return -1

    else:
        middle = (low + high) // 2

        if array[middle] < key:
            return binary_search_rec(array, key, middle+1, high)

        elif array[middle] > key:
            return binary_search_rec(array, key, low, middle-1)

        else:
            return middle



array = [5,12,34,56,76,81,99,123,145,168]
print(array)

key = int(input("Search: "))
print("Index = {}".format(binary_search_while(array, key)))
print("Index = {}".format(binary_search_rec(array, key, 0, len(array)-1)))