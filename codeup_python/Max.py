alist= list(map (int, input().split()))
blist=[]
clist=[]
for i in alist:
    if i%2==1:
        blist.append(i)
    elif i%2==0:
        clist.append(i)
if len(blist)==0:
    print(max(clist))
elif len(clist)==0:
    print(max(blist))
else:
    print(max(clist)+max(blist))