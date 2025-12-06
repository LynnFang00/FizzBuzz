package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce());

    }
    public static int reduce(){
        return reduce(100);
    }

    public static int reduce(int a) {
        int steps = 0;

        while (a > 0){
            boolean isEven = a % 2 == 0;
            boolean isOdd = a % 2 != 0;
            if (isEven){
                a = a / 2;
            } else if (isOdd){
                a--;
            }
            steps++;
        }
        return steps;
    }
}
