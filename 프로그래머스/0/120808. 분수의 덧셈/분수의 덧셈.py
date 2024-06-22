def solution(numer1, denom1, numer2, denom2):
    answer = []
    
    def gcd(a, b):
        while b > 0:
            a, b = b, a%b
        return a
    
    def lcm(a, b):
        return a*b / gcd(a,b)
    
    num = lcm(denom1, denom2)
    num1 = num // denom1
    num2 = num // denom2
    
    numer = num1*numer1 + num2*numer2
    num_gcd = gcd(numer, num)
    answer.append(numer//num_gcd)
    answer.append(num//num_gcd)
    return answer