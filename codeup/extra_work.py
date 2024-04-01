
suma=0
for i in range(5):
    a,b=list(map(float ,input().split()))
    # if b-a>1:
    if 0<=b-a-1<=4:
        suma+=b-a-1
    elif b-a-1>4:
        suma+=4

if suma>=15:
    print(int(suma*10000*0.95))
elif suma<=5:
    print(int(suma*1.05*10000))
else:
    print(int(suma*10000))



