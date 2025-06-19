package org.robert.pollum.MinMaxSum;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    	List<Long> convertedArray = arr.stream().map(Long::valueOf).collect(Collectors.toList());
	    Long maxSum = convertedArray.stream().sorted().collect(Collectors.toList()).subList(arr.size()-4, arr.size()).stream().reduce(0L, Long::sum);
	    Long minSum = convertedArray.stream().sorted().collect(Collectors.toList()).subList(0, 4).stream().reduce(0L, Long::sum);
	    System.out.println(String.format("%d %d", minSum, maxSum));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
