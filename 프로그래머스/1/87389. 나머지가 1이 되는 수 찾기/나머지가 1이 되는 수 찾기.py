def solution(n):
    answer = 0
    
    for i in range(1000000):
        if(n%(i+1) == 1):
            answer = i+1
            break
    
    return answer