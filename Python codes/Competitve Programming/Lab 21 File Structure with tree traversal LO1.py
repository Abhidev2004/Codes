from collections import defaultdict

n= int(input())

tree = defaultdict(list)
file_index={}

for _ in range(n):
    directory,file=input().split()

    tree[directory].append(file)
    file_index[file]=True

search_file=input()
print("FIle system structure")

for directory in tree:
    print(directory,"->",tree[directory])

print("\n Search Result")

if search_file in file_index:
    print("File Found")
else:
    print("File Not Found")