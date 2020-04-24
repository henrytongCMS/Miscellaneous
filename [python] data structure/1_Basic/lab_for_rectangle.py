
n = int(input("Please input n: "))
m = int(input("Please input m: "))
d = int(input("Please input d: "))

if( n > 2*d and m > 2*d ):

    for mi in range(1,m+1):
        for ni in range(1,n+1):
            if(mi > d and ni > d and mi <= m-d and ni <= n-d):
                print(" ", end="")
            else:
                print("*", end="")
        print()

else:

    print("Any of your input is wrong.")
        

