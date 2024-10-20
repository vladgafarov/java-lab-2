import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите e: ");
        double e = scanner.nextDouble();

        double Ak1 = 0;
        double Ak = 2;
        int k = 1;

        while (Math.abs(Ak - Ak1) >= e) {
            k++;
            Ak1 = Ak;
            Ak = 2 + 1 / Ak1;
        }

        System.out.println("k = " + k + ", A(k-1) = " + Ak + ", A(k) = " + Ak1);
    }
}
