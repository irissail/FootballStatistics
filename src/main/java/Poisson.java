public class Poisson {

    static double projectedAwayTeamGoals = Model.projectedAwayTeamGoals();
    static double projectedHomeTeamGoals = Model.projectedHomeTeamGoals();


    public static double[] poissonHomeTeam() {
        double[] poissonHomeTeam = new double[6];
        int factorial = 1;
        for (int k = 0; k <= 5; k++) {
            if (k == 0) {
                factorial = 1;
            } else {
                factorial *= k;
            }
            poissonHomeTeam[k] = Math.pow(projectedHomeTeamGoals, k) * Math.pow(Math.E, -projectedHomeTeamGoals) / factorial;
        }
        return poissonHomeTeam;
    }

    public static int HomeTeamScore(double[] poissonHomeTeam) {
        double maxHomeTeam = poissonHomeTeam[0];
        int homeTeamScore = 0;
        for (int i = 0; i <= 5; i++) {
            if (poissonHomeTeam[i] > maxHomeTeam) {
                maxHomeTeam = poissonHomeTeam[i];
                homeTeamScore = i;
            }
        }
        return homeTeamScore;
    }

    public static double[] poissonAwayTeam() {
        double[] poissonAwayTeam = new double[6];
        int factorial = 1;
        for (int k = 0; k <= 5; k++) {
            if (k == 0) {
                factorial = 1;
            } else {
                factorial *= k;
            }
            poissonAwayTeam[k] = Math.pow(projectedAwayTeamGoals, k) * Math.pow(Math.E, -projectedAwayTeamGoals) / factorial;

        }
        return poissonAwayTeam;
    }

    public static int AwayTeamScore(double[] poissonAwayTeam) {
        int awayTeamScore = 0;
        double maxAwayTeam = poissonAwayTeam[0];
        for (int i = 0; i <= 5; i++) {
            if (poissonAwayTeam[i] > maxAwayTeam) {
                maxAwayTeam = poissonAwayTeam[i];
                awayTeamScore = i;
            }
        }
        return awayTeamScore;
    }


}
