
public class ACB {
    public static void main(String[] args)
    {
        int n=6;
       int ans=find(n);
        System.out.println(ans);
    
    }
    static int find(int n){
//        int even=0;
//        int odd=0;
//        for(int i=1; i<n+1; i++){
//            if(i%2==0)
//            {
//                even=(even-i);
//            }
//            else{
//                odd=odd+i;
//            }
//        }
//        
//        return odd+even;
//    }
if(n==0)return 0;
if(n%2 == 0)
{
    return find(n-1)-n;
}else
     return find(n-1)+n;
}
}
