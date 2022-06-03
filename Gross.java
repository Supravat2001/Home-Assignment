package BasicPrograms;

import java.util.Scanner;

public class Gross {
	
		int hra,da,gs; //declearing global variables
		public void grosssalarycheck (int bs) //creating method to check gross salary
		{
			//checking in which category entered salary is 
			if (bs<=10000 )
			{ //calculating da and hra
			hra=(bs*20)/100;
			da=(bs*80)/100;
			
			}
			
			else if(bs>=10001 && bs<=20000)
			{
			hra=(bs*25)/100;
			da=(bs*90)/100;	
			
			}
			else if (bs>=20001)
			{
				hra=(bs*30)/100;
				da=(bs*90)/100;
				
			}
			gs = bs+hra+da;//calculating gross salary and assigning agian to gs
			System.out.println("Your Gross Salary Is: " + gs);
			
		}
		

		public static void main(String [] args) {
			int sl ;//declearing variables
			System.out.println("Eter Yur Basic Salary");
			Scanner sc=new Scanner(System.in); //creating object for scanner class
			sl=sc.nextInt(); //taking input from user
			Gross ch=new Gross(); //creating object for gross class
			ch.grosssalarycheck(sl); //calling grosssalarycheack method 
			
		}
		
	}

	

	