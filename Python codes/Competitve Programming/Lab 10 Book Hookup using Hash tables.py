n = int(input())
books = {}

for _ in range(n):
    title, bid = input().split()
    books[title] = int(bid)

q = int(input())
for _ in range(q):
    query = input().strip()
    if query in books:
        print(books[query])
    else:
        print("Book Not Found")
