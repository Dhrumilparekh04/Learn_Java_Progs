/*WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value
should be taken from user (Note that you are not allowed to use an array for this)*/
import java.util.Scanner;
class p12{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int max=0,min=0,sum=0,num;
		float avg;
		System.out.print("Enter number of numbers you need to calculate :: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Number["+(i+1)+"] :: ");
			num=sc.nextInt();

			if(i==0){
            	max=num;
                min=num;
                sum=num;
           	}
           	else
           	{
           		sum+=num;
				if(num>max){
				 	max=num;
				}
				if(num<min){
				 	min=num;
				}
			} 	
		}
		avg = sum /(float)n;
		System.out.println("Average ::" +avg);
		System.out.println("Max :: "+max);
		System.out.println("Min :: "+min);
	}
}