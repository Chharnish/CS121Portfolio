public class RaceHorse extends Horse{
    public int racesWon;

    //constructor
    public RaceHorse(String name, String color, int birthYear, int racesWon) {
        super(name, color, birthYear);
        this.racesWon = racesWon;
    }
    //setter
    public void setRacesWon(int racesWon){
        this.racesWon = racesWon;
    }
    //getter
    public int racesWon() {
        return racesWon;
    }

    @Override
    public String toString() {
        return String.format("%s\nThis horse has won %s races", super.toString(), racesWon);
    }
}
