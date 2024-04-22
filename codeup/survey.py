from collections import defaultdict
d=defaultdict(list)
def solution(survey, choices):
    survey=["AN", "CF", "MJ", "RT", "WA"]
    for i in survey:
        d[i[0]].append(0)
        d[i[1]].append(0)

    for i in range(len(choices)):
        print(survey[i][1])
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


    print(d)



solution(["AN", "CF", "MJ", "RT", "NA"],[5, 3, 2, 7, 5])