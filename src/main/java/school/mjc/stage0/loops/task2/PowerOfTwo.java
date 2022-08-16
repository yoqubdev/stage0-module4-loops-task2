package school.mjc.stage0.loops.task2;

public class PowerOfTwo {

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo=new PowerOfTwo();
        powerOfTwo.printPower(8);
    }

    public void printPower(int power) {
        int i=1;
        for (int a = 0; a < power; a++) {
            i *= 2;
        }
        if (i<0)
            System.out.println("too much power");
        System.out.println(i);
    }
}
