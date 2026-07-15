/*Identifying Special Numbers for Students

Professor Proton, a fictional character from the Big Bang Theory who also appears in his own educational show, wants the kids to explore and understand special numbers. A special number is defined as a number where the sum of the sum of its digits and the product of its digits is equal to the number itself. Professor Proton believes that learning about such numbers will help students develop their understanding of digit operations in a fun way. He challenged them to find all special numbers between two given limits m and n (both inclusive).

Your task is to write a program to help Professor Proton by finding all special numbers between m and n.

Given two integers m and n, you are to identify and print all special numbers between m and n (inclusive).

A special number is a number such that the sum of the sum of its digits and the product of its digits equals the number itself.
For example, 19 is a special number:
Digits: 1, 9
Sum of digits = 1 + 9 = 10
Product of digits = 1 * 9 = 9
10 + 9 = 19, which is the number itself.


Input Format

The first input contains an integer m (lower limit).
The second input contains an integer n (upper limit).


Constraints

Both m and n will be integers where m <= n.


Output Format

Print all special numbers between m and n (inclusive), one per line.


Example 1

Sample Input 1

12

45



Sample Output 1

19

29

39



Explanation

For input m=12 and n=45, the numbers 19, 29, and 39 are special numbers because:
19: Sum of digits = 1 + 9 = 10, Product of digits = 1 * 9 = 9, 10 + 9 = 19.
29: Sum of digits = 2 + 9 = 11, Product of digits = 2 * 9 = 18, 11 + 18 = 29.
39: Sum of digits = 3 + 9 = 12, Product of digits = 3 * 9 = 27, 12 + 27 = 39.


Example 2

Sample Input 2

11

19



Sample Output 2

19*/
import java.util.*;
class A2_Special_number
{ 
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
int m = sc.nextInt();
int n = sc.nextInt();
int upperlimit = Math.min(n,99);
for(int i = m;i <=upperlimit ;i++)
{
int sum =0;
int prod =1;
int temp=i;
while(temp >0)
{
int d= temp%10;
sum = sum+d;
prod= prod*d;
temp =temp/10;
}
int final_number=sum+prod;
if(i== final_number)
{
System.out.println(i);
}
}
}
}