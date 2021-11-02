import requests
import json

def find_duplicate(input_list):
    duplicates = []

    duplicate_list = []
    for i in result_list:
        if i not in duplicates:
            duplicates.append(i)
        else:
            duplicate_list.append(i)
            print(i,end=' ')

    # print(duplicate_list)
    return duplicate_list

def create_list():

    final_list = []
    offset = 3003

    while(True):

        url = "https://elitegamer.gg/api/news?offset=" + str(offset) + "&limit=13&sort=published_at&order=DESC&timestamp=1623506384730"

        payload={}
        headers = {
        'Cookie': 'SPSI=18a8aa31749b1bfa6b9f90392bd84034; SPSE=UpE4dVnDns7KzdiaQG2pZULN/kl6WeBcXQXUlKvVtQnnZjGzwOpCoKsNP2Ks8suSDlb0Azx50Nqo4tj8igc3PA=='
        }

        response = requests.request("GET", url, headers=headers, data=payload)
        json_data = response.text

        dict_data = json.loads(json_data)


        print(len(dict_data))

        for i in dict_data:
            # print(i['id'])
            final_list.append(i['id'])
        
        offset = offset + 13
        print("Offest --> " + str(offset))

        if(offset > 6000):
            break
    

        # print(final_list)
    return final_list

if __name__ == "__main__":

    result_list = create_list()
    
    # result_list = [10, 11, 12, 12, 10, 14]

    duplicates = find_duplicate(result_list)
    print(duplicates)

