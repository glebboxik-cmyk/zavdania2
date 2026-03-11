package ex01;

public class MainTest {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.calculate(1, 0, 10);

        if (Math.abs(c.getResult().energy - 98.1) < 0.1) {
            System.out.println("Test ok");
        } else {
            System.out.println("Pomylka testu");
        }
    }
}
