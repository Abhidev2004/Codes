/* Nick's check

Nick has been given a list of random numbers by his teacher.

These numbers are marks of several students of his class.

He is require to arranged the marks in increasing order and hence check whether the new arrangement of marks are consecutive in nature or not.

You need to write a function such that it returns 1 if the complete arrangement consists of consecutive marks, otherwise return 0.



Note

If two students have the same marks, then after arranging them in increasing order, they will not be considered as consecutive.



Input Format

Input1: Integer N i.e., size of the array

Input2: Integer array for elements of the array



Output Format

Return 1 if all the numbers are consecutive after arrangement, otherwise return 0.



Example 1

Sample Input 1

Input1: 6

Input2: 3 7 2 5 4 6



Sample Output 1

1



Explanation

After arranging the given numbers in increasing order, the array comes out to be as 2, 3, 4, 5, 6, 7.

As all the numbers in the array are consecutive, therefore 1 is returned.



Example 2

Sample Input 2

Input1: 6

Input2: 1 9 2 4 0 3



Sample Output 2

0



Explanation

After arranging the given numbers in increasing order, the array comes out to be as 0,1,2,3,4,9

The numbers are not consecutive (gap between 4 and 9), so the output is 0. */
import java.util.*;
class T44_Consecutive_number
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[]= new int[n];
for(int i = 0; i < n; i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j = i + 1; j < n; j++)
{
if(arr[i]>arr[j])
{
int temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
boolean con = true;
for(int i = 0; i < n - 1 ;i++)
{
if(arr[i + 1] != arr[i] + 1)
{
con = false;
}
}
if(con)
{
System.out.println(1);
}
else{
System.out.println(0);
}
}
}