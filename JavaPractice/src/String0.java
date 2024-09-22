
public class String0 {
    public static void printLatter(String str)
    {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName = "Pankaj";
        String lastName = "Singh Dhami";
        String fullName = firstName+" "+lastName;
                printLatter(fullName);
    }
 
}
