package ex01;

import java.io.*;

public class Calc {
    private Item2d result;
    private String file = "save.bin";

    public void calculate(double m, double v, double h) {
        double e = (m * v * v) / 2 + (m * 9.81 * h);
        result = new Item2d(m, v, h, e);
    }

    public void save() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(result);
        out.close();
    }

    public void restore() throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        result = (Item2d) in.readObject();
        in.close();
        result.bin = Long.toBinaryString((long) result.energy);
    }

    public void show() {
        if (result != null) System.out.println(result.toString());
    }

    public Item2d getResult() { return result; }
}
