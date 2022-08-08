package school.mjc.stage0.loops.task2;

public class PrimeNumbers {

    public static void main(String[] args) {
        PrimeNumbers primeNumbers=new PrimeNumbers();
        primeNumbers.printPrimeNumbers(9);
    }

    public void printPrimeNumbers(int printToInclusive) {
        int i = 0;
        while(i <= printToInclusive) {
            System.out.println(i);
            i++;
    }

    }
}
