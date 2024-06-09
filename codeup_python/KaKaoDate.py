def solution(today, terms, privacies):
    years=0
    alist=[]
    clist=[]
    todaylist=[]
    answer=[]
    year,month,day=list(map(int,today.split(".")))
    for i in privacies:
        a=list(map(str, i.split(".")))
        b=list(map(str,i.split(".")[2].split()))
        a[2]=b[0]
        alist.append([int(a[0]),int(a[1]),int(a[2])])
        clist.append(b)
    blist=[]
    dlist={}

    for i in range(len(terms)):
        cut=list(map(str,terms[i].split()))
        blist.append(cut)
        dlist[blist[i][0]]=int(blist[i][1])

    for i in range(len(alist)):
        alist[i][1]+=dlist.get(clist[i][1])
        if alist[i][1]>12:
            if alist[i][1]%12==0:
                alist[i][1]=12
            else:
                alist[i][0]+=1
                alist[i][1]=alist[i][1]%12
        if alist[i][0]<year:
            answer.append(i+1)
        if alist[i][0]==year:
            if alist[i][1]<month:
                answer.append(i+1)
            elif alist[i][1]==month:
                if alist[i][2]-1<day:
                    answer.append(i+1)
    return answer
solution("2022.05.19",["A 6", "B 12", "C 3"],["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"])