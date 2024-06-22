def solution(a, b, n):
    answer = 0
    left = 0
    
    while(n >= a):
        answer += (n//a)*b
        receive = (n//a)*b
        left += n%a
        n = left + receive   
        if(left != 0):
            left = 0
    return answer