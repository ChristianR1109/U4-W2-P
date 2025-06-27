package Christian_Ragonese.entities;

public abstract class Game {
    protected String IDGame;
    protected String title;
    protected Integer publicationYear;
    protected Double price;

    public Game(String IDgame, String title, Integer publicationYear, Double price) {

        this.IDGame = IDgame;
        this.title = title;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "IDGame='" + IDGame + '\'' +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                '}';
    }

    public String getIDGame() {
        return IDGame;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public Double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
