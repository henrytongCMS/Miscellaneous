

def sum_list(num):

    if len(num) == 0:
        return 0
    else:
        # print(num[1:])
        return num[0] + sum_list(num[1:])


num = [1,2,3,4,5,6,7,8,9,10]
print(sum_list(num))