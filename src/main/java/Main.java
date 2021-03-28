import java.io.IOException;


public class Main {


    public static void main(String[] args) throws IOException {

        Reader.read();
        System.out.println("The most probable result of " + Model.HOME_TEAM + " vs " + Model.AWAY_TEAM + " football match is " +
                +Poisson.HomeTeamScore(Poisson.poissonHomeTeam()) + " : " + Poisson.AwayTeamScore(Poisson.poissonAwayTeam()) + ".");
    }
}