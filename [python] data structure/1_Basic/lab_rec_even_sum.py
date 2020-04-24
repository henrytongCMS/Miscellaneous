
def evenSum(num):
    total = 0
    for i in range(0, num+1, 2):
        total += i
    return total


def evenSum_rec(num):
    if num == 0:
        return 0
    else:
        return evenSum_rec(num-1)+num if num%2 == 0 else evenSum_rec(num-1)


print(evenSum(101))
print(evenSum_rec(101))



'''
Example of simple recursive function 1:

def sum_loop(num):
    total = 0
    for i in range(1, num+1):
        total += i
    return total

def sum_rec(num):
    if num == 1:
        return 1
    else:
        return sum_rec(num-1)+num

print(sum_loop(100))
print(sum_rec(100))
'''

'''
Example of simple recursive function 2:

def gcd_loop(a, b):
    while a%b != 0:
        c = a%b
        a = b
        b = c
    return b

def gcd_rec(a, b):
    if a%b == 0:
        return b
    else:
        return gcd_rec(b, a%b)

print(gcd_loop(27,15))
print(gcd_rec(27,15))
'''