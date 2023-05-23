import java.util.*;
 
public class p24 {
 
    public static void main(String[] args) {
        
        int size,loc,item;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size: ");
        size=sc.nextInt();

        int a[]=new int [size];
        System.out.println("Enter Array elements: ");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the array location: ");
        loc=sc.nextInt();



        for(int i=loc+1;i<size;i++){
            a[i-1]=a[i];
        }
        size--;
        System.out.println("Now your array is :");
        for(int i=0;i<size;i++) 
        {
           System.out.print(a[i]+" ");
        }
    }
}