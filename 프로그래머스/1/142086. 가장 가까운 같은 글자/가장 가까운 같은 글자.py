def solution(s):
    answer = []
    
    for i in range(len(s)):
        blank = s[:i+1]
        for j in range(i, 0, -1):
            if(s[i] == blank[j-1]):
                answer.append(i-j+1)
                break
        else:
            answer.append(-1)
        continue
                
    return answer