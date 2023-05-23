import java.util.*;
class p07{
    public static void main(String[]args){
        int a;
        int b=0; 
        int c=1;
        int d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a=sc.nextInt();

        for(int i=0;i<a;i++){
            d=b+c;
            System.out.print(b+" ");
            b=c;
            c=d;
        }
    }
}