import java.util.Scanner;
public class ReplaceVowelWithHAHA
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter a string of words and i will replace every vowel with the word HAHA.");
      String input = in.nextLine();
      
      System.out.println(input.replaceAll("[AaEeIiOoUu]", "HAHA"));
      
      // replaceAll method returns a new string by replacing each substring that matches the regular expression with the specified string in the method.
      // Syntax : public String replaceAll(String regex, String replace_str)
      // Regular expression syntax : [...] Matches any single character in brackets
      // This allows for every letter in the brackets to be matched from the string 
   }
}