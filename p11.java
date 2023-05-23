// WAP to find weather given number is Armstrong number is not.
import java.util.Scanner;
import java.lang.Math;
public class p11{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number ::");
		int number=sc.nextInt();

		int temp, rem=0,sum=0;
		
		temp=number;
		while(number>0){
			rem = number%10;
			sum = sum + (rem*rem*rem);
			number=number/10;
		}

		if(temp == sum){
			System.out.println(""+temp+" is an Armstrong Number.");
		}
		else{
			System.out.println(""+temp+" is not an Armstrong Number.");
		}
	}
}
