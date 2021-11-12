package races;

public enum RaceCountries {

    ENGLAND("England"),
    FRENCH("French"),
    GERMANY("Germany"),
    HUNGARY("Hungary"),
    ITALY("Italy"),
    JAPAN("Japan"),
    SPAIN("Spain"),
    USA("USA");

    private String countryName;

    RaceCountries(String countryName) {
        this.countryName = countryName;
    }
}
