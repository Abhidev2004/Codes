n = int(input())
distances = list(map(int, input().split()))

left =0
right =n-1

while left <= right:
    if left == right:
        print(distances[left],end= " ")
    else:
        print(distances[left],distances[right],end=" ")
    left = left + 1
    right = right - 1