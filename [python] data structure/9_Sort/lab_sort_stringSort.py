import random

def QuickSort(data, left, right):

    if left >= right: return

    lower = left
    upper = right

    key = data[left]

    while lower != upper:

        while data[upper] > key and lower < upper:
            upper -= 1
        while data[lower] <= key and lower < upper:
            lower += 1
        if lower < upper:
            data[lower], data[upper] = data[upper], data[lower]

    data[left] = data[lower]
    data[lower] = key

    QuickSort(data, left, lower-1)
    QuickSort(data, lower+1, right)


# array = random.sample(range(100),10)
array = ['Tom','John','Mary','Sam','Kent']

print('Before sorting..', array)
QuickSort(array, 0, len(array)-1)
print('After sorting..', array)