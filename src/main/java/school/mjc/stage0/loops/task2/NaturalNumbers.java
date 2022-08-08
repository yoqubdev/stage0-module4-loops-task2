package school.mjc.stage0.loops.task2;

public class NaturalNumbers {

    public static void main(String[] args) {
        NaturalNumbers naturalNumbers=new NaturalNumbers();
        naturalNumbers.naturalNumbersPrinter(10);
    }

    public void naturalNumbersPrinter(int lastPrinted) {

        int begin = 0;

        while (begin <= lastPrinted){

            System.out.println(begin);
            begin++;
        }
    }
}
