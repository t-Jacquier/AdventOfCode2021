package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        int A, B, C;
        int sumOne, sumTwo;
        int increased = 0;
        File file = new File("/home/timeo/IntelliJIDEAProjects/AdventOfCode2021/src/day1/input.txt");
        try {
            scanner = new Scanner(file);
            A = scanner.nextInt();
            B = scanner.nextInt();
            C = scanner.nextInt();
            sumOne = A+B+C;
            while (scanner.hasNextInt()){
                A = B;
                B = C;
                C = scanner.nextInt();
                sumTwo = A+B+C;
                if (sumTwo > sumOne){
                    increased++;
                }
                sumOne = sumTwo;
            }
            System.out.println(increased);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
