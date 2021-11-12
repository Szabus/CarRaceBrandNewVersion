package controller;
import races.Races;
import teams.Brand;
import teams.Teams;
import java.util.*;

public class ChampionShipController {

    private List<Teams> teamsList = new ArrayList<>();
    private List<Races> raceCountries = new ArrayList<>();
    private List<Results> raceResult = new ArrayList<>();
    private List <Results> championshipResult = new ArrayList<>();
    private Results results = new Results();
    private List<Results> oneRaceResultList = new ArrayList<>();
    private Map<Brand, Double> finalCountDown = new HashMap<>();


    public Map<Brand, Double> getFinalCountDown() {
        return finalCountDown;
    }

    public ChampionShipController() {
        loadLists();
        championShip();
    }

    public List<Results> getChampionshipResult() {
        return championshipResult;
   }

    public void loadLists(){
        TeamController teamController = new TeamController();
        teamsList = teamController.getTeamsList();
        RaceController raceController = new RaceController();
        raceCountries = raceController.getRaceCountries();
    }


    private void championShip() {
        for (int i = 0; i < raceCountries.size(); i++) {
            randomSpeed();
            double distance = raceCountries.get(i).getDistance();
            for (int j = 0; j < teamsList.size(); j++){
            double result = distance / teamsList.get(j).getCarSpeed();
            oneRaceResultList.add(new Results(teamsList.get(j).getBrandName(),result));
            } int index = theFastestRacer();
              championshipCounter(index);
            }
            }

    public Map<Brand,Double> championshipCounter(int index) {

            double feCounter = 0;
            double beCounter = 0;
            double reCounter = 0;
            double meCounter = 0;

            if (oneRaceResultList.get(index).getBrandName().equals(Brand.FERRARI)){
                finalCountDown.putIfAbsent(Brand.FERRARI,feCounter);
                feCounter++;
            }else if(oneRaceResultList.get(index).getBrandName().equals(Brand.BENETTON)){
                finalCountDown.putIfAbsent(Brand.BENETTON,beCounter);
                beCounter++;
            }else if(oneRaceResultList.get(index).getBrandName().equals(Brand.RENAULT)) {
                finalCountDown.putIfAbsent(Brand.RENAULT,reCounter);
                reCounter++;
            }else if(oneRaceResultList.get(index).getBrandName().equals(Brand.MERCEDES)){
                finalCountDown.putIfAbsent(Brand.MERCEDES,meCounter);
                meCounter++;
        }return finalCountDown;
    }


    public int theFastestRacer(){
        int index = 0;
        double min = oneRaceResultList.get(0).getResult();
        for (int i = 0; i < oneRaceResultList.size(); i++) {
            if(oneRaceResultList.get(i).getResult() < min){
            min = oneRaceResultList.get(i).getResult();
            index=i;
            }
        }
        return index;
    }

    private List<Teams> randomSpeed(){
        Teams teams = new Teams();
        for (int i = 0; i < teamsList.size(); i++) {
            double newSpeed = teams.setRandomCarSpeed();
            teamsList.get(i).setCarSpeed(newSpeed);
        }return teamsList;
    }

}
