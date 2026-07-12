n,e = map(int,input().split())

matrix = [[0]*n for _ in range(n)]
graph=[[] for _ in range(n)]

for _ in range(e):
    u,v = map(int,input().split())
    matrix[u][v] =1
    matrix[v][u] =1

    graph[u].append(v)
    graph[v].append(u)

print("Adjacency Matrix")
for row in matrix:
    print(*row)
print("Adjacency List")
for i in range(n):
    print(i,"->",*graph[i])