
def percetnage123(percetnage):
    if percetnage < 4:
        return 1
    elif percetnage < 8:
        return 2
    elif percetnage < 12:
        return 3
    elif percetnage < 16:
        return 4
    elif percetnage < 20:
        return 5
    else:
        return 6



# Input values here
direct = 22.00
wtfast = 8.04

percetnage = ((direct - wtfast)/direct) * 100
print("Jitter Gauze: " + str(percetnage))


print(percetnage123(percetnage))


def ping_map(ping_ans):
    if ping_ans => 18:
        return 6
    elif ping_ans > 12:
        return 25
    elif ping_ans < 12:
        return 3
    elif ping_ans < 16:
        return 4
    elif ping_ans < 20:
        return 5
    else:
        return 6

    
    
