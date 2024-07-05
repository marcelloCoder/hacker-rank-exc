package hacker.rank.exercices.files;


import java.io.*;
import java.util.Calendar;

public class JavaDateandTime {


    public static String findDay(int month, int day, int year) {
        String[] dayOfWeek = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        int p = calendar.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek[p-1];



    }


        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int month = Integer.parseInt(firstMultipleInput[0]);

            int day = Integer.parseInt(firstMultipleInput[1]);

            int year = Integer.parseInt(firstMultipleInput[2]);

            String res = JavaDateandTime.findDay(month, day, year);

            bufferedWriter.write(res);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }

}
