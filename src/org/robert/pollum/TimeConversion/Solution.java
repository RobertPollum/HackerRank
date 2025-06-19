package org.robert.pollum.TimeConversion;

import java.io.*;
import java.text.DecimalFormat;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    	DecimalFormat formatter = new DecimalFormat("00"); 
        Boolean  isPm = s.contains("PM");
        Integer hours = Integer.valueOf(s.substring(0, 2));
        if(isPm) { 
            hours = hours == 12 ? hours : hours + 12;
            
        } else {
            hours = hours == 12 ? 0 : hours;
        }
        
        return formatter.format(hours) + s.substring(2, s.length() -2);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
