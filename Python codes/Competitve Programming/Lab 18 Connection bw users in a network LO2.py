from collections import deque

n,e = map(int,input().split())
graph=[[] for i in range(n)]

for i in range(e):
    u,v=map(int,input().split())
    graph[u].append(v)
    graph[v].append(u)

s,d = map(int,input().split())
visited=[False]*n
queue = deque([s])
visited[s] = True

found = False

while queue:
    node = queue.popleft()
    if node == d:
        found = True
        break
    for neighbor in graph[node]:
        if not visited[neighbor]:
            visited[neighbor] = True
            queue.append(neighbor)
if found:
    print("Connection exists")
else:
    print("Connection not found")