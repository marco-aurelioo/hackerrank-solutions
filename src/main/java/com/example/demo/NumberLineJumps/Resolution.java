package com.example.demo.NumberLineJumps;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Resolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\workspace\\hackerrank-solutions\\output.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}

class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        //quem esta na frente?
        if(x1 > x2){
            //quem e mais rapido
            if(v2 <= v1){
                return "NO";
            }else{
                return valida(x1,v1,x2,v2);
            }
        }else{
            if(v2 >= v1){
                return "NO";
            }else{
                return valida(x2,v2,x1,v1);
            }
        }
    }

    public static String valida(int x1, int v1, int x2, int v2){
        /*
            x1 + v1*t == x2 + v2*t
            x1 -x2 == v2*t - v1*t
            x1 - x2 == (v2 - v1)*t
            (x1 - x2)/ (v2 -v1) == t
         */
        int t = (x1-x2)/(v2-v1);
        if((x1+(v1*t)) == (x2+(v2*t))) {
            return "YES";
        }else {
            return "NO";
        }
    }


}