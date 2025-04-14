import java.util.*;

public class Staticex 
{
    /* This code is to work on the static blocks */
    static int B, H;
    static boolean flag = true;
    static
    {   
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        dataInput(); 
    }
    
    public static void dataInput()    
    {
        try{
            if(B <= 0 || H <= 0){
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e) {
            flag = false;
            System.out.print(e);
        }
    }

    public static void main(String[] args)
    {
            if(flag)
            {
                int area=B*H;
                System.out.print(area);
            }
            
    }
}