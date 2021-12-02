package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2 {
    public static void main(String[] args){
        Scanner scanner;
        int horizontal_position= 0;
        int depth = 0;
        String direction;
        int intensity;
        File file = new File("src/day2/input");
        try{
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                direction = scanner.next();
                intensity = scanner.nextInt();
                switch (direction) {
                    case "forward":
                        horizontal_position += intensity;
                        break;
                    case "up":
                        depth -= intensity;
                        break;
                    case "down":
                        depth += intensity;
                        break;
                }
            }
            System.out.println("horizontal = " + horizontal_position+" depth = "
                    +depth+" equal " +horizontal_position*depth);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
