package pl.waw.sgh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PlikiWy {
    static final String PLIK = "h:\\Java_winter_2017";
    public static void main(String[] args) throws IOException {

        File file = new File(PLIK);
        if (file.isDirectory()) {
            File[] pliki = file.listFiles();
            for (File plik : pliki) {
                System.out.println(plik + " " + plik.isDirectory());
            }
        }

        File plikWy = new File("plikWy.txt");
        FileWriter fw = new FileWriter(plikWy);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Pierwsza linia\r\n");
        //bw.newLine();
        bw.write("Druga linia");
        bw.newLine();
        bw.write("Trzecia linia");
        bw.newLine();
        bw.close();
        fw.close();

        String s = "534535";
        int i = Integer.parseInt(s);

    }
}
