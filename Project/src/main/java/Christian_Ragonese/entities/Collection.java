package Christian_Ragonese.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    public Game idResearch(String IDGame) {
        return games.get(IDGame);

    }

    public List<Game> researchByPrice(Double maxPrice) {
        return games.values()
                .stream()
                .filter(g -> g.getPrice() < maxPrice)
                .collect(Collectors.toList());
    }

    public List<Boardgame> researchByNumOGamers(int n) {
        return games.values()
                .stream()
                .filter(g -> g instanceof Boardgame)//ho utilizzato .map per trasformare ogni oggetto generico di Game in un oggetto di tipo Boardgame, Intellij mi suggeriva questa alternativa
                .map(g -> (Boardgame) g)  // .filter(game -> ((Boardgame) game).getnGamers()) ma non mi risultava abbastanza leggibile o intuitiva, quindi ho cercato altri metodi per risolvere.
                .filter(g -> g.getnGamers() == n)
                .collect(Collectors.toList());


    }
}
