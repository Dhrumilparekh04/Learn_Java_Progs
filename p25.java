class p25{
    public static void check(int number, int idx,int a[]){
        
        if(idx==a.length-1){
            System.out.println("Number is not present in array");
            return;
        }
        if(number==a[idx]){
            System.out.println("Number is present in array");
            return;
        }
        else{
            check(number,idx+1,a);
        }
        
        
    }
    public static void main(String[]args){
        int number=10;
        int a[]={1,2,3,4,5,6,7,8,9};

        check(number,0,a);

    }
}