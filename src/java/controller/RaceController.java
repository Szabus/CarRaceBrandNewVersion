package controller;

import races.*;


import java.util.*;

public class RaceController {

    private final Races ENGLAND = new Races(RaceCountries.ENGLAND, 5500, 4);
    private final Races FRENCH = new Races(RaceCountries.FRENCH, 6300, 5);
    private final Races GERMANY = new Races(RaceCountries.GERMANY, 6700, 5);
    private final Races HUNGARY = new Races(RaceCountries.HUNGARY, 5000, 1);
    private final Races ITALY = new Races(RaceCountries.ITALY, 5600, 3);
    private final Races JAPAN = new Races(RaceCountries.JAPAN, 4800, 4);
    private final Races SPAIN = new Races(RaceCountries.SPAIN, 7000, 3);
    private final Races USA = new Races(RaceCountries.USA, 6400, 2);


    private final List<Races> raceCountries = new ArrayList<>();

    public RaceController() {
        loadCountryList();
    }

    public List<Races> getRaceCountries() {
        return raceCountries;
    }

    public void loadCountryList(){
        raceCountries.add(0, ENGLAND);
        raceCountries.add(0, FRENCH);
        raceCountries.add(0, GERMANY);
        raceCountries.add(0, HUNGARY);
        raceCountries.add(0, ITALY);
        raceCountries.add(0, JAPAN);
        raceCountries.add(0, SPAIN);
        raceCountries.add(0, USA);
    }


}


