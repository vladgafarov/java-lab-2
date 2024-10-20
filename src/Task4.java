public class Task4 {
    public static long calculatePowersSum(int A) {
        long cube = (long) Math.pow(A, 3);
        long fifthPower = (long) Math.pow(A, 5);
        long seventhPower = (long) Math.pow(A, 7);

        return cube + fifthPower + seventhPower;
    }

    public static void main(String[] args) {
        int A = 2;
        long result = calculatePowersSum(A);
        System.out.println("Сумма третьей, пятой и седьмой степени числа " + A + " равна: " + result);
    }
}
