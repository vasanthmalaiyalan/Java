class Pwr {
    double b;
    int e;
    double val;

    // constructor with parameters
    Pwr(double b, int e) {
        this.b = b;
        this.e = e;
        this.val = 1;

        if (e == 0) return;

        for (; e > 0; e--)
              this.val = this.val * this.b;
    }

    // method to return value
    double getVal() {
        return this.val;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {

        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " raised to the " + x.e + " Power is " + x.getVal());

        System.out.println(y.b + " raised to the " + y.e + " power is " + y.getVal());

        System.out.println(z.b +  " raised to the " + z.e + " power is " + z.getVal());
    }
}