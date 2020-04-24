
def triangle_1(n):

    for i in range(1,n):
        print(str(i)*i)

def triangle_2(n):

    for i in range(1,n):
        print(" "*(n-i)+str(i)*i)

def triangle_3(n):

    for i in range(1,n):
        print(str(i)*(n-i))

def triangle_4(n):

    for i in range(1,n):
        print(" "*(i-1)+str(i)*(n-i))



n = 6

print("-"*20)
triangle_1(n)
print("-"*20)
triangle_2(n)
print("-"*20)
triangle_3(n)
print("-"*20)
triangle_4(n)
print("-"*20)