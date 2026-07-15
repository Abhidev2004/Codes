/*Robotic Warehouse Navigation - Snake Pattern Traversal
In a modern warehouse, a robot is tasked with scanning items in storage shelves arranged in a grid-like format. The robot moves in a snake-like pattern to ensure that all shelves are scanned efficiently. Specifically, the robot starts at the first row and scans from left to right, then moves to the next row and scans from right to left, and so on.

Write a program that outputs the order in which the robot scans the items in a given matrix in a snake pattern.



Input Format

The first line contains two integers, m (number of rows) and n (number of columns).
The next m lines contain n integers each, representing the item IDs on the storage shelves.


Output Format

Print the item IDs in the order the robot scans them in a single line, separated by spaces.


Constraints

1≤m,n≤1001 \leq m, n \leq 1001≤m,n≤100
Item IDs are integers ranging from 111 to 100010001000.


Sample Input

3 4

1 2 3 4

5 6 7 8

9 10 11 12



Sample Output

1 2 3 4 8 7 6 5 9 10 11 12



Explanation

Input Matrix (Item IDs on Shelves)

1 2 3 4

5 6 7 8

9 10 11 12

The robot starts at the first row and moves left to right: 1 2 3 4
It then moves to the second row and scans from right to left: 8 7 6 5
Finally, it moves to the third row and scans from left to right: 9 10 11 12


Output

The order of item IDs in the snake pattern is 1 2 3 4 8 7 6 5 9 10 11 12. */

import java.util.*;
class T45_R_to_L_and_L_to_R_traversal
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int r= sc.nextInt();
int c= sc.nextInt();
int a[][]=new int[r] [c];
for(int i = 0 ;i<r; i++)
{
for(int j = 0 ;j<c; j++)
a[i][j]= sc.nextInt();
}
for(int i = 0; i < r ;i++)
{
if(i%2==0)
{
for(int j=0;j<c;j++){
System.out.print(a[i][j]+" ");
}
}
else
{
for(int j=c-1;j>=0;j--)
{
System.out.print(a[i][j]+" ");
}
}
}
}
}