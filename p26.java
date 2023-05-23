import java.util.*;
class p26{
    public static void main(String[]args){
        int number;
        int p=0;
        double total=0;
        int count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the binary number :");
        number=sc.nextInt();

        if(number==0){
            System.out.println("Your number is 1"+0);
        }

        while(number>0){
            int sum=number%10;
            System.out.println(sum);
            if(sum==1){
                double a=Math.pow(2,p);
                p++;
                total=total+a;
            }
            else{
                p++;
            }
            number=number/10;
        }
        System.out.println(total);
    }
}