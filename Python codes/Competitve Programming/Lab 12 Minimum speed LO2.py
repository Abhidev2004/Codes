n = int(input())
speeds = list(map(int,input().split()))
distance=int(input())

min_speed= speeds[0]
for i in range(n):
    if speeds[i]<min_speed:
        min_speed = speeds[i]
time_taken = distance/min_speed
print("Minimum speed is",min_speed)
print(f"Maximum time = {time_taken:.2f} hours")