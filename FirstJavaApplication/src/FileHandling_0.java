import java.io.File;
import java.io.IOException;


public class FileHandling_0 {
    public static void main(String args[])
    {
        try
        {
            File myfile = new File("file2.txt");
            if(myfile.createNewFile())
            {
                System.out.println("file Created  "+myfile.getName());
            }
            else
            {
               System.out.println("file already exist"); 
            }
        }
        catch(IOException e)
                {
                System.out.println("Error");
                e.printStackTrace();// it shows perticular line no in which Exception occur
                }

    }
    
}
