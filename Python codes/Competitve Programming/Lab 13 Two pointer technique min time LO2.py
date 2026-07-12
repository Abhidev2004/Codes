n = int(input())
lengths= list(map(int, input().split()))
speeds = list(map(int, input().split()))

left =0
right =n-1
max_time = 0
while left <=right:
    time_left=lengths[left]/speeds[left]
    time_right=lengths[right]/speeds[right]

    max_time = max(max_time,time_left,time_right)

    left = left + 1
    right = right -1
print(int(max_time))
