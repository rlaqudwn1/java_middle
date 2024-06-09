alist=list(map(int, input().split()))
blist=[]
for i in alist:
    if i%2==1:
        blist.append(i)
if len(blist)==0:
    print(-1)
else:
    print(sum(blist))