import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N (> 0): ");
        int N = scanner.nextInt();
        double S = 0.0;

        for (int i = 1; i <= N; i++) {
            S += Math.pow(-1, i + 1) * (1 + i / 10.0);
        }

        System.out.printf("Значение суммы: %.2f%n", S);
    }
}
