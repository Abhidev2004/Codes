# # Insertion sort
# n= int(input())
# times=list(map(int,input().split()))
#
# for i in range(1,n):
#     key = times[i]
#     j= i -1
#     while j >= 0 and times[j] > key:
#         times[j+1] = times[j]
#         j -= 1
#     times[j+1] = key
# print(times[2])


# Selection sort
n= int(input())
times = list(map(int,input().split()))

for i in range(0,n-1):
    min_index = i
    for j in range(i+1,n):
        if times[j] < times[min_index]:
            min_index = j
    temp = times[i]
    times[i] = times[min_index]
    times[min_index] = temp
print(times[2])