input = [1,2,2,3,4,4]
print(input)

original = []
duplicates = []

for element in input:
    if element not in original:
        original.append(element)
    elif element not in duplicates:
        duplicates.append(element)

print(original)
print(duplicates)

