import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jioread
{
    public static void main(String[] args) 
    {
        /* Read input from STDIN, print output to STDOUT */
        /* read  lines of input until you reach EOF, then number and print all  lines of content. */
        /*        
 	Sample Input
	Hello world
	I am a file
	Read me until end-of-file.

	Sample Output
	1 Hello world
	2 I am a file
	3 Read me until end-of-file.
	*/

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