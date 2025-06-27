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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Videogame{" + super.toString() +
                "platform='" + platform + '\'' +
                ", duration=" + duration +
                ", genre=" + genre +
                "} ";
    }

}
