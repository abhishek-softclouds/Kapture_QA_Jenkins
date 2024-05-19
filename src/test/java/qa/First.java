package qa;

import org.testng.annotations.Test;

public class First
{
 @Test
	public static void test()
	{
	int [] j = {1,3,5,7,9};//instantiation
	int [] k= new int[j.length];//decleration

	System.out.println("After copy");
	for(int m=0;m<j.length;m++)
	{
		k[m] = j[m];
		System.out.print(k[m]+",");
	}	
	
	System.out.println("");
	System.out.println("Before copy");
	for(int i=0;i<j.length;i++)
	{
		System.out.print(j[i] + ",");
	}
	System.out.println("Functionality is working as expected");
}}
