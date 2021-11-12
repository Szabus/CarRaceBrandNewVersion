package teams;

import races.RaceCountries;

import java.util.Random;

public class Teams {

    private Brand brandName;
    private Health pilot= Health.HEALTHY;
    private Health engineer = Health.HEALTHY;
    private Health coordinator = Health.HEALTHY;
    private Health mechanical = Health.HEALTHY;
    private int mechanicalProductivity;
    private int carCondition; //1-10
    public double carSpeed;
    private RaceCountries homeCountry;

    public Teams() {
    }

    public void setCarSpeed(double carSpeed) {
        this.carSpeed = carSpeed;
    }

    public Teams(Brand brandName, int mechanicalProductivity, int carCondition, double carSpeed, RaceCountries homeCountry) {
        this.brandName = brandName;
        this.mechanicalProductivity = mechanicalProductivity;
        this.carCondition = carCondition;
        this.carSpeed = carSpeed;
        this.homeCountry = homeCountry;
    }

    public Teams(Brand brandName, Health pilot, Health engineer, Health coordinator, Health mechanical,
                 int mechanicalProductivity, int carCondition, double carSpeed, RaceCountries homeCountry) {
        this.brandName = brandName;
        this.pilot = pilot;
        this.engineer = engineer;
        this.coordinator = coordinator;
        this.mechanical = mechanical;
        this.mechanicalProductivity = mechanicalProductivity;
        this.carCondition = carCondition;
        this.carSpeed = carSpeed;
        this.homeCountry = homeCountry;
    }

    public Brand getBrandName() {
        return brandName;
    }

    public Health getEngineer() {
        return engineer;
    }

    public Health getMechanical() {
        return mechanical;
    }

    public int getMechanicalProductivity() {
        return mechanicalProductivity;
    }

    public int getCarCondition() {
        return carCondition;
    }

    public double getCarSpeed() {
    return carSpeed;
    }

    public RaceCountries getHomeCountry() {
        return homeCountry;
    }


    public double setRandomCarSpeed(){
       Random rand = new Random();
       carSpeed = rand.nextInt (60)+380;
       return carSpeed;
    }



}
