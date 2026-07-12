from collections import deque
n = int(input())
r, c = map(int, input().split())

visited = [[False]*n for _ in range(n)]
queue = deque([(r, c)])
visited[r][c] = True

print("Reachable Squares")

while queue:
    x, y = queue.popleft()

    for i in range(n):

        if not visited[x][i] and i != y:
            visited[x][i] = True
            print(x, i)
            queue.append((x, i))

        if not visited[i][y] and i != x:
            visited[i][y] = True
            print(i, y)
            queue.append((i, y))
