package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int number = 0;
        int increment = 9;

        for (int i=1; i<=lengthOfLastNumber; i++) {
            number += increment;
            sum += number;
            increment *= 10;
        }

        System.out.println(sum);
    }
    public static void main(String[] args) {
        calculateSum(3);
    }
}
