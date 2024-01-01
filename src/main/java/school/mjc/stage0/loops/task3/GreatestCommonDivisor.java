package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public static void printGCD(int first, int second) {
        int gcd = 1;
        int min = first;

        if (first==0) {
            gcd = second;
        } else if (second==0) {
            gcd = first;
        } else {
            if (second<first) {
                min = second;
            }

            for (int i = 1; i<=min; i++) {
                if (first%i==0 && second%i==0) {
                    gcd=i;
                }
            }
        }

        System.out.println(gcd);
    }
    public static void main(String[] args) {
        printGCD(1, 30);
    }
}
