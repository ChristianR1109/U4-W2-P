package Christian_Ragonese.entities;

public class Boardgame extends Game {
    private int nGamers;
    private int avgDuration;

    public Boardgame(String IDgame, String title, Integer publicationYear, Double price, int nGamers, int avgDuration) {
        super(IDgame, title, publicationYear, price);
        this.nGamers = nGamers;
        this.avgDuration = avgDuration;
    }

    public int getnGamers() {
        return nGamers;
    }

    public int getAvgDuration() {
        return avgDuration;
    }

    @Override
    public String toString() {
        return "Boardgame{" +
                "nGamers=" + nGamers +
                ", avgDuration=" + avgDuration +
                "} " + super.toString();
    }
}
