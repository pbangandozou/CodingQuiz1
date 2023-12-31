import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
     

    public static void staircase(int n) {
    for(int row = 0; row < n ; row++){
        //must start col at 1 because when started at 0 it gives spacing error
        for(int col = 1; col <= n; col++ ){
            if(col < n - row){
                System.out.print(" ");
            }else{
                System.out.print("#");
            }
        }
        System.out.println();
    }
    

    }
//STAIRCASE PROBLEM
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
