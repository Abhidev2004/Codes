def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    mid = len(arr) // 2
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])

    i= j =0
    merged = []
    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            merged.append(left[i])
            i=i+1
        else:
            merged.append(right[j])
            j=j+1
    while i < len(left):
        merged.append(left[i])
        i=i+1
    while j<len(right):
        merged.append(right[j])
        j=j+1
    return merged

n = int(input())
marks = list(map(int, input().split()))
sorted_marks = merge_sort(marks)

for x in sorted_marks:
    print(x,end =" ")