package org.robert.pollum.PlusMinus;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        Integer positiveSize = arr.stream().filter(val -> val > 0).collect(Collectors.toList()).size();
        Integer zeroSize = arr.stream().filter(val -> val == 0).collect(Collectors.toList()).size();
        Integer negativeSize = arr.stream().filter(val -> val < 0).collect(Collectors.toList()).size();
        
        System.out.println(String.format("%.6f", positiveSize.floatValue()/arr.size()));
        System.out.println(String.format("%.6f", negativeSize.floatValue()/arr.size()));
        System.out.println(String.format("%.6f", zeroSize.floatValue()/arr.size()));
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

