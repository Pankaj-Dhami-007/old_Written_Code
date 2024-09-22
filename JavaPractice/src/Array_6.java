public class Array_6 {
    static void Search(int num[], int key)
    {
        int temp = -1;
        for(int i=0; i<num.length; i++)
        {
            if(num[i] == key)
            {
                temp = i;
                break;
            }
        }
        System.out.println("Element is found at index :" +temp);
    }
    public static void main(String args[])
    {
        int num[] = {11,22,33,44,55,66,77,88,99,12};
        int key;
        System.out.println("Array is :");
        for(int i =0; i<num.length;i++)
        {
            System.out.println(num[i]);
        }
        Search(num, 12);
    }
}
