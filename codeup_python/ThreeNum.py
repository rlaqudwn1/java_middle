import math
a,b,c = list(map(int, input().split()))
d=math.gcd(a,b)
f=math.gcd(d,c)
print(f)