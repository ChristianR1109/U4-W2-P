package Christian_Ragonese.entities;

public abstract class Game {
    protected String IDGame;
    protected String title;
    protected String publicationYear;
    protected Double price;

    public Game(String IDgame, String title, String publicationYear, Double price) {

        this.IDGame = IDgame;
        this.title = title;
        this.publicationYear = publicationYear;
        this.price = price;
    }
}
