def merge_sort(arr):
    if len(arr) == 1:
        return arr
    mid =len(arr) // 2
    left =merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])

    i = j =0
    merged=[]
    while i<len(left) and j<len(right):
        if left[i] < right[j]:
            merged.append(left[i])
            i = i+1
        else:
            merged.append(right[j])
            j=j+1
    while i<len(left):
        merged.append(left[i])
        i = i+1
    while j<len(right):
        merged.append(right[j])
        j = j+1
    return merged


n = int(input())
runners = []

for _ in range(n):
    time, bib = map(int, input().split())
    runners.append((time, bib))

sorted_runners = merge_sort(runners)

for i in range(10):
    print(sorted_runners[i][0], sorted_runners[i][1])
