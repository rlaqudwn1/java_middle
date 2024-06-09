m=int(input())
n=int(input())
if m<2:
    m=2

alist=[]
for i in range(m,n+1):
    for j in range(2,i//2+1):
        if i%j==0:
            break
    else:
        alist.append(i)
if(len(alist)==0):
    print(-1)
else:
    print(sum(alist))
    print(min(alist))