
public class NewClass {
    static void armStng(int n){
        int rem,prod;
        int sum = 0;
      int temp = n;
      while(temp>0){
          rem = temp%10;
          sum = sum+(rem*rem*rem);
           temp = temp/10;         
      }
      if(n == sum){
          System.out.println("its armstrong no");
      }
      else
      {
          System.out.println("not");
      }
    }
    public static void main(String[] args) {
      armStng(12);    
    }
    
  
   
    
}
