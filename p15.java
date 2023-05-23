import java.util.*;
class p15{
    public static void main(String[]args){

        int number;
        int sum;
        String n="";
        
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        number=sc.nextInt();

        while(number>0){
            sum=number%2;
            n=n+sum;
            number=number/2;
        }
        System.out.println(n);
    }
}