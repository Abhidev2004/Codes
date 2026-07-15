/*Dinner Dishes

You are planning a dinner menu for an event, and you have a list of N dishes stored in array A, each with a certain cost associated with it. You must select two such dishes, such that the sum of their costs is maximum among all available pairs. Your task is to find and return an integer value representing the sum of such available pair. Return 0 in case of no such pair available.



Input Format

Input1: An integer value N representing the number of dishes available.

Input2:An integer array A representing the cost of dishes



Output Format

Return an integer value representing sum of such pair available. In case, there are no such pair present, return 0.



Example 1

Sample Input 1

Input1: 4

Input2: 1 10 5 15



Sample Output 1

25



Explanation

Here, A = (1,10,5,15). The pair with maximum sum would be 10 and 15, since they are the largest in the array of prices and their sum would be 25. Therefore, 25 is returned as the answer



Example 2

Sample Input 2

Input1:3

Input2:50 50 50



Sample Output 2

100



Explanation

Here, A = (50,50,50). The pair with maximum sum would be 50 and 50, since they are the largest in the array of prices and their sum would be 100. Therefore, 100 is returned as the answer.



Example 3

Sample Input 3

1

10



Sample Output 3

0 */
import java.util.*;
class T43_Max_sum_pair{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int arr[]= new int[n];
for(int i = 0; i<n;i++)
{
arr[i]= sc.nextInt();
}
if(n<2)
{
System.out.println(0);
return;
}
int sum =0;
for(int i = 0; i<n;i++)
{
for(int j = i + 1; j<n;j++)
{
if(arr[i]<arr[j])
{
int temp= arr[i];
arr[i]= arr[j];
arr[j]= temp;
}
}
}
sum = arr[0]+arr[1];
System.out.println(sum);
}
}