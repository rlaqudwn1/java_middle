def solution(s):
    alist=list(map(str,s.split(" ")))
    print(alist)
    blist=[]
    for i in alist:
        blist.append(i.capitalize())
    return " ".join(blist)
    #return answer

s="3people unFollowed me"
print(solution(s))
