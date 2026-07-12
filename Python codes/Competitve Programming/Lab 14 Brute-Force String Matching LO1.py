text = input().strip()
pattern = input().strip()

n= len(text)
m=len(pattern)
found = False

for i in range(n-m+1):
    j=0
    while j<m and text[i+j]==pattern[j]:
        j+=1
    if j == m:
        found = True
        break
if found:
    print("Pattern Found")
else:
    print("Pattern not found")