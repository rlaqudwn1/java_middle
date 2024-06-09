a=int(input())
b=int(input())

alist =[]
for i in range(a,b+1):
    if int(i**0.5)**2==i:
        alist.append(i)
if len(alist)==0:
    print(-1)
else:
    print(sum(alist))
    print(min(alist))
