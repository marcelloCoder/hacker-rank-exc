package hacker.rank.exercices.files;

import java.util.Scanner;

public class EndFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int line_number = 1;

        while(sc.hasNext()){
            System.out.println(line_number + " " + sc.nextLine());
            line_number++;
        }
        sc.close();
    }

}
