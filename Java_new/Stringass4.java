import java.util.Scanner;
import java.util.regex.*;

class Stringass4  {
    /* Java Regex - ass- 4*/
    public static boolean isValidIPAddress(String ip) 
    {
    /*  \d represents digits in regular expressions, same as [0-9]
        \\d{1, 2} catches any one or two-digit number
        (0|1)\\d{2} catches any three-digit number starting with 0 or 1.
        2[0-4]\\d catches numbers between 200 and 249.
        25[0-5] catches numbers between 250 and 255. 
     */

        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

        Pattern p = Pattern.compile(regex);
        if (ip == null) {
            return false;
        }
        Matcher m = p.matcher(ip);
        return m.matches();
    }

    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       
    
        String IP = in.nextLine(); 
        System.out.println(isValidIPAddress(IP));        
        
       
       in.close();
    }
}