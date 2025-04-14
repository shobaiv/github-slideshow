import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.regex.*;

public class Jloops 
{
    public static void main(String[] args) throws IOException 
    {
        /* logic to learn loops */
         Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();        
        if ( x1 >=2 && x1 <=20)
        {
             for(int i=1;i<=10;i++)
                {
                    int j = (x1 * i);
                    System.out.print(x1 + " X " + i + " = " + j);
                    System.out.println();
                }
        }        
    }
}
