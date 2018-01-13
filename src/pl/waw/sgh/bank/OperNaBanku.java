package pl.waw.sgh.bank;

public class OperNaBanku {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Klient k1 = bank.stworzKlienta("Anna", "Malinowska", "anna.malin@gmail.com");
        Klient k2 = bank.stworzKlienta("Jan", "Kowalski", "jan@kowal.com");
        Konto ko1 = bank.stworzKonto(true, "PLN", k1);
        Konto ko2 = bank.stworzKonto(false, "PLN", k1);

        Konto ko3 = bank.stworzKonto(true, "PLN", k2);
        Konto ko4 = bank.stworzKonto(false, "PLN", k2);

        System.out.println(bank);


    }
}
