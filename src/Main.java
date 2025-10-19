import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.print("Inserisci la lunghezza del percorso (metri): ");
        int percorso = tastiera.nextInt();

        Cavallo c1 = new Cavallo("Fulmine", percorso);
        Cavallo c2 = new Cavallo("Saetta", percorso);
        Cavallo c3 = new Cavallo("Vento", percorso);
        Cavallo c4 = new Cavallo("Lampo", percorso);
        Cavallo c5 = new Cavallo("Furia", percorso);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();

        System.out.println("La gara è iniziata! Tutti i cavalli stanno correndo...");
    }
}
