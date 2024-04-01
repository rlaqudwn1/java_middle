human= int(input())                                                     #입력받는 사람의 수 =human
alist=[]                                                                #주사위 4개를 받을 리스트 =alist
sum=[]                                                                  #주사위4개의 결과를 받을 리스트 =sum
for i in range(human):                                                  #사람의 수만큼 반복해서 주사위 4개를 받는다
    alist=list(map(int,input().split()))
    alist.sort(reverse=True)                                            #주사위 2개 2쌍이 나올 경우의 수를 줄이기 위해 리스트를 정렬시킨다
    for j in range(len(alist)):
        b=alist.count(alist[j])                                         #같은 주사위의 개수를 카운트하는 변수 =b
        if b==4:                                                        #b가 4로 모든 주사위 개수가 같으면 리스트 sum에 결과값을 추가하고
            sum.append(int(50000+(alist[j]*5000)))                      #4개가 모두 같으면 더는 쌍을 찾을 수 없으므로 break한다
            break
        elif b==3:                                                      #b가 3이면 마찬가지로 sum에 추가하고 더는 쌍을 찾을 수 없으므로 break
            sum.append(int(10000+(alist[j]*1000)))
            break
        elif alist[0]==alist[1] and alist[2]==alist[3]:                 #4개중 한쌍이 2개일 경우
            sum.append(int(2000+(alist[j]*500))+alist[j+2]*500)
            break
        elif b==2:                                                      #4개중 한쌍만 있을 경우
            sum.append(int(1000+(alist[j]*100)))
            break
        elif b==1:                                                      #한쌍도 없을 경우
            sum.append(alist[j]*100)
print(max(sum))                                                         #가장 높은 결과값을 출력한다

