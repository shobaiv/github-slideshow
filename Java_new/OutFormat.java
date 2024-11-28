import java.util.Scanner;
public class OutFormat 
{
    public static void main(String[] args) 
    {
     /* Format the input data with Prefix spaces and zeroes */   
            Scanner sc=new Scanner(System.in);
            String parr[];
            parr = new String[3];
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int    x1=sc.nextInt();
                String p1 = String.format("%-15s", s1);
                String p2 = String.format("%03d", x1);                
                parr[i] = p1 + p2;                          
            }

            System.out.println("================================");

            for(int i=0;i<3;i++)
            {
                System.out.println(parr[i]);                           
            }

            System.out.println("================================");

    }
}



