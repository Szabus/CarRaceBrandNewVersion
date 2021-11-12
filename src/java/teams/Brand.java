package teams;

public enum Brand {

    FERRARI("Ferrari"),
    BENETTON("Benetton"),
    MERCEDES("Mercedes"),
    RENAULT("Renault");

    private String brandName;

    Brand(String brandName) {
        this.brandName = brandName;
    }
}
