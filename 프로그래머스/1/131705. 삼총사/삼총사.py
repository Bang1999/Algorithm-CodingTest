def solution(number):
    answer = 0
    for i in range(len(number)-2):
        for j in range(len(number)-i-1):
            for k in range(len(number)-i-j-2):
                    num = number[i] + number[i+j+1] + number[i+j+k+2]
                    if(num == 0):
                        answer += 1
    
    return answer