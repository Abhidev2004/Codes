/* Input Fomat

Input1: An integer value N representing the given year.



Output Fomat

Return an integer value representing the next nearest leap year for a given year.



Example 1

Sample Input 1

Input1:2021



Sample Output 1

2024



Explanation

Here, the given year is 2021 and the next upcoming leap year would be 2024. Therefore, 2024 is returned as the output.



Example 2

Sample Input 2

Input1:2008



Sample Output 2

2008



Explanation

Here, the given year is 2008, which is itself a leap year. Therefore 2008 is returned as the output. */

import java.util.*;
import java.io.*;
class Main{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
int year= sc.nextInt();
for(int i= year; i >=year; i++)
{
if((i % 4 ==0)&& ((i%100 !=0) || (i%400==0)))
{
System.out.println(i);
break;
}
}
}
}