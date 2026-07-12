import threading

highestbid= 0
lock = threading.Lock()

def place_bid(bid):
    global highestbid
    lock.acquire()
    if bid > highestbid:
        highestbid = bid
    lock.release()

n=int(input())
threads=[]

for _ in range(n):
    bid = int(input())
    t= threading.Thread(target=place_bid, args=(bid,))
    threads.append(t)
    t.start()

for t in threads:
    t.join()

print("Highest Bid",highestbid)
