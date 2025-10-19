public class Cavallo extends Thread {
    private final String nome;
    private final int lunghezzaPercorso;
    private int posizione = 0;
    private final int passo = 5; // ogni cavallo fa 5 metri per ciclo

    // Variabile condivisa da tutti i cavalli per determinare il vincitore
    private static volatile String vincitore = null;


    // Costruttore
    public Cavallo(String nome, int lunghezzaPercorso) {
        this.nome = nome;
        this.lunghezzaPercorso = lunghezzaPercorso;
    }

    @Override
    public void run() {
        System.out.println(nome + " è partito!");

        while (posizione < lunghezzaPercorso && vincitore == null) {
            posizione += passo;
            System.out.println(nome + " ha percorso " + posizione + " metri");
        }

        if (posizione >= lunghezzaPercorso && vincitore == null) {
            vincitore = nome;
            System.out.println("🏆 " + nome + " è il vincitore!");
        }
    }
}

