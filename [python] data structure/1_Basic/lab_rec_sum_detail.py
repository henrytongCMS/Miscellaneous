
def sum_detail(num):

    total = 0
    detail = ""

    for i in range(1, num+1):
        total += i
        detail += "{}{}".format("+", i)
        print("{}={}".format(detail, total)[1:])


string_rec = ""
def sum_detail_rec(num):

    global string_rec

    if num == 1:
        string_rec += str(num)
        print("{}={}".format(string_rec, num))
        return 1

    else:
        total_rec = sum_detail_rec(num-1) + num
        string_rec += ('+' + str(num))
        print("{}={}".format(string_rec, total_rec))
        return total_rec


sum_detail(10)
sum_detail_rec(10)