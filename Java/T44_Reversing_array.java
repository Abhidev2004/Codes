/*Data Recovery - Reversing the Sensor Log
Imagine you are working as a software engineer for a weather monitoring company. The company collects temperature readings from multiple sensors at regular intervals throughout theday and stores these readings in an array. Due to a system glitch, the readings got recorded in reverse order. Your job is to reverse the order of the readings to restore them to their original sequence so that the data analysis team can proceed with their work.

Write a program that takes an array of temperature readings as input, reverses the array, and outputs the restored sequence.



Input Format

The first line contains an integer n, the number of temperature readings.
The second line contains n space-separated integers representing the temperature readings.


Output Format

Output the restored temperature readings in a single line, separated by spaces.


Example 1

Sample Input 1

5

23 25 21 19 18



Sample Output 1

18 19 21 25 23



Explanation

There are 5 temperature readings: 23, 25, 21, 19, 18.
The original readings were recorded in reverse order due to the glitch.
After reversing the array, we get 18, 19, 21, 25, 23, which is the corrected order.


Example 2

Sample Input 2

3

30 28 27



Sample Output 2

27 28 30



Explanation

There are 3 temperature readings: 30, 28, 27.
The original readings were reversed. After fixing, we get 27, 28, 30. */

import java.util.*;
class T44_Reversing_array{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int arr[]= new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i = n - 1; i >= 0; i--)
{
System.out.print(arr[i]+" ");
}
}
}