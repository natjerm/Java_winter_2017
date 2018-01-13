package pl.waw.sgh.figury;

import java.util.*;

public class OperNaFig {

    public static void main(String[] args) {
        Prostokat p1 = new Prostokat(24,5);
        System.out.println(p1 + " \npole: " + p1.policzPole());
        //Figura f1 = new Figura(3,35);
        Kolko k1 = new Kolko(3,0);
        System.out.println("Koło: " + k1 + " " + k1.policzPole());

        Kolko k2 = new Kolko(2,0);
        System.out.println("Koło: " + k1 + " " + k1.policzPole());
        //f1.
        Figura[] tabFig = new Figura[3];
        tabFig[0] = p1;
        tabFig[1] = k1;
        tabFig[2] = k2;

      /*  for (Figura f : tabFig) {
            System.out.println(f + " " + f.policzPole());
        }
        */

        Arrays.sort(tabFig);
        List<Figura> figuraSet = new ArrayList<>();
        figuraSet.addAll(Arrays.asList(tabFig));

        for (Figura f : figuraSet) {
            System.out.println(f + " " + f.policzPole());
        }

    }
}
