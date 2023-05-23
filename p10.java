//WAP to find a prime number between range (range should be entered by user).
import java.util.Scanner;		
class p10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lower bound :: ");
		int lower = sc.nextInt();
		System.out.print("Enter upper bound :: ");
		int upper = sc.nextInt();

		for(int i=lower;i<=upper;i++){
			if(isPrime(i))
				System.out.print(" "+i);
		}
				System.out.println();
	}

	static boolean isPrime(int n)
	{
		if(n<2){
			return false;
		}

		for(int i=2;i<n;i++){
			if(n%i==0){
				return false;
			}
		}
		 return true;
    }
}