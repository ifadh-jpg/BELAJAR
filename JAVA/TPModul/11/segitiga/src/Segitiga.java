public class Segitiga {

    public boolean segitigaSah(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 &&
               a + b > c &&
               a + c > b &&
               b + c > a;
    }

    public boolean segitigaSamaSisi(double a, double b, double c) {
        return segitigaSah(a, b, c) && (a == b && b == c);
    }

    public boolean segitigaSamaKaki(double a, double b, double c) {
        return segitigaSah(a, b, c) && (a == b || a == c || b == c);
    }

    public boolean segitigaSikuSiku(double a, double b, double c) {
        if (!segitigaSah(a, b, c)) return false;

        double aa = a * a;
        double bb = b * b;
        double cc = c * c;

        return (aa + bb == cc) ||
               (aa + cc == bb) ||
               (bb + cc == aa);
    }
}
