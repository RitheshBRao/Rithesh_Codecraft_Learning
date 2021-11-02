import json

with open('json_1.json') as json_file:
    json_value = json.load(json_file)

def avg_caluclate(type):
    sum = 0
    for iteration in json_value:
        #print(iteration[type])
        sum = sum + iteration[type]

    #print(sum)
    #print(len(json_value))
    avg = sum / len(json_value)
    #print(avg)
    return avg

print('>> Avg WtfRtt : {}'.format(avg_caluclate('WtfRtt')))
print('>> Avg IntRtt : {}'.format(avg_caluclate('IntRtt')))
print('>> Avg Wtf2Jitter : {}'.format(avg_caluclate('Wtf2Jitter')))
print('>> Avg Int2Jitter : {}'.format(avg_caluclate('Int2Jitter')))
