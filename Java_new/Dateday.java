
import java.util.*;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;

public class Dateday 
{
    public static void main(String[] args) 
    { 
    Scanner in = new Scanner(System.in);
    /*int a1 = in.nextInt();
    int b1 = in.nextInt();
    int c1 = in.nextInt();*/

    String i1 = in.next();
    String i2 = in.next();
    String i3 = in.next();
    in.close();
 

    String s1 = i1.concat("-");
    String s2 = i2.concat("-");


    String p1 = s1.concat(s2);
    String p2 = p1.concat(i3);
    
    System.out.println(p2);

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-M-u", Locale.ENGLISH);
    LocalDate date = LocalDate.parse(p2,dtf);
    DayOfWeek dow = date.getDayOfWeek();
    System.out.println(dow);
    String p2 = NumberFormat.getCurrencyInstance(null)    
    }    
}
