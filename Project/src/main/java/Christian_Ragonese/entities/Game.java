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
        return
                "| ID=" + IDGame +
                        " | title='" + title + " |" +
                        " publicationYear=" + publicationYear +
                        " | price=" + price;
    }

    public String getIDGame() {
        return IDGame;
    }

    public void setIDGame(String IDGame) {
        this.IDGame = IDGame;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
