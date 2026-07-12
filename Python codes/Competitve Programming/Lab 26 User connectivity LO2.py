def find(parent, x):
    if parent[x] != x:
        parent[x] = find(parent, parent[x])
    return parent[x]

def union(parent, rank, a, b):
    rootA = find(parent, a)
    rootB = find(parent, b)

    if rootA != rootB:
        if rank[rootA] < rank[rootB]:
            parent[rootA] = rootB
        elif rank[rootA] > rank[rootB]:
            parent[rootB] = rootA
        else:
            parent[rootB] = rootA
            rank[rootA] += 1

n = int(input())
m = int(input())

parent = list(range(n + 1))
rank = [0] * (n + 1)

for _ in range(m):
    op = input().split()

    if op[0] == "union":
        a = int(op[1])
        b = int(op[2])
        union(parent, rank, a, b)

    elif op[0] == "check":
        a = int(op[1])
        b = int(op[2])

        if find(parent, a) == find(parent, b):
            print("Connected")
        else:
            print("Not Connected")
