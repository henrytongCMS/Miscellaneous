

score = [[[90,100],[95,100],[90,91],[90,96],[100,90]],
        [[90,100],[93,100],[90,92],[90,97],[100,90]],
        [[90,100],[91,100],[90,93],[90,98],[100,90]]]

for i in range(len(score)): # Grade(3)

    i_sc_chi = 0
    i_sc_eng = 0

    for j in range(len(score[i])): # Class(5)
        i_sc_chi += score[i][j][0] # Chinese
        i_sc_eng += score[i][j][1] # English

    print("The average Chinese of Grade {} is {}".format(i+1, i_sc_chi/5))
    print("The average English of Grade {} is {}".format(i+1, i_sc_eng/5))