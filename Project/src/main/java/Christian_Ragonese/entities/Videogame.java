package Christian_Ragonese.entities;

public class Videogame extends Game {
    private String platform;
    private int duration;
    private Genre genre;


    public Videogame(String IDgame, String title, String publicationYear, Double price, String platform, int duration, Genre genre) {
        super(IDgame, title, publicationYear, price);

        this.platform = platform;
        this.duration = duration;
        this.genre = genre;
    }
}
