class p18{
    public static void main(String[]args){

        int  a[] = {13,56,41,54,36,1,2,556,12,5};

        for(int i=0;i<a.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<a.length;j++){
                if(a[smallest] > a[j]){
                    smallest = j;
                }
            }
            int temp=a[smallest];
            a[smallest] = a[i];
            a[i]= temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}