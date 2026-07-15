/*Irene's Audience Arrangement Checker
Irene, one of the event organizers, has arranged the audience in a matrix format where boys are represented by 1s and girls by 0s. To win a prize, she must ensure that all girls (0s) are positioned below the main diagonal of the matrix. If she successfully arranges the audience according to this condition, she will be rewarded; otherwise, she will not.

Your task is to help the judges determine if Irene's arrangement is valid by checking if the matrix is an upper triangular matrix.



Problem Statement

Write a program that checks whether a given matrix is an upper triangular matrix. A matrix is considered upper triangular if all the elements below the main diagonal are zero.



Input Format

The first line contains an integer n, representing the number of rows and columns of the square matrix.
The next n lines contain space-separated integers representing the matrix.


Constraints

The matrix is a square matrix (i.e., the number of rows equals the number of columns).


Output Format

Print "Upper triangular matrix" if the condition is satisfied; otherwise, print "Not an Upper triangular matrix"



Example 1

Sample Input 1

3

1 2 3

0 1 2

0 0 1



Sample Output 1

Upper triangular matrix  */
import java.util.*;
public class T45_Check_uppertriangular_matrix
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int r = sc.nextInt();
int a[][]= new int[r][r];
for(int i = 0 ;i<r; i++)
{
for(int j=0;j<r;j++)
{
a[i][j]=sc.nextInt();
}
}
boolean flag=true;
for(int i = 0 ;i<r; i++)
{
for(int j=0;j<r;j++)
if(i>j && a[i][j] !=0)
{
flag=false;
break;
}
}
if(flag)
System.out.println("Upper triangular matrix");
else
System.out.println("Not an Upper triangular matrix");
}
}