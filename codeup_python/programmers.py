
def solution(players, callings):
    answer=[]
    for i,j in enumerate(callings):
        for k,l in enumerate(players):
            if j==l:
                players[k],players[k-1]=players[k-1],players[k]
    answer=players[:]
    return answer

