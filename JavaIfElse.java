//Asfaria CHOWDHURY

package Sol;

/*
    Github: https://github.com/AsfariaChowdhury2/HackerrankJava
    Hackerrank: https://www.hackerrank.com/asfaria_chy00
    Link to problem: https://www.hackerrank.com/challenges/java-if-else/problem?h_r=profile
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaIfElse {



    private static final Scanner scanner = new Scanner(System.in);

    public static void LOG(String output){
        System.out.println(output);
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N%2!=0){
            LOG("Weird");   //if n = 3
        }else if(N%2==0 && N>=2 && N<=5){
            LOG("Not Weird");
        }else if(N%2==0 && N>=6 && N<=20){
            LOG("Weird");
        }else if(N%2==0 && N>20){
            LOG("Not Weird");   //if n = 24
        }

        scanner.close();
    }
}


