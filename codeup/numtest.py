a,b=list(map(int,input().split()))
alist=list(map(int,input().split()))
blist=[]
for i in range(a-b+1):
    blist.append(sum(alist[i:i+b]))
print(max(blist))