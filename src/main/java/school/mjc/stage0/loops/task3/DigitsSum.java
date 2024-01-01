package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void printDigitsSum(int t){
        if (t<0) {
            t *= -1;
        }

        String s = t + "";
        int sum = 0;

        for (int i=0; i<s.length(); i++) {
            char digitChar = s.charAt(i);
            int digit = digitChar - '0';
            sum += digit;
        }

        System.out.println(sum);
    }
    public static void main(String[] args) {
        printDigitsSum(4556);
    }
}
