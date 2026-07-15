/* Adam’s Charity

Adam decides to be generous and do some charity. Starting today, from day 1 until day n, he gives i2 coins to charity on day ‘i’ (1 <= i <= n).

Return the total coins he would give to charity.



Example 1

Sample Input 1

Input1: 2



Sample Output 1

5



Explanation

There are 2 days.

On the first day, he will give 1^2 = 1 coin.

On the second day, he will give 2^2 = 4.

Total no.of coins = 1 + 4 = 5



Example 2

Sample Input 2

Input1: 5



Sample Output 2

55



Explanation

There are 5 days.

On the first day, he will give 1^2 = 1 coin.

On the second day, he will give 2^2 = 4 coins and therefore 9, 16 and 25 respectively on 3rd, 4th, 5th day.

Total no of coins = 1 + 4 + 9 + 16 + 25 = 55 */

import java.util.*;
class Power_function
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int sum =0;
for(int i = 1; i<=n; i++)

{
int prod= (int) Math.pow(i, 2);
sum = sum+prod;
}
System.out.println(sum);
}
}