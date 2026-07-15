/*Race Track Number Check
In a car race competition, the organizers assign each car a number plate. To add excitement to the race, they announce a special rule: any car whose number plate is a palindrome will receive bonus points. Your task is to help the organizers check if a given number plate is a palindrome.

Write a program that checks whether the given car number plate (a non-negative integer) is a palindrome or not. A number is said to be a palindrome if it reads the same backward as forward.



Input Format

The input consists of a single integer n, which represents the car number plate.


Output Format

Output true if the number is a palindrome.
Output false if the number is not a palindrome.


Example 1

Sample Input 1

121



Sample Output 1

true



Explanation  

The number 121 reads the same backward as forward, so it is a palindrome.



Example 2

Sample Input 2

12345



Sample Output 2

false



Explanation  

The number 12345 does not read the same backward as forward, so it is not a palindrome.*/
import java.util.*;
class A1_Pallindrome
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int n1 = n;
int rev =0;
int d = 0;
while(n>0)
{
d = n%10;
rev=rev*10 +d;
n = n / 10;
}
if(rev == n1)
{
System.out.println("true");
}
else
{
System.out.println("false");
}
}
}