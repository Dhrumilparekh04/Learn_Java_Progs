import java.util.*;
class p13{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the arow : ");
    int arow=sc.nextInt();

    System.out.println("Enter the acolumn : ");
    int acolumn=sc.nextInt();

    int a[][] = new int[arow][acolumn];

    System.out.println("Enter the brow : ");
    int brow=sc.nextInt();

    System.out.println("Enter the bcolumnn : ");
    int bcolumn=sc.nextInt();

    int b[][]= new int[brow][bcolumn];
    int n[][]= new int[arow][bcolumn];

    System.out.println("Enter the array elements of array a :");
    for(int i=0;i<arow;i++){
      for(int j=0;j<acolumn;j++){
        System.out.println("Enter a["+i+"]["+j+"] :");
        a[i][j]=sc.nextInt();  
      }
    }

    System.out.println("Enter the array elements of array b :");
    for(int p=0;p<brow;p++){
      for(int k=0;k<bcolumn;k++){
        System.out.println("Enter b["+p+"]["+k+"] :");
        b[p][k]=sc.nextInt();
      }
    }
    System.out.println();

    int[][] product = new int[arow][bcolumn];
        for(int i = 0; i < arow; i++) {
            for (int j = 0; j < bcolumn; j++) {
                for (int k = 0; k < arow; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        } 
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}