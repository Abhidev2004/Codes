/*Playing with Numbers
Ryan is given an array of random integers of size n, a number d is provided to him along with this array. He needs to develop a logic such that it shifts the given array elements by d positions towards the left. Write a function for him and return the updated array.



Input Format

Input1: An integer n i.e., size of the array

Input2: Integer array which are elements of the array.

Input3: Integer d



Output Format

Return the updated array after the shift.



Example 1

Sample Input 1

Input1: 7

Input2: 1 2 3 4 5 6 7

Input3: 2



Sample Output 1

3 4 5 6 7 1 2



Explanation

For the given d, i.e., 2 for above case such element is shifted by 2 places to left, and the initial 2 elements are required to be shifted from behind, hence array is being rotated



Example 2 

Sample Input 2

Input1: 9

Input2: 1 7 8 5 4 6 0 2 3

Input3: 3



Sample Output 2

5 4 6 0 2 3 1 7 8



Explanation

As the elements are shifted 3 positions to the left, therefore initial 3 elements after being shifted appear at the tail of the array and accordingly other elements are shifted 3 positions towards left. */
import java.util.*;
class T44_Shifitng_by_d_digits
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int arr[]= new int[n];
for(int i = 0; i<n; i++)
{
arr[i]=sc.nextInt();
}
int d= sc.nextInt();
for(int i=d; i<n; i++){
System.out.print(arr[i]+" ");
}
for(int i=0;i<d;i++)
{
System.out.print(arr[i]+" ");
}
}
}