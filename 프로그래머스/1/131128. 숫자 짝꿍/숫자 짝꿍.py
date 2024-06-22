def solution(X, Y):
    answer = ''
    num_X = [0,0,0,0,0,0,0,0,0,0]
    num_Y = [0,0,0,0,0,0,0,0,0,0]

    for i in range(len(X)):
        num = int(X[i])
        num_X[num] += 1

    for i in range(len(Y)):
        num = int(Y[i])
        num_Y[num] += 1

    for i in range(9, -1, -1):
        if((num_X[i] != 0) & (num_Y[i] != 0)):
            if(num_X[i] < num_Y[i]):
                answer += str(i)*num_X[i]
            else:
                answer += str(i)*num_Y[i]

    for i in range(9):
        if(answer == ''):
            answer = '-1'
        elif(answer == '0'*i):
            answer = '0'        
                
    return answer