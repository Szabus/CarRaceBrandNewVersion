import controller.ChampionShipController;

public class CarRace {

    public static void main(String[] args) {

        ChampionShipController championShipController = new ChampionShipController();
        for (int i = 0; i < championShipController.getFinalCountDown().size(); i++) {
            System.out.println(championShipController.getFinalCountDown().get(i));
        }
    }
}

