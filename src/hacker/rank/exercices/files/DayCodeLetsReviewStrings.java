package hacker.rank.exercices.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class DayCodeLetsReviewStrings {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            String str_odd = "";
            String str_even = "";
            for (int j = 0; j < str.length(); j++) {
                if(j%2 == 0){
                    str_even = str_even + str.charAt(j);
                }else{
                    str_odd = str_odd + str.charAt(j);
                }
            }
            System.out.println(str_even+" "+str_odd);

        }


        sc.close();

    }
}
