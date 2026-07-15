/*Alice's Magical shoes!

Alice has a pair of magical shoes that allows her to climb 3 stairs at once. In the city, there are N houses whose roofs Alice wants to reach. The number of stairs to the roof of each house is given in an array A. Alice can reach the roofs of only those houses where the number of stairs is a multiple of 3. Your task is to find and return an integer value representing the count of the number of houses whose roof Alice can climb up to.



Input Format

Input1: An integer value N representing the number of houses.

Input2: An integer array A representing the number of stairs in each house.



Output Format

Return an integer value representing the count of the number of houses whose roofs Alice can climb up to.



Example 1

Sample Input 1

Input1: 4

Input2: 12 21 3 4



Sample Output 1

3



Explanation

Here, the given array is (12,21,3,4). There is only one house, (the 4th), whose roof Alice cannot go up to as it is not a multiple of 3. Therefore, 3 is returned as the output.



Example 2 

Sample Input 2

Input1:5

Input2: 1 1 1 1 1



Sample Output 2

0



Explanation

Here, the given array is (1,1,1,1,1). Alice cannot go up to the roof of any of the houses as none of the elements of the array is a multiple of 3. Therefore, 0 is returned as the output. */
import java.util.*;
class T44_Divisible_by3_roofs
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int stairs[] = new int[n];
for(int i = 0; i<n;i++)
{
stairs[i]=sc.nextInt();
}
int count =0;
for(int i = 0; i<n;i++){
if(stairs[i]% 3 ==0)
{
count ++;
}
}
System.out.println(count);
}
}