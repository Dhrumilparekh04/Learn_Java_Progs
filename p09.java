// WAP to find whether a number is Odd or Even without using a % operator.
import java.util.Scanner;
public class p09{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        float ans=n/2;
        float temp=ans*2;

        if(n==temp){
            System.out.println(""+n+" is Even.");
        }
        else{
            System.out.println(""+n+" is Odd.");
        }
    }
}