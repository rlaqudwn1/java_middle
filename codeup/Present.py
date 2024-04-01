friends=list(map(str, input().split())) #친구들 값 받기

gifts=list(map(str, input().split()))   #주고받는 선물 값 받기
print(gifts)
gift_num=[]                             # 선물 지수
present_give=[]                         #준 선물 개수
present_by_me=[]                        #받은 선물 개수
for i in range(int(len(gifts)/2-1)):
    if gifts[i]==gifts[0]:
        present_give[i]+=1
        print(present_give[i])