import random

def bubble_sort(array):
            
    for i in range(len(array)-1, 0 ,-1):
        isSort = False
        for j in range(i):
            if array[j+1] < array[j]:
                array[j], array[j+1] = array[j+1], array[j]
                isSort = True
        print('pass', array)
        if isSort == False: return


# array = random.sample(range(100),10)
array = ['Tom','John','Mary','Sam','Kent']

print("Original list", array)
bubble_sort(array)
print("Bubble sort", array)