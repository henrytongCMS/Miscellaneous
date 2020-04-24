
'''
(0)把 1 (或最小的數) 放在第一行正中,按以下規律排列剩下的(nxn-1)個數
(1)每一個數放在前一個數的右上一格
(2)如果這個數所要放的格已經超出了頂行那麼就把它放在底行,仍然要放在右一列
(3)如果這個數所要放的格已經超出了最右列那麼就把它放在最左列,仍然要放在上一行
(4)如果這個數所要放的格已經超出了頂行且超出了最右列,那麼就把它放在底行且最左列
(5)如果這個數所要放的格已經有數填入,那麼就把它放在前一個數的下一行同一列的格內
'''


def generateSquare(n): 
  
    # 2-D array with all slots set to 0 
    magicSquare = [[0 for i in range(n)] 
                      for j in range(n)] 

    # Initialize position of 1 
    i = 0
    j = n // 2

    magicSquare[i][j] = 1

    for num in range(2, n**2+1):

        i = (i-1+n) % n
        j = (j-1+n) % n

        if magicSquare[i][j]:
            i = (i+2+n) % n
            j = (j+1+n) % n


        magicSquare[i][j] = num

        # num += 1

    # Print
    for i in range(n):
        for j in range(n):
            print(magicSquare[i])
            break



# Works only when n is odd 
n = 7
generateSquare(n)      
  
