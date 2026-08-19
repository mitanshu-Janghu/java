import java.util.*;

class Vehicle {
    private String r, b;
    private double p;

    Vehicle() {}

    Vehicle(String r, String b, double p) {
        this.r = r;
        this.b = b;
        this.p = p;
    }

    Vehicle(Vehicle v) {
        r = v.r;
        b = v.b;
        p = v.p;
    }

    String getR() {
        return r;
    }

    void setR(String r) {
        this.r = r;
    }

    String getB() {
        return b;
    }

    void setB(String b) {
        this.b = b;
    }

    double getP() {
        return p;
    }

    void setP(double p) {
        this.p = p;
    }

    double tax() {
        return p * 0.10;
    }

    void show() {
        System.out.println(r + " " + b + " " + p + " " + tax());
    }
}

class Car extends Vehicle {
    private String f;
    private int s;

    Car() {
        super();
    }

    Car(String r, String b, double p, String f, int s) {
        super(r, b, p);
        this.f = f;
        this.s = s;
    }

    Car(Car c) {
        super(c);
        f = c.f;
        s = c.s;
    }

    String getF() {
        return f;
    }

    void setF(String f) {
        this.f = f;
    }

    int getS() {
        return s;
    }

    void setS(int s) {
        this.s = s;
    }

    double onRoad() {
        return getP() + tax();
    }

    void showCar() {
        show();
        System.out.println(f + " " + s + " " + onRoad());
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] c = new Car[3];

        for (int i = 0; i < 3; i++) {
            String r = sc.next();
            String b = sc.next();
            double p = sc.nextDouble();
            String f = sc.next();
            int s = sc.nextInt();

            c[i] = new Car(r, b, p, f, s);
        }

        for (int i = 0; i < 3; i++)
            c[i].showCar();

        c[0].setP(c[0].getP() + 50000);
        c[0].setF("Hybrid");

        Car x = new Car(c[1]);
        x.setB("Honda");
        x.setP(900000);
        x.setF("Electric");

        System.out.println("Copy:");
        x.showCar();

        Car max = c[0];

        for (int i = 1; i < 3; i++) {
            if (c[i].onRoad() > max.onRoad())
                max = c[i];
        }

        System.out.println("Highest:");
        max.showCar();

        sc.close();
    }
}