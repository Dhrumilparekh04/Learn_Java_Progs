import java.util.*;
class p20{
    public static void main(String[]args){
        int number;
        int power;
        int sum=0;

        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number :");
        number= sc.nextInt();
        int number1=number;

        System.out.println("Enter the power of number: ");
        power=sc.nextInt();

        if(power==0){
            System.out.println("Your answer is :"+1);
        }
        else if(number==0){
            System.out.println("Your answer is :"+0);
        }
        else{
            for(int j=1;j<power;j++){
                for(int i=1;i<number;i++){
                    sum=sum+number1;
                }
                number1=sum+number;
            }
        System.out.println("Your answer is :"+number1);
        }
    }
}