//Asfaria CHOWDHURY

package Solution;

/*
    Github: https://github.com/AsfariaChowdhury2/HackerrankJava
    Hackerrank: https://www.hackerrank.com/asfaria_chy00
    Link to problem: https://www.hackerrank.com/challenges/java-output-formatting/problem
*/


import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                //sc.nextLine();
                String printBlank = "";
                int iteration = 15 - s1.length();
                for(int j = 0; j < iteration; j++){
                    printBlank += " ";
                }
                System.out.print(s1 + printBlank);
                System.out.printf("%03d", x);
                System.out.println();
            }
            //System.out.println();
            System.out.println("================================");

    }
}






