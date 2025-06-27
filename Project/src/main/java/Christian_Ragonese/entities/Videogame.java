package Christian_Ragonese.entities;

public class Videogame extends Game {
    private String platform;
    private int duration;
    private Genre genre;


    public Videogame(String IDgame, String title, Integer publicationYear, Double price, String platform, int duration, Genre genre) {
        super(IDgame, title, publicationYear, price);

        this.platform = platform;
        this.duration = duration;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Videogame{" +
                "platform='" + platform + '\'' +
                ", duration=" + duration +
                ", genre=" + genre +
                "} " + super.toString();
    }

}
