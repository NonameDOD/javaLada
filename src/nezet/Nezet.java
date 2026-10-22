import java.util.Scanner;
import modell.Modell;


public class Nezet {

    private final Scanner sc = new Scanner(System.in);

    public void udvozles() {
        System.out.println("=== Melyik ládában van a kincs? ===");
        System.out.println("Mindhárom ládán van egy felirat, de közülük csak 1 igaz.");
        System.out.println();
    }

    public void ladakMegjelenitese(Modell model) {
        for (int i = 0; i < model.getLadakSzama(); i++) {
            System.out.printf("%d. %s láda: \"%s\"%n",
                    i + 1, model.getNev(i), model.getFelirat(i));
        }
        System.out.println();
    }

    public int tippBekeres(int max) {
        while (true) {
            System.out.print("Melyik ládát nyitod ki? (1-" + max + "): ");
            String sor = sc.nextLine().trim();
            try {
                int szam = Integer.parseInt(sor);
                if (szam >= 1 && szam <= max) {
                    return szam - 1;
                }
            } catch (NumberFormatException e) {
                 System.out.println("Érvénytelen bemenet, adj meg egy számot 1 és " + max + " között!");
            }
        }
    }

    public void rossz(String ladaNev) {
        System.out.println("Sajnos az " + ladaNev + " láda üres. Próbáld újra!");
        System.out.println();
    }

    public void nyert(String ladaNev, int probalkozasok) {
        System.out.println();
        System.out.println("Gratulálok, megtaláltad a kincset az " + ladaNev + " ládában!");
        System.out.println("Próbálkozások száma: " + probalkozasok);
    }
}