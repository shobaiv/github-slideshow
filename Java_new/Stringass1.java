import java.io.*;
import java.util.*;
import java.lang.*;

public class Stringass1 {
     
    public static void main(String[] args) {
        /*Java string Introduction - task */
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int n1 = A.length();
        int n2 = n1 + B.length();
        System.out.println(n2);

        String C = A.substring(0, 1).toUpperCase(); 
        String D = A.substring(1).toLowerCase();  
        String result1 = C.concat(D);        
        

        String C1 = B.substring(0, 1).toUpperCase(); 
        String D1 = B.substring(1).toLowerCase();  
        String result2 = C1.concat(D1);
        
        if(C.compareTo(C1)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(result1 + " " + result2);
        
    }
}



