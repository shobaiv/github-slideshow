import java.util.Scanner;

class Intstr { 
  
    // To conver a integer to string
    public static void main(String args[]) 
    { 
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        in.close();

        String str1 = Integer.toString(n); 
        System.out.println("String str1 = " + str1); 
    } 
}