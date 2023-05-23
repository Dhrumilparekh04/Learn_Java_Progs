import java.util.*;
class p04{
    public static void main(String[]args){
        int a;
        int factorial=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
         a=sc.nextInt();

         for(int i=a;i>=1;i--){
            factorial= factorial*i;
         }    
         System.out.println("Your factorial is: "+factorial);
    }
}