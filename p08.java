import java.util.*;
class p08{
    public static void main(String[]args){
        int a;
        int evensum=0;
        int oddsum=0;
        int sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        a=sc.nextInt();

        while(a>0){
            sum=a%10;
                if(sum%2==0){
                    evensum=evensum+sum;
                }
                else if(sum%2==1){
                    oddsum=oddsum+sum;
                }
            a=a/10;
        }
        System.out.println("The sum of odd numbers is :"+oddsum);

        System.out.println("The sum of even numbers is :"+evensum);
    }
}