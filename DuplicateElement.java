package arrayexamples;

import java.util.Scanner;

public class DuplicateElement 
{

	public static void main(String[] args) 
	{
		//compile initialization
		int count=0;
	    int array[]=new int[5];
			Scanner sc=new Scanner(System.in);
			//getting array elements from user
			System.out.println("Enter elements in the Array: ");
			//traversing array
			for(int i=0;i<5;i++) 
			{
				
				array[i]=sc.nextInt();
			}
		System.out.println("The Duplicate  numbers in the array is : ");   //enter the duplicate value in arrays
	    for(int i=0;i<array.length;i++) 
	    {
		//traversing area
		for(int j=i+1;j<array.length;j++) 
		{
		
		if(array[i]==array[j]) 
		{
		count++; //counting elements
		break;
	    }
		
		}
	

	
}
	//printing output
	System.out.println("Total numbers of duplicate element found in array : "+count);
}

		
		
}


