package controller;


import races.RaceCountries;
import teams.*;
import java.util.ArrayList;
import java.util.List;

public class TeamController {

    Teams benetton = new Teams(Brand.BENETTON, 8, 10,
            340, RaceCountries.ENGLAND);
    Teams ferrari = new Teams(Brand.FERRARI, 9, 10, 340,
            RaceCountries.ITALY);
    Teams renault = new Teams(Brand.RENAULT, 7, 10,
            340, RaceCountries.FRENCH);
    Teams mercedes = new Teams(Brand.MERCEDES, 6, 10,
            340, RaceCountries.GERMANY);

    public TeamController() {
        makeTeamList();
    }

    private List<Teams> teamsList = new ArrayList<>();

    public List<Teams> getTeamsList() {
        return teamsList;
    }

    public void makeTeamList() {
        teamsList.add(0, benetton);
        teamsList.add(1, ferrari);
        teamsList.add(2, renault);
        teamsList.add(3, mercedes);
    }

}