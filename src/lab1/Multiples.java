package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }

    public static int multiples(int n, int a, int b) {
        int i = 1;
        int count = 0;
        while (i < n){
            boolean divisibleByA = i % a == 0;
            boolean divisibleByB = i % b == 0;
            if (divisibleByA || divisibleByB){
                count++;
            }
            i++;
        }
        return count;
    }
}
