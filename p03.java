import java.util.*;
class p03{
    public static void main(String[]args){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        a=sc.nextInt();

        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.print(i+" ");
            }
        }
    }
}