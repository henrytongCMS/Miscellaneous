

def remove_dulpicate(array):

    new_array = []

    for ele in array:
        if ele not in new_array:
            new_array.append(ele)

    return new_array


def merge(array_a, array_b): # bubble sort + remove dulplicate

    array = array_a + array_b
    array = remove_dulpicate(array)

    length = len(array)

    for i in range(length):
        for j in range(length-1-i):
            if array[j+1] < array[j]:
                array[j], array[j+1] = array[j+1], array[j]

    return array[::-1]


array_a = [128, 34, 23, 17, 10, 0]
array_b = [1352, 127, 34, 23, 17, 9, 0]

print(merge(array_a, array_b))
