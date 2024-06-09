n= input()
for i in n:
    if i.isalpha():
        if i.isupper():
            print(i.lower(),end="")
        else:
            print(i.upper(),end="")
    else:
        print(i,end="")