package org.robert.pollum.CeaserCipher1;
import java.io.*;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
        StringBuilder newStringBuilder = new StringBuilder(s);
        int shift = k % 26;
        for(int index = 0; index < s.length(); index++) {
            Character charOfS = s.charAt(index);
            int asciiValue = charOfS + shift;
            if(!Character.isLetter(charOfS)) {
                continue;
            }
            if(Character.isLowerCase(charOfS) && asciiValue > 122 || Character.isUpperCase(charOfS) && asciiValue > 90) {
                asciiValue -= 26;
            }
            
            newStringBuilder.replace(index, index + 1, Character.toString((char) asciiValue));
        }
        return newStringBuilder.toString();
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
