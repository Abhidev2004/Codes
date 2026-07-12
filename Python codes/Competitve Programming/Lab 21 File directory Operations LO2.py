from collections import defaultdict

tree = defaultdict(list)
file_index = set()

n = int(input())

for _ in range(n):
    command = input().split()

    if command[0] == "CREATE":
        directory = command[1]
        file = command[2]

        tree[directory].append(file)
        file_index.add(file)

        print("File Created")

    elif command[0] == "DELETE":
        file = command[1]

        if file in file_index:
            file_index.remove(file)
            print("File Deleted")
        else:
            print("File Not Found")

    elif command[0] == "FIND":
        file = command[1]

        if file in file_index:
            print("File Exists")
        else:
            print("File Not Found")
