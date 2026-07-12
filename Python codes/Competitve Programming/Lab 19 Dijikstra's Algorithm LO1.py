import heapq
n,e= map(int,input().split())

graph=[[]for i in range(n)]

for _ in range(e):
    u,v,w=map(int,input().split())
    graph[u].append((v,w))
    graph[v].append((u,w))

source = int(input())

dist=[float('inf')]*n
dist[source]=0

pq=[(0,source)]

while pq:
    current_dist,node=heapq.heappop(pq)

    for neighbor,weight in graph[node]:
        new_dist = current_dist + weight
        
        if new_dist < dist[neighbor]:
            dist[neighbor] = new_dist
            heapq.heappush(pq, (new_dist, neighbor))

print("Shortest distances from source node",source)
for i in range(n):
    print(i,"->",dist[i])
