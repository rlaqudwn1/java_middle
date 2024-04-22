



health=20
timeCount=0
firsthealth=health
attacks=[[1, 15], [5, 16], [8, 6]]
bandageCount=0
bandage=[3, 2, 7]
i=0
while(True):
    print(timeCount)
    if health>firsthealth:
        health=firsthealth
    if attacks[i][0]==timeCount:
        health-=attacks[i][1]
        i+=1
        bandageCount=0
        print(health)
    elif health<firsthealth:
        health+=bandage[1]
        bandageCount+=1
        print(health)
    if bandage[0]==bandageCount:
        health+=bandage[2]
        bandageCount=0
        print(health)
    if health<=0:
        print(-1)
        break
    if i>=len(attacks):
        break
    timeCount+=1
print(health)