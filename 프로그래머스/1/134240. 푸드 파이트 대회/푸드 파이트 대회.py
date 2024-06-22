def solution(food):
    answer = ''
    
    for i in range(len(food)-1):
        if(food[i+1]%2 == 0):
            for j in range(int(food[i+1]/2)):
                answer += str(i+1)
        else:
            for j in range(int((food[i+1]-1)/2)):
                answer += str(i+1)

    reverse_answer = answer[::-1]
    answer += '0'
    answer += reverse_answer
                
    return answer