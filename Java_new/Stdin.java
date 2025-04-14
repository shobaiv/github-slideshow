import java.util.Scanner;

public class Stdin {

    public static void main(String[] args) 
    {
        /* get int,double and stream of data and print it */
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}