import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Jioread
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. 
        Print output to STDOUT */
        
            Scanner in = new Scanner(System.in);
            String Arr[];
            Arr = new String[100];
            
            int i = 0;
            String line = "";
            while (in.hasNextLine() 
            && (line = in.nextLine().toLowerCase()).length() != 0) 
            {
                Arr[i] = ++i + " " + line;
            }
            

            for (int index = 0; index < Arr.length; index++) 
            {
                if (Arr[index] == null ) 
                {
                    break;
                }
                System.out.println(Arr[index]);
            }   
    }
}