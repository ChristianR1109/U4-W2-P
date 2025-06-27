package Christian_Ragonese.entities;

public class Boardgame extends Game {
    private int nGamers;
    private int avgDuration;

    public Boardgame(String IDgame, String title, String publicationYear, Double price, int nGamers, int avgDuration) {
        super(IDgame, title, publicationYear, price);
        this.nGamers = nGamers;
        this.avgDuration = avgDuration;
    }
}
