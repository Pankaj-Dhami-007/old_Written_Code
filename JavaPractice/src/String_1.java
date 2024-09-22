import java.util.*;
public class String_1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //String str = sc.nextLine();
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        //Toggle
        //PHysiCs -> phYSIcS
        for (int i = 0; i <str.length(); i++) {
            // P -> p
            //check -> alphabet- small, capital
            boolean flag = true;// true -> true
            char ch = str.charAt(i);//A
            int asci = (int)ch;//65
            if(asci<=97)//small
            {
                flag = false;
            }
            if(flag == true)//capital
            {
                asci+=32;
                char dh = (char)asci;//97
                str.setCharAt(i, dh);
            }
            else//small
            {
               asci-=32;
               char dh = (char)asci;
                       str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}
