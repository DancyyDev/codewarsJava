// Task
// Given a string str, reverse it and omit all non-alphabetic characters.

// Example
// For str = "krishan", the output should be "nahsirk".

// For str = "ultr53o?n", the output should be "nortlu".

// Input/Output
// [input] string str
// A string consists of lowercase latin letters, digits and symbols.

// [output] a string

public class ReverseLetter {
    public static String reverseLetter(final String str) {
      
      String input = str.replaceAll("[^A-Za-z]","");
                                     
      StringBuilder results = new StringBuilder();
           
      for(int i = input.length() - 1; i >= 0; i--){
          results.append(input.charAt(i));
      }
      System.out.println(results.toString());
        return results.toString(); //coding and coding..
    }
}