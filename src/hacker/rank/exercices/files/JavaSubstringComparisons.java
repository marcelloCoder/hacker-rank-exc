package hacker.rank.exercices.files;

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String currentSubstring = s.substring(0 ,k);
        String smallest = currentSubstring;
        String largest = currentSubstring;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 1; i <= s.length() - k; i++) {
            currentSubstring = s.substring(i ,i+k);
            if(currentSubstring.compareTo(largest) > 0){
                largest = currentSubstring;
            }
            if(currentSubstring.compareTo(smallest) < 0){
                smallest = currentSubstring;
            }
        }
        
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
