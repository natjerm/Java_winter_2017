package pl.waw.sgh.obj;

public class Prostokat /*extends Object */{

    double parA;
    double parB;

 /*   public Prostokat() {
    }*/

    public Prostokat(double parA, double parB) {
        ustawParam(parA, parB);
    }

    public void ustawParam(double parA, double parB) {
        this.parA = parA;
        this.parB = parB;
    }

    public double policzPole() {
        return parA*parB;
    }

    @Override
    public String toString() {
        return super.toString() + " Prostokat o bokach A=" + parA + " i B=" + parB;
    }
}
