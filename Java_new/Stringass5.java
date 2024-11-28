import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringass5 {

    /* Java Regex 2- duplicate words : this assignment is to 
    remove the case sensistive duplicate words */
/* 
\b       match a word boundary
[a-z]+   match a word with one or more characters;
         the parentheses capture the word as a group    
\b       match a word boundary
(?:      indicates a non-capturing group (which starts here)
\s+      match one or more white space characters
\1       is a back reference to the first (captured) group;
         so the word is repeated here
\b       match a word boundary 
)+       indicates the end of the non-capturing group and
         allows it to occur one or more times */
    public static void main(String[] args)     
    {
        
        String regex = "\\b(\\w+)(\\s+\\1\\b)+"; // Regular expression matching repeated words
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // Compile the regex with case-insensitive flag
    
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
    
        String[] output1 = new String[numSentences];
        int i = 0;
        while (numSentences-- > 0) 
        {
            String input = in.nextLine();
    
            Matcher m = p.matcher(input);
    
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1)); // Replace repeated word with its first occurrence
            }
    
            // Prints the modified sentence.           
            output1[i]   = input;
            i++;
        }
        in.close();
        
        for(String item: output1) 
        {
            System.out.println(item.trim());
        }
    }
}