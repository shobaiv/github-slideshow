import java.io.*;
import java.util.*;

public class Stringass3 
{

    /* Java String Tokens */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();        
        scan.close();

        String[] arrOfStr = s.split("[!,?._'@\\s]+");
        System.out.println(arrOfStr.length);

        for (String a : arrOfStr)
            System.out.println(a);
    }
}
