import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Zestaw1 {
    public static void main(String[] args) {
        // zad1
        System.out.println("Damian Wilk");

        // zad2
        String in = "Damian Wilk";
        int Iloscliter=in.length();
        System.out.println("Długość imienia i nazwiska to: " + Iloscliter);

        // zad3
        String slowo1 = "Ala";
        String slowo2 = "ma";
        String slowo3 = "kota";
        String zdanie = slowo1 + " " + slowo2 + " " +slowo3;
        System.out.printf(zdanie);

        //zad4
        System.out.println("                    *");
        System.out.println("                    * *");
        System.out.println("                    * * *");
        System.out.println("* * * * * * * * * * * * * * ");
        System.out.println("* * * * * * * * * * * * * * * ");
        System.out.println("* * * * * * * * * * * * * * ");
        System.out.println("                    * * *");
        System.out.println("                    * *");
        System.out.println("                    *");
        System.out.println(" ");
        System.out.println("     * ");
        System.out.println("    * *");
        System.out.println("   * * *");
        System.out.println("  * * * *");
        System.out.println(" * * * * *");
        System.out.println("* * * * * *");
        System.out.println(" * * * * *");
        System.out.println("  * * * *");
        System.out.println("   * * *");
        System.out.println("    * *");
        System.out.println("     * ");

        //zad5
        String zdanie2 = "Ala ma kota";
        String zamiana_a_na_e = zdanie2.replace('a', 'e');
        System.out.println(zamiana_a_na_e);

        //zad6
        String zdanie3 = "Ala ma kota";
        System.out.println(zdanie3);
        System.out.println(zdanie3.toUpperCase());
        System.out.println(zdanie3.toLowerCase());

        //zad7
        System.out.println(String.valueOf((int) 'A'));
        System.out.println(String.valueOf((int) '!'));
        System.out.println(String.valueOf((int) '@'));
        System.out.println(String.valueOf((int) '>'));
        System.out.println(String.valueOf((int) '~'));
        System.out.println(String.valueOf((int) '\n'));
        System.out.println(String.valueOf((int) '\b'));

        //zad8
        System.out.println("Zakres dla małych liter (a-z): " + (int) 'a' + " - " + (int) 'z');
        System.out.println("Zakres dla dużych liter (A-Z): " + (int) 'A' + " - " + (int) 'Z');
        System.out.println("Zakres dla cyfr (0-9): " + (int) '0' + " - " + (int) '9');

        //zad9
        String zdanie4 = "Grzesiek nie wiedział dlaczego %s jest tak drapieżnym %s, mimo ze jego %s na to nie wskazuje.";
        String slowo4 = "wilk";
        String slowo5 = "zwierzęciem";
        String slowo6 = "zachowanie";
        String zdanie_z_formatem = String.format(zdanie4,slowo4, slowo5, slowo6);
        System.out.println(zdanie_z_formatem);

        //zad10
        String zdanie5 = "%s to najlepsza książka napisana przez %s ";
        String tytul = "IT";
        String autor = "Stephen'a King'a";
        String zdanie_z_formatem_2 = String.format(zdanie5,tytul,autor);
        System.out.println(zdanie_z_formatem_2);

        //zad11
        for(int i = 0; i < 5; i++){
            System.out.print("wodrze ");
        }
        System.out.println(" ");

        //zad12
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String data = currentDateTime.format(dateFormatter);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String czas = currentDateTime.format(timeFormatter);

        System.out.println("Dzisiaj jest " + data + " godzina " + czas);

        //zad13
        int[] numery = { 54, 103, 241, 67, 9999, "Damian Wilk".length(), 175217};
        for (int numer : numery) {
            if(Character.isValidCodePoint(numer)){
                char znak = (char) numer;
                System.out.println("Numer: " + numer + " -> Znak: " + znak);
            } else {
                System.out.println("Numer: " + numer + " jest poza zakresem znaków.");
            }
        }
    }
}


