package Christian_Ragonese.entities;

import java.util.*;
import java.util.stream.Collectors;

public class Collection {


    public Map<String, Game> games = new HashMap<>();
    Videogame videogame1 = new Videogame("123", "prova1", 2000, 29.90, "PS5", 24, Genre.ARCADE);
    Videogame videogame2 = new Videogame("124", "prova2", 2000, 29.90, "PS5", 24, Genre.ARCADE);
    Videogame videogame3 = new Videogame("125", "prova3", 2000, 29.90, "PS5", 24, Genre.ARCADE);
    Videogame videogame4 = new Videogame("126", "prova4", 2000, 29.90, "PS5", 24, Genre.ARCADE);
    Videogame videogame5 = new Videogame("127", "prova5", 2000, 29.90, "PS5", 24, Genre.ARCADE);
    Boardgame boardgame1 = new Boardgame("128", "prova6", 2000, 29.90, 6, 30);
    Boardgame boardgame2 = new Boardgame("129", "prova7", 2000, 29.90, 3, 30);
    Boardgame boardgame3 = new Boardgame("130", "prova8", 2000, 29.90, 3, 30);
    Boardgame boardgame4 = new Boardgame("131", "prova9", 2000, 29.90, 6, 30);
    Boardgame boardgame5 = new Boardgame("132", "prova10", 2000, 29.90, 6, 30);
    Scanner scanner = new Scanner(System.in);

    {
        games.put(videogame1.getIDGame(), videogame1);
        games.put(videogame2.getIDGame(), videogame2);
        games.put(videogame3.getIDGame(), videogame3);
        games.put(videogame4.getIDGame(), videogame4);
        games.put(videogame5.getIDGame(), videogame5);
        games.put(boardgame1.getIDGame(), boardgame1);
        games.put(boardgame2.getIDGame(), boardgame2);
        games.put(boardgame3.getIDGame(), boardgame3);
        games.put(boardgame4.getIDGame(), boardgame4);
        games.put(boardgame5.getIDGame(), boardgame5);
    }

    public void addGame(Game game) {


        try {
            if (!games.containsKey(game.getIDGame())) {
                games.put(game.getIDGame(), game);
                System.out.println("Gioco aggiunto con successo");
            } else {
                throw new IllegalArgumentException("This IDgame already exists");
            }

        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public Game researchById(String IDGame) {

        if (games.containsKey(IDGame)) {
            return games.get(IDGame);
        } else {
            throw new NoSuchElementException("ID NON TROVATO");
        }


    }

    public List<Game> researchByPrice(Double maxPrice) {
        if (maxPrice > 0) {
            return games.values()
                    .stream()
                    .filter(g -> g.getPrice() < maxPrice)
                    .collect(Collectors.toList());
        } else {
            throw new ArithmeticException("PREZZO INSERITO PARI A 0 O INFERIORE");
        }
    }

    public List<Boardgame> researchByNumOGamers(int n) {

        if (n > 0) {
            return games.values()
                    .stream()
                    .filter(g -> g instanceof Boardgame)//ho utilizzato .map per trasformare ogni oggetto generico di Game in un oggetto di tipo Boardgame, Intellij mi suggeriva questa alternativa
                    .map(g -> (Boardgame) g)  // .filter(game -> ((Boardgame) game).getnGamers()) ma non mi risultava abbastanza leggibile o intuitiva, quindi ho cercato altri metodi per risolvere.
                    .filter(g -> g.getnGamers() == n)
                    .collect(Collectors.toList());
        } else
            throw new ArithmeticException("IL VALORE DEI GIOCATORI INSERITO è 0 O MINORE");


    }

    public void removeByID(String IDGame) {
        try {
            if (games.containsKey(IDGame)) {
                games.remove(IDGame);
            } else
                throw new NoSuchElementException("ID NON PRESENTE");
        } catch (NoSuchElementException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void editById(String id) {
        if (!games.containsKey(id)) {
            throw new NoSuchElementException("ID NON PRESENTE");

        } else {

            Game testGame = games.get(id);

            if (testGame instanceof Videogame newV) { // controllo il tipo di testGame, quindi del gioco scelto tramite ID e se è uguale alla tipologia del controllo effettuo un casting, creando un oggetto newV uguale a testGame di tipo Videogame

                System.out.println("Inserisci il titolo");
                String title = scanner.nextLine();
                System.out.println("Inserisci l'anno di pubblicazione ");
                Integer year = Integer.parseInt(scanner.nextLine());
                System.out.println("Inserisci il prezzo ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Inserisci la piattaforma ");
                String platform = scanner.nextLine();
                System.out.println("Inserisci la durata");
                int duration = Integer.parseInt(scanner.nextLine());
                System.out.println("Genere tra |FPS, ARCADE, MMORPG, RPG, PARTY|: ");
                Genre genre = Genre.valueOf(scanner.nextLine().toUpperCase());
                newV.setTitle(title);
                newV.setPublicationYear(year);
                newV.setPrice(price);
                newV.setPlatform(platform);
                newV.setDuration(duration);
                newV.setGenre(genre);
                System.out.println(newV);

            } else if (testGame instanceof Boardgame newB) {


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

                newB.setTitle(title);
                newB.setPublicationYear(year);
                newB.setPrice(price);
                newB.setnGamers(nGamers);
                newB.setAvgDuration(avgDuration);

                System.out.println(newB);
            }
        }
    }

    @Override
    public String toString() {
        return "Collection{" +
                "games=" + games +
                ", videogame1=" + videogame1 +
                ", videogame2=" + videogame2 +
                ", videogame3=" + videogame3 +
                ", videogame4=" + videogame4 +
                ", videogame5=" + videogame5 +
                ", boardgame1=" + boardgame1 +
                ", boardgame2=" + boardgame2 +
                ", boardgame3=" + boardgame3 +
                ", boardgame4=" + boardgame4 +
                ", boardgame5=" + boardgame5 +
                ", scanner=" + scanner +
                '}';
    }

    public void printStats() {
        DoubleSummaryStatistics stats = games.values()
                .stream()
                .mapToDouble(g -> g.getPrice())
                .summaryStatistics();

        Optional<Game> maxPriceGame = games.values()
                .stream()
                .max(Comparator.comparingDouble(g -> g.getPrice()));

        System.out.println("Il numero totale di giochi è : " + stats.getCount());
        System.out.println("Il prezzo più alto è : " + (stats.getMax()) + " del gioco : " + maxPriceGame.get());
        System.out.println("La media dei prezzi di tutti gli elementi è : " + stats.getAverage());

    }


}
