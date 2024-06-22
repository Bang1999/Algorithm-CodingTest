def solution(slice, n):
    answer = 0
    
    if(n%slice == 0):
        answer = n/slice
    elif(slice<n):
        answer = n//slice + 1
    else:
        answer = 1
    return answer