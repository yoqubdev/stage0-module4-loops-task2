package school.mjc.stage0.loops.task2;

public class Multiplication {

    public static void main(String[] args) {
        Multiplication multiplication=new Multiplication();
        multiplication.printMultiplied(5);
    }

    public void printMultiplied(int multiplyByAndToInclusive) {
        int  i = 0;
        while(i <= multiplyByAndToInclusive)
        {
            System.out.println(i*multiplyByAndToInclusive);
            i++;
        }
    }
}
