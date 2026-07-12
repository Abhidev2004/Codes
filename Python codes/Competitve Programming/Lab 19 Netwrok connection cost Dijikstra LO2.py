import heapq

n, e = map(int, input().split())

graph = [[] for _ in range(n)]

for _ in range(e):
    u, v, w = map(int, input().split())
    graph[u].append((v, w))
    graph[v].append((u, w))

s, d = map(int, input().split())

dist = [float('inf')] * n
dist[s] = 0

pq = [(0, s)]

while pq:
    current_dist, node = heapq.heappop(pq)

    for neighbor, weight in graph[node]:
        new_dist = current_dist + weight

        if new_dist < dist[neighbor]:
            dist[neighbor] = new_dist
            heapq.heappush(pq, (new_dist, neighbor))

if dist[d] == float('inf'):
    print("No Connection Found")
else:
    print("Shortest connection cost:", dist[d])
