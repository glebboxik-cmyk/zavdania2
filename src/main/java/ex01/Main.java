package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Calc c = new Calc();
        Scanner s = new Scanner(System.in);

        System.out.print("Vvedit m, v, h: ");
        c.calculate(s.nextDouble(), s.nextDouble(), s.nextDouble());

        c.show();
        c.save();


    }
}
