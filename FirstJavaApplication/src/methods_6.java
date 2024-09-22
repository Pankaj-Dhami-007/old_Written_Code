 
 class patterns{
    void disp(){
      for(int i=1; i<=5; i++){
          for(int j=1; j<=i; j++){
              System.out.print(j+" ");
          }
          System.out.println();
      }  
    }
 }        
    
//  void show(){
//       for(int i=5; i<=1; i--) {
//           for(int j=1; j<=i; j++){
//              System.out.print(j+" ");  
//           }
//           System.out.println(); 
//       }
//    }  
//    
//}
 class patterns_1{
    void display(){
       for(int i=1; i<=5; i++){
          for(int j=1; j<=5-i+1; j++){
              System.out.print(j+" ");
          }
          System.out.println();
      }  
    }
}


 public class methods_6 {
    public static void main(String args[]){
       patterns obj = new patterns();
       obj.disp();
       patterns_1 p =new patterns_1();
       p.display();
      
       
    }
    
}
//class patterns_1{
//    void display(){
//       for(int i=5; i<=1; i--) {
//           for(int j=1; j<=i; j++){
//              System.out.print(j+" ");  
//           }
//           System.out.println(); 
//       }
//    }
//}

