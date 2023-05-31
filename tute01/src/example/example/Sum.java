package example;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        String[] lineSplit = line.split(" ");

        int result = 0;

        // for (int i = 0; i < args.length; ++i) {
        //     int num = args[i];
        // }

        for (String num: lineSplit) {
            result += Integer.parseInt(num);
        }

        System.out.println(result);

        // 1 2 3 4 5 6
        // -> 

    }
}