from collections import defaultdict
d=defaultdict(list)
def solution(survey, choices):
    d={"A":[0],"C":[0],"F":[0],"M":[0],"N":[0],"R":[0],"T":[0],"J":[0]}
    d1={}
    d2={}
    d3={}
    print(d)
    for i in survey:
        d[i[0]].append(0)
        d[i[1]].append(0)

    for i in range(len(choices)):
        if choices[i]==1:
            d[(survey[i][0])].append(3)
        if choices[i]==2:
            d[(survey[i][0])].append(2)
        if choices[i]==3:
            d[(survey[i][0])].append(1)
        if choices[i]==5:
            d[(survey[i][1])].append(1)
        if choices[i]==6:
            d[(survey[i][1])].append(2)
        if choices[i]==7:
            d[(survey[i][1])].append(3)
    print(d)
    d1=sorted(d.items(),key=lambda x:x[1], reverse=True)
    print(d1)






solution(["TR", "RT", "TR"],[7, 1, 3])