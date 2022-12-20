package com.example.demo.DayOfTheProgrammer;


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

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}

class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        // Write your code here
        try {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                Calendar c = Calendar.getInstance();
                c.set(year, Calendar.JANUARY, 1);
                if ((year < 1918) || ((year % 4 == 0) &&  (year % 100 != 0 || year % 400 == 0))) {
                    if((year % 4 == 0) ) {
                        return "12.09." + year;
                    }else{
                        return "13.09." + year;
                    }
                }else if(year == 1918){
                    return "26.09.1918";
                }
                c.add(Calendar.DATE, 255);
                return sdf.format(c.getTime());
            }catch (Exception e){
                return "FAIL";
            }
        }catch (Exception e){
            return "FAIL";
        }
    }

}

