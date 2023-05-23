class p17{
    public static void main(String[]args){

        int a[] = {56,4,65,2,14,5,4};

        for(int i=0;i<a.length;i++){
            int current = a[i];
            int j =i-1;
            while(j>=0 && current < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}