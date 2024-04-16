def solution(today, terms, privacies):
    alist=[]
    clist=[]
    for i in privacies:
        a=list(map(str, i.split(".")))
        b=list(map(str,i.split(".")[2].split()))
        print(a,b)
        a[2]=b[0]
        alist.append(a)
    print(alist)
        # alist.append(list(map(str, i.split("."))))
        # alist.extend(list(map(str,i.split(".")[2].split())))
        # alist.append(list(map(str,blist[2].split())))
        # clist.append(list(map(str,i.split(".")[2].split())))



    blist=[]
    for i in terms:
        cut=list(map(str,i.split()))
        blist.append(cut)
    print(blist)
    year,month,day=list(map(str,today.split(".")))
    print(year,month,day)


    answer = []
    return answer
solution("2022.05.19",["A 6", "B 12", "C 3"],["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"])