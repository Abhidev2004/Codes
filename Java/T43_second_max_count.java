/*Second Occurrence
Charles is given an array A. He wants to find the count of occurrence of second largest element in the array. Your task is to help him find and return an integer value representing the count of occurrence of the second largest element in an array.



Note

If the array contains the same elements, then return 0

The array has only consecutive elements



Input Format

Input1: An integer N, representing length of array.

Input2: An integer array A



Output Format

Return an integer value representing the count of occurrence of the second largest element in an array.



Example 1

Sample Input 1

Input1: 8

Input2: 1 2 3 4 4 5 5 5



Sample Output 1

2



Explanation

Here the length of array A is 8(N). The second largest element is 4 and the occurrence of 4 is 2 times. Therefore, 2 is returned as the output.



Example 2

Sample Input 2

Input1: 1

Input2: 5



Sample Output 2

0



Explanation

Here the length of array A is 1(N). Since the array has only one element and there are no other element to compare, therefore, 0 is returned as the output. */
import java.util.*;
class T43_second_max_count
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int arr[]=new int[n];
for(int i = 0 ;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j = i + 1; j<n;j++){
if(arr[i]<arr[j])
{
int temp =arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
int ele = 0;
for(int i=0;i<n;i++)
{
if(arr[i]<arr[0])
{
ele = arr[i];
break;
}
}
int count =0;
for(int i = 0; i < n ;i++)
{
if(arr[i]==ele){
count = count +1;
}
}
System.out.println(count);
}
}