def count(score, size):

    global ndiff
    temp = []

    if len(score) > 0:

        for i in range(0, size):
            for j in range(i+1, size):

                if score[i] != score[j]:
                    temp.append(score[j]) 
            
            if len(temp) > 0:
                ndiff += 1 
            
            break
        
        count(temp, len(temp)) 

    return ndiff 

ndiff = 1
score = [60,10,20,40,20,50,10,60,30,10,10]
print("Different number: {}".format(count(score, len(score))))



# def count(score, size):

#     ndiff = 0
   
#     for i in range(0, size-1):
#         for j in range(0, i-1):

#             if score[j] != score[i]:
#                 ndiff += 1
#                 break

#     return ndiff


# score = [10,20,40,20,50,10,60,30,10,10,10,10,20]
# ndiff = count(score, len(score))
# print("Different number: {}".format(ndiff))