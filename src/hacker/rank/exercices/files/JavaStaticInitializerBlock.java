package hacker.rank.exercices.files;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static int Height , Breadth;
    static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);
        Height = sc.nextInt();
        Breadth = sc.nextInt();
        sc.close();

        try {
            if (Breadth <= 0 || Height <=0 ){
                flag=false;
                throw new Exception("Breadth and height must be positive");
            }

        }catch (Exception e){
            System.out.println(e);
            System.exit(0);
        }

    }




    public static void main(String[] args) throws Exception {
        if (flag){
            int area = Breadth * Height;
            System.out.println(area);
        }
    }
}
