package com.practice;

public class Duplicate0
{
	public static void main(String[] args)
	{
		int arr[]={5,1,6,4,2,5,6,8,6,3,4,7,3};
		for (int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length;j++)
			{
				if (arr[i]==arr[j])
				{
					arr[j]=0;
					System.out.println("False");
				}
			}
		}
		int count=0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]>0)
				count++;
		}
		System.out.println(count);
		int []res= new int[count];
		int k=0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]>0)
			{
				res[k]=arr[i];
				k++;
			}
		}
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		
		for (int i=0; i<count; i++)
		{
			System.out.print(res[i]);
		}
	}
}