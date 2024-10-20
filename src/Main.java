public class Main {
    public static void main(String[] args) {
        int A = 3;
        int B = 9;
        int count = 0;

        for (int i = A; i <= B; i++) {
            System.out.println(i);
            count++;
        }
        System.out.println("Count: " + count);
    }
}