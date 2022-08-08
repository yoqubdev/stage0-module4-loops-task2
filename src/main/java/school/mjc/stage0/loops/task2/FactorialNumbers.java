package school.mjc.stage0.loops.task2;

public class FactorialNumbers {

    public static void main(String[] args) {
        FactorialNumbers factorialNumbers=new FactorialNumbers();
        factorialNumbers.printFactorialRow(5);
    }

    public void printFactorialRow(int printToInclusive) {
        long factorial = 1;

        for (int i = 1; i <= printToInclusive; i++)
        {
            factorial = factorial * i;
            System.out.println(factorial);
        }
    }
}
