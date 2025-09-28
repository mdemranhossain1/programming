import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("৫টি সংখ্যা দিন:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("সংখ্যা " + i + ": ");
            int number = input.nextInt();
            sum += number;
        }

        System.out.println("মোট যোগফল: " + sum);
    }
}
