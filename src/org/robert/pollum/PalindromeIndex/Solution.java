package org.robert.pollum.PalindromeIndex;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    //aabbcaa
    public static int palindromeIndex(String s) {
    // Write your code here
        for(int index = 0; index < s.length(); index++) {
            if(s.charAt(index) != s.charAt(s.length() - (index +1))) {
                if(palindromeIndex(new StringBuilder(s).deleteCharAt(index).toString()) == -1){
                    return index;
                } else if (palindromeIndex(new StringBuilder(s).deleteCharAt(s.length() - (index +1)).toString()) == -1) {
                    return s.length() - (index +1);
                }
            }
        }
        
        return -1;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.palindromeIndex(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
