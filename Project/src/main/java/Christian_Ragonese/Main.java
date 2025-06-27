package Christian_Ragonese;

import Christian_Ragonese.entities.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection collection = new Collection();

        Game g = collection.idResearch("123");
        if (g != null) {
            System.out.println("Trovato: " + g);
        } else {
            System.out.println("Gioco non trovato");
        }

        System.out.println(collection.researchByNumOGamers(3));

        System.out.println(collection.researchByPrice(30.9));
        System.out.println(" ");
        System.out.println("Menu azioni : ");
        System.out.println("Inserisci 1 per aggiungere un nuovo gioco.");

        int n = Integer.parseInt(scanner.nextLine());
        switch (n) {

            case 1:
                System.out.println("Inserisci 1 per aggiungere un videogioco, inserisci 2 per aggiungere un gioco da tavolo:");
                int num = Integer.parseInt(scanner.nextLine());
                if (num == 1) {


                    System.out.println("Inserisci l'ID");
                    String id = scanner.nextLine();
                    System.out.println("Inserisci il titolo");
                    String title = scanner.nextLine();
                    System.out.println("Inserisci l'anno di pubblicazione ");
                    Integer anno = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il prezzo ");
                    double prezzo = Double.parseDouble(scanner.nextLine());
                    System.out.println("Inserisci la piattaforma ");
                    String piattaforma = scanner.nextLine();
                    System.out.println("Inserisci la durata");
                    int durata = Integer.parseInt(scanner.nextLine());
                    System.out.println("Genere tra |AZIONE, AVVENTURA, SPORT, STRATEGIA, RPG, SIMULAZIONE|: ");
                    Genre genre = Genre.valueOf(scanner.nextLine().toUpperCase());
                    Videogame videogame = new Videogame(id, title, anno, prezzo, piattaforma, durata, genre);
                    collection.addGame(videogame);
                    System.out.println(videogame);
                } else if (num == 2) {
                    System.out.println("Inserisci l'ID");
                    String id = scanner.nextLine();
                    System.out.println("Inserisci il titolo");
                    String title = scanner.nextLine();
                    System.out.println("Inserisci l'anno di pubblicazione ");
                    Integer anno = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il prezzo ");
                    double prezzo = Double.parseDouble(scanner.nextLine());
                    System.out.println("Inserisci il numero dei giocatori");
                    int nGamers = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la durata media di una partita in minuti");
                    int avgDuration = Integer.parseInt(scanner.nextLine());
                    Boardgame boardgame = new Boardgame(id, title, anno, prezzo, nGamers, avgDuration);
                    collection.addGame(boardgame);
                    System.out.println(boardgame);
                } else {
                    System.out.println("Numero inserito non valido!");
                }
                System.out.println("Giochi presenti nella collezione:  " + collection.games.size());
                collection.games.forEach((s, game) -> System.out.println(game));
                break;

        }
    }
}
