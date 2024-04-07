n=int(input())
alist=[0,0,0]
clist=[[0,0,0],[0,0,0],[0,0,0]]
count=1
from collections import Counter
for i in range(n):
    blist=list(map(int,input().split()))
    a=Counter(blist).most_common(3)
    if a[0][0]==3:
        clist[0][0]+=1
    elif a[0][0]==2:
        clist[0][1]+=1
    elif a[0][0]==1:
        clist[0][2]+=1

    if a[1][0]==3:
        clist[1][0]+=1
    elif a[1][0]==2:
        clist[1][1]+=1
    elif a[1][0]==1:
        clist[1][2]+=1

    if a[2][0]==3:
        clist[2][0]+=1
    elif a[2][0]==2:
        clist[2][1]+=1
    elif a[2][0]==1:
        clist[2][2]+=1
    for j in range(len(blist)):
        alist[j]+=blist[j]
c=0
for i,j in enumerate(alist):
    if j==max(alist):
        c=i+1
        break
print(alist)
print(clist)

if alist[0]==alist[1] and alist[1]==alist[2]:
    print(0,max(alist))
elif alist[0]==alist[1]:
    if clist[0][0]==clist[1][0]and clist[0][1]==clist[1][1]:
        print(0,max(alist))
    else:
        print(c,max(alist))
elif alist[0]==alist[2]:
    if clist[0][0]==clist[2][0]and clist[0][1]==clist[2][1]:
        print(0,max(alist))
    else:
        print(c,max(alist))
elif alist[1]==alist[2]:
    if clist[1][0]==clist[2][0]and clist[1][1]==clist[2][1]:
        print(0,max(alist))
    else:
        print(c,max(alist))
else:
    print(c,max(alist))


