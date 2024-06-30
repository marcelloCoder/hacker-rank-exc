package hacker.rank.exercices.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaysCodeLoops {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total = n * i;
            System.out.println(n +" x "+ i + " = " + total);
        }

        bufferedReader.close();
    }
}
