

public class Array_8 {
    static void Swap(int num[], int i, int j)
    {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    public static void main(String args[])
    {
        int num[] = {1,2,3,4,5,6,7,8,9};
        Swap(num, 0, 8);
        for(int i=0; i<num.length;i++)
        {
            System.out.println(num[i]);
        }
        
    }
    
}
