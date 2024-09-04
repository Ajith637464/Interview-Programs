/*

Write a program to calculate and return the sum of distances
between the adjacent numbers in an array of positive integers.

Note:

You are expected to write code in the find TotalDistance 
function only which will receive the first parameter as the 
number of items in the array and second parameter as the array itself. 
You are not required to take input from the console.

Example:

Finding the total distance between adjacent items of a list of 5 numbers
Input
input1: 5
input2: 10 11 7 12 14
Output
12

Explanation:

The first parameter (5) is the size of the array. 
Next is an array of integers. 
The total of distances is 12 as per the calculation below:
10-11-1
11-7=4
7-12=5
12-14-2
Total distance=1+4+5+2 = 12
*/
import java.util.*;
class Soft1 
{
	static Scanner sc = new Scanner (System.in);
	public static int findTotalDistance(int n)
	{
		int[]a=new int[n];
		String s="";
		for (int i=0;i<n ;i++ )
		{
			int num=(int)(Math.random()*20)+1;
			a[i]=num;
			s+=num+" ";
		}
		System.out.println("input2:"+s);
		int sum=0;
		for (int i=0;i<a.length-1;i++ )
		{
			int temp=a[i]-a[i+1];
			temp =Math.abs(temp);
			sum+=temp;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.print("input1:");
		int n=sc.nextInt();

		int res=findTotalDistance(n);
		System.out.println("Output:"+res);
		
	}
}
