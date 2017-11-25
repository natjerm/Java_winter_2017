package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pliki {

    static final String PLIK = "h:" + File.separator + "plik.txt";

    public static void main(String[] args) {
            //throws FileNotFoundException {
        System.out.println(PLIK);
        File file = new File(PLIK);
        if (file.exists())
            System.out.println("Plik istnieje!!");
        //file.
        String cwd = System.getProperty("user.dir");
        System.out.println(cwd);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String linia = scanner.nextLine();
                System.out.println(linia);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Problem z wczytaniem pliku...");
        }

        if (file.isDirectory()) {
            //file.l


        }


    }
}
