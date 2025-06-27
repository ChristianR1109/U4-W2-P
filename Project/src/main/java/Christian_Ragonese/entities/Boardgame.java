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

    public void setnGamers(int nGamers) {
        this.nGamers = nGamers;
    }

    public int getAvgDuration() {
        return avgDuration;
    }

    public void setAvgDuration(int avgDuration) {
        this.avgDuration = avgDuration;
    }

    @Override
    public String toString() {
        return "Boardgame " + super.toString() +
                "| nGamers=" + nGamers +
                " | avgDuration=" + avgDuration + " |";
    }
}
