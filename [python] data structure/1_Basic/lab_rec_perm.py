
def rec_perm(array, k=0):

    if k == len(array):
        print(array)

    else:
        for i in range(k, len(array)):
            array[k], array[i] = array[i], array[k]
            rec_perm(array, k+1)
            array[k], array[i] = array[i], array[k]

rec_perm([1,2,3,4])