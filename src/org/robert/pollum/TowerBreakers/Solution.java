package org.robert.pollum.TowerBreakers;
import java.io.*;

class Result {

    /*
     * Complete the 'towerBreakers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */

    public static int towerBreakers(int n, int m) {
    // Write your code here
    //What a terribly worded absolutely atrocious question
        return n % 2 == 1 && m != 1 ? 1 : 2;
    //     //Generate the towers
    //     List<Integer> towers = new ArrayList<Integer>();
    //     for(int i = 0; i < n; i++) {
    //         towers.add(m);
    //     }
        
    //     Integer player = 2;
    //     while(towers.size() > 0) {
    //         player = player == 1 ? 2 : 1; //toggle player
    //         if(towers.size() == 1 || !towers.stream().anyMatch(height -> height % 2 == 0)) {
    //             towers.remove(0);
    //         } else {
                
    //             int largestValueIndex = towers.indexOf(towers.stream().max(Integer::max).get());
    //             System.out.println(largestValueIndex);
    //             if(towers.get(largestValueIndex) % 2 == 0 && towers.get(largestValueIndex)/2 != 1) {
    //                 System.out.println("Dividing by 2");
    //                 towers.set(largestValueIndex, towers.get(largestValueIndex)/2);
    //             } else {
    //                 System.out.println("Removing Tower");
    //                 towers.remove(largestValueIndex);
    //             }
    //             // for(int i = 0; i < towers.size(); i++) {
    //             //     if(towers.get(i) % 2 == 0 ) {
    //             //         towers.set(i, towers.get(i)/2);
    //             //         break;
    //             //     }
    //             // }
    //         }
    //     }
        
    //     return player;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int result = Result.towerBreakers(n, m);

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
