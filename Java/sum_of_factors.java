/*Car Speed
You have an electric car whose speed is derived from the battery percentage

The battery percentage is denoted by an integer value N and the speed is the sum of all the factors of the battery percentage including 1. Your task is to find and return an integer value representing the speed of the car.



Input Fomat

Input1: An integer value N representing the battery percentage of the car.



Output Fomat

Return an integer value representing the speed of the car.



Sample Input

Input1:12



Sample Output

28



Explanation

Here, the given battery percent is 12 and the factors of 12 are 1, 2, 3, 4, 6, and 12. The sum of all the factors will be 1+2+3+4+6+12=28. 
Therefore 28 is returned as the output */

import java.util.*;
public class sum_of_factors
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int sum =0;
for(int i = 1 ;i<=n;i++)
{
if(n % i==0)
{
sum = sum +i;
}
}
System.out.println(sum);
}
}