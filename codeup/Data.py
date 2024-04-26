def solution(data, ext, val_ext, sort_by):
    answer = []
    if ext=="date":
        for i in data:
            if i[1]<val_ext:
                answer.append(i)
    if ext=="code":
        for i in data:
            if i[0]<val_ext:
                answer.append(i)
    if ext=="maximum":
        for i in data:
            if i[2]<val_ext:
                answer.append(i)
    if ext=="remain":
        for i in data:
            if i[3]<val_ext:
                answer.append(i)

    if sort_by=="code":
        answer=sorted(answer, key=lambda x:x[0])
    if sort_by=="date":
        answer=sorted(answer, key=lambda x:x[1])
    if sort_by=="maximum":
        answer=sorted(answer, key=lambda x:x[2])
    elif sort_by=="remain":
        answer=sorted(answer, key=lambda x:x[3])
    return answer
solution([[1, 20300104, 100, 80], [2, 20300804, 847, 37], [3, 20300401, 10, 8]],"date",20300501,"maximum")