import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Stringass2 {

    public static void main(String[] args) {
        /*Java string Reverse */
        char ch;
        String Revstr = "";
        Scanner sc=new Scanner(System.in);
        String Oristr = sc.next();

        for (int i=0;i<Oristr.length();i++)
        {
            ch= Oristr.charAt(i); 
            Revstr =  ch + Revstr; 
        }
        if(Revstr.equals(Oristr))
        {
            System.out.println("Yes");
        }else
        {
            System.out.println("No");
        }
    }
}