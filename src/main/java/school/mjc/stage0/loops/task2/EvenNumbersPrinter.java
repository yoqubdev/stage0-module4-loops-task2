package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {

    public static void main(String[] args) {
        EvenNumbersPrinter evenNumbersPrinter=new EvenNumbersPrinter();
        evenNumbersPrinter.printEvenNumbers(100);
    }

    public void printEvenNumbers(int printTillInclusive) {

        int begin = 2;

        while (begin <= printTillInclusive){
            System.out.println(begin);
            begin=begin+2;
        }
    }
}
