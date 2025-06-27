package Christian_Ragonese;

import Christian_Ragonese.entities.Boardgame;
import Christian_Ragonese.entities.Collection;
import Christian_Ragonese.entities.Genre;
import Christian_Ragonese.entities.Videogame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection collection = new Collection();
        for (int i = 0; i < collection.games.size(); i++) {
            System.out.println(collection);
        }

        System.out.println("Menu azioni : ");
        System.out.println(" ");
        System.out.println("Inserisci 1 per aggiungere un nuovo gioco.");
        System.out.println("Inserisci 2 per ricercare un gioco inserendone l'ID");
        System.out.println("Inserisci 3 per ricercare i giochi con prezzo inferiore a quello inserito");
        System.out.println("Inserisci 4 per ricercare i giochi da tavolo con numero di giocatori uguali a quello inserito");
        System.out.println("Inserisci 5 per rimuovere un gioco inserendone l'ID");
        System.out.println("Inserisci 6 per aggiornare un gioco inserendone l'ID");
        System.out.println("Inserisci 7 per ricevere le statistiche della collezione");
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
                    System.out.println("Genere tra |FPS, ARCADE, MMORPG, RPG, PARTY|: ");
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
                    Integer year = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il prezzo ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("Inserisci il numero dei giocatori");
                    int nGamers = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la durata media di una partita in minuti");
                    int avgDuration = Integer.parseInt(scanner.nextLine());
                    Boardgame boardgame = new Boardgame(id, title, year, price, nGamers, avgDuration);
                    collection.addGame(boardgame);
                    System.out.println(boardgame);
                } else {
                    System.out.println("Numero inserito non valido!");
                }
                System.out.println("Giochi presenti nella collezione:  " + collection.games.size());
                collection.games.forEach((s, game) -> System.out.println(game));
                break;


            case 2:
                System.out.println("Inserisci l'id da ricercare: ");
                String gId = scanner.nextLine();

                collection.researchById(gId);
                break;
            case 3:

                System.out.println("Inserisci il prezzo massimo: ");
                Double priceM = Double.parseDouble(scanner.nextLine());
                System.out.println(collection.researchByPrice(priceM));

                break;

            case 4:
                System.out.println("Inserisci il numero di giocatori per il gioco da tavolo");
                int nG = Integer.parseInt(scanner.nextLine());
                System.out.println(collection.researchByNumOGamers(nG));
                break;

            case 5:
                System.out.println("Inserisci l'ID del gioco che si desidera rimuovere: ");
                String IdRemove = scanner.nextLine();
                collection.removeByID(IdRemove);
                break;
            case 6:
                System.out.println("Inserisci l'ID del gioco che si desidera modificare: ");
                String editG = scanner.nextLine();
                collection.editById(editG);
                break;
            case 7:
                collection.printStats();
                break;
        }

    }
}