import java.util.*;
class p05{
    public static void main(String[]args){
        int a;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        a=sc.nextInt();

        while(a>0){
            sum=sum+a%10;
            a=a/10;
        }
        System.out.println("The sum of digits of the number is: "+sum);
    }
}