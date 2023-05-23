class p02{
    public static void main (String[] args) {
        
        String str= "abcba";
        String nstr="";
        char ch;
        
     
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr=ch+nstr;
      }
      System.out.println(nstr);
      if(str.equals(nstr)){
        System.out.println("Your string is palindrome");
      }
      else{
        System.out.println("Your string is not palindrome");
      }
    }
}