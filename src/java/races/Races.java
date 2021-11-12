package races;

public class Races {

    private RaceCountries raceCountries;
    private double distance;
    private int condition;

    public Races(RaceCountries raceCountries, int distance, int condition) {
        this.raceCountries = raceCountries;
        this.distance = distance;
        this.condition = condition;
    }

    public RaceCountries getRaceCountries() {
        return raceCountries;
    }

    public double getDistance() {
        return distance;
    }

    public int getCondition() {
        return condition;
    }

}

