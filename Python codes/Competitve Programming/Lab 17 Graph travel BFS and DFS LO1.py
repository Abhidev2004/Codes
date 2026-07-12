from collections import deque

n,e=map(int,input().split())
graph=[[] for _ in range(n)]

for i in range(e):
    u,v=map(int,input().split())
    graph[u].append(v)
    graph[v].append(u)

start = int(input())

#BFS traversal
visited=[False] *n
queue=deque([start])
visited[start]=True

print("BFS Traversal",end=" ")

while queue:
    node =queue.popleft()
    print(node,end=" ")

    for neighbor in graph[node]:
        if not visited[neighbor]:
            visited[neighbor]=True
            queue.append(neighbor)

#DFS search
visited = [False]*n

def dfs(node):
    visited[node]=True
    print(node,end=" ")

    for neighbor in graph[node]:
        if not visited[neighbor]:
            dfs(neighbor)
print("\n Dfs Traversal",end=" ")
dfs (start)