
def matrix_multipy(A, B):

    C = []
    for i in range(len(A)):
        C.append([])
        for j in range(len(B[0])):
            c = 0
            for k in range(len(B)):
                c += A[i][k]*B[k][j]
            C[i].append(c)         
    return C


A = [[1,1],
    [2,2],
    [3,3]]

B = [[1,2,3,4],
    [1,2,3,4]]

C = matrix_multipy(A, B)
print(C)