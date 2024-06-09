a=int(input())
if a<=500:
    print(int(a*0.7))
elif 500<a<=1500:
    print(int(350+(a-500)*0.4))
elif 1500<a<=4500:
    print(int(750+(a-1500)*0.15))
elif 4500<a<=10000:
    print(int(1200+(a-4500)*0.05))
elif a>10000:
    print(int(1475+(a-10000)*0.02))