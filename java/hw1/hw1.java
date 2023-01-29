import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("введите число n: ");
        double number = iScanner.nextInt();
        double T = (number / 2) * (number + 1);
        System.out.println(T);
        iScanner.close();
    }
}
