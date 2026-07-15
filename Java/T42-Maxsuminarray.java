/*Quality Check for Premium Products
In a retail store, some products are considered "premium" if their product ID is a Prime Number. A Prime Number is a number greater than 1 that has no divisors other than 1 and itself. Your task is to create a program that checks whether the given product ID qualifies as "Premium" or not.

Imagine a store manager who needs to filter out premium products for special promotions. If a product ID is a Prime Number, it should be labeled as "Premium Product," otherwise, it should be labeled as "Regular Product."If the given product ID is 1 consider it as "Regular Product".



Input Format

The first line of input contains an integer N, which represents the product ID.


Output Format

Print "Premium Product" if the product ID is a Prime Number.
Print "Regular Product" if the product ID is not a Prime Number.


Example 1

Sample Input 1

17



Sample Output 1

Premium Product



Explanation

The number 17 is greater than 1 and has no divisors other than 1 and itself.
Hence, the product ID 17 is a Prime Number, so the output is "Premium Product."


Example 2

Sample Input 2

20



Sample Output 2

Regular Product



Explanation

The number 20 is greater than 1 but has divisors other than 1 and itself (e.g., 2, 4, 5, 10).
Hence, the product ID 20 is not a Prime Number, so the output is "Regular Product." */
import java.util.*;
class Maxsuminarray
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int k = sc.nextInt();
int arr[]= new int[n];
for(int i = 0 ; i<n;i++)
{
arr[i]=sc.nextInt();
}
int max_sum =0;
int sum =0;
for(int i = 0 ;i <=n;i++)
{
for(int j = 0 ;j<=k;j++)
{
sum = sum + arr[j];
}
if(sum >=max_sum)
{
max_sum = sum;
}
sum =0;
}
System.out.println(max_sum);
}
}