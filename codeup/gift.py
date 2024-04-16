
def solution(friends, gifts):
    N = len(friends)
    present = [[0] * N for _ in range(N)]
    score = [0] * N
    answer = [0] * N
    r, c = 0, 0

    # 주고 받은 선물 행렬
    for gift in gifts:
        give, take = gift.split()[0], gift.split()[1]
        row = friends.index(give)
        col = friends.index(take)
        present[row][col] += 1
    count=[]
    # 선물 지수 구하기
    for j in range(N):
        a=0
        b=0
        for i in range(N):
            a+=present[j][i]
            b+=present[i][j]
        count.append(a-b)
    print(count)
    # 다음달 선물
    for i in range(N):
        for j in range(N):
            if i!=j:
                if present[i][j]>present[j][i]:answer[j]+=1
                if present[i][j]==present[j][i]or present[i][j]==0==present[j][i]:
                    if count[i]>count[j]:
                        answer[j]+=1
                    else: continue
                else: continue
    print(answer)
    print(max(answer))





solution(friends=["muzi", "ryan", "frodo", "neo"],gifts=["muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"])