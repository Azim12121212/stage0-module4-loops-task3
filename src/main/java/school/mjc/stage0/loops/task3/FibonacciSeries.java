package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void printFibonacci(int lastFibonacci) {
        int number=0;
        int prevNumber=1;
        int prevPrevNumber=0;

        for (int i=0; i<lastFibonacci; i++) {
            if (i==0) {
                System.out.println(number);
            } else if (i==1) {
                number+=1;
                System.out.println(number);
            } else {
                number = prevPrevNumber + prevNumber;
                System.out.println(number);
                prevPrevNumber = prevNumber;
                prevNumber = number;
            }
        }
    }
    public static void main(String[] args) {
        printFibonacci(5);
    }
}
