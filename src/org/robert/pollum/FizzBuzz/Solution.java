package org.robert.pollum.FizzBuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    // Write your code here
    	for(int i = 1; i <= n; i++) {
    		if(i % 3 == 0) {
    			System.out.print("Fizz");
    		}
    		if(i % 5 == 0) {
    			System.out.print("Buzz");
    		}
    		if(i % 3 != 0 && i % 5 != 0) {
    			System.out.print(String.valueOf(i));
    		}
    		System.out.println("");
    	}
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}

