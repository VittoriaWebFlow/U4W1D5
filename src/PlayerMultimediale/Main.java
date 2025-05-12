package PlayerMultimediale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementMult[] elementi = new ElementMult[5];


        elementi[0] = new Image("Lucio Battisti", 3);
        elementi[1] = new Audio("Lucio Dalla", 4, 5);
        elementi[2] = new Image("De Gregori", 5);
        elementi[3] = new Audio("Fabrizio De Andrè", 3, 2);
        elementi[4] = new Image("Paolo Conte", 4);

        int scelta;
        do {
            System.out.println("\nScegli un elemento da eseguire (1-5), oppure 0 per uscire:");
            scelta = scanner.nextInt();

            if (scelta >= 1 && scelta <= 5) {
                ElementMult elem = elementi[scelta - 1];
                if (elem instanceof Audio) {
                    ((Audio) elem).play();
                } else if (elem instanceof Image) {
                    ((Image) elem).show();
                } else {
                    System.out.println("Tipo di elemento non riconosciuto.");
                }
            } else if (scelta != 0) {
                System.out.println("Scelta non valida. Riprova.");
            }

        } while (scelta != 0);

        System.out.println("Programma terminato.");
        scanner.close();
    }
}
