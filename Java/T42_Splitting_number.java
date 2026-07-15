/*Optimizing Energy Division for Maximum Efficiency
A renewable energy company wants to distribute a given amount of energy, represented by an integer N, into smaller segments to maximize the total output. Each segment represents a unit that, when combined with others, maximizes the efficiency and overall power output.

The company’s research indicates that splitting the energy into certain parts will yield a higher product (efficiency). For instance, if N is split into 2 and 3, or multiple 3’s, it yields the highest efficiency. Your task is to help the company determine the best way to split the energy N into smaller segments to maximize the product.

Write a program that accepts a non-negative integer N and outputs the maximum possible product when N is split optimally.



Input Format

A single non-negative integer N.


Constraints

1≤N≤100


Output Format

A single positive integer representing the maximum product of the energy segments.


Example 1

Sample Input 1

4



Sample Output 1

4



Explanation  

When N = 4, the best split is 4 = 2 + 2, resulting in a product of 2×2=4



Example 2

Sample Input 2

6



Sample Output 2

9



Explanation  

When N = 6, the best split is 6 = 3 + 3, resulting in a product of 3×3=9



Example 3

Sample Input 3

8



Sample Output 3

18



Explanation  

When N = 8, the best split is 8 = 2 + 3 + 3, resulting in a product of 2×3×3=18



Example 4

Sample Input 4

15



Sample Output 4

243



Explanation  

When N = 15, the best split is 15 = 3 + 3 + 3 + 3 + 3, resulting in a product of 3×3×3×3×3=243 */
import java.util.*;
class T4_Splitting_number{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int product =1;
if(n <= 2)
{
System.out.println(1);
}
else if(n <= 3)
{
System.out.print(2);
}
else
{
while(n >4)
{
product *= 3;
n -=3;
}
System.out.println(product*n);
}
}
}
