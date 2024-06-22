def solution(numbers):
    answer = 0
    num = [0,0,0,0,0,0,0,0,0,0]
    
    for i in range(len(numbers)):
        num[numbers[i]] += 1
        
    for i in range(len(num)):
        if(num[i] == 0):
            answer += i
            
    return answer