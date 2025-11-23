public class BusPandemi {

    public double persentase(int kapasitas, int penumpang) {
        return (double) penumpang / kapasitas * 100;
    }

    public boolean berangkat(double persentase) {
        return persentase >= 50 && persentase <= 75;
    }
}
