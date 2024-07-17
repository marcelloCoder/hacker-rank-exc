package hacker.rank.exercices.files;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();

        if (s.length() == 0){
            System.out.println(0);
            return;
        }

        String[] palavras = s.split("[^a-zA-Z]+");
        // Write your code here.
        System.out.println(palavras.length);
        for (String palavra : palavras){
            System.out.println(palavra);
        }
        scan.close();
    }
}
