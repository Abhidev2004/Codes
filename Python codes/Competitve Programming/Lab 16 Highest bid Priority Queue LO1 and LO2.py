import heapq

n=int(input())
bids=list(map(int,input().split()))

pq=[]
for b in bids:
    heapq.heappush(pq,-b)
highest =-heapq.heappop(pq)
print("Highest bid:",highest)

if pq:
    print("Next highest bid:",-heapq.heappop(pq))


# highest bid in single auction using priority queue
n= int(input())
bids=list(map(int,input().split()))

pq=[]
for b in bids:
    heapq.heappush(pq,-b)
print(-pq[0])