import threading

highestbid =0

def place_bid(bid):
    global highestbid
    if bid > highestbid:
        highestbid = bid

n=int(input())
threads=[]

for i in range(n):
    bid=int(input())
    t=threading.Thread(target=place_bid, args=(bid,))
    threads.append(t)
    t.start()

for t in threads:
    t.join()

print("Highest Bid=",highestbid)