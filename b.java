import java.util.*;
import java.io.*;
class Result {
  public String breakPalindrome(String palindrome) {
    // If empty or of length 1 => return empty
    if (palindrome.length() <= 1) {
      return "";
    }
    char[] chars = palindrome.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] != 'a') {
        // Skip if the string is of odd length and it is the middle index
        if (palindrome.length() % 2 != 0 && i == palindrome.length() / 2) {
          continue;
        }
        chars[i] = 'a';
        break;
      }
      // If all chars all 'a' update last char to 'b'
      if (i == chars.length - 1) {
        return "impossible";

      }
    }
    return String.valueOf(chars);
  }
}
class b 
{ 
     
    public static void main(String[] args) 
    { 
         Scanner in=new Scanner(System.in);
       String s=in.next();
       Result g=new Result();
       System.out.println(g.breakPalindrome(s));
     }

   }