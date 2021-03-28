public class Model {

    static final String HOME_TEAM = "FC Koln";
    static final String AWAY_TEAM = "Freiburg";

    public static int totalNumberGames() {
        return Integer.valueOf(Reader.getListHomeGoals().size());
    }

    public static double avgHomeGoals() {
        return (double) totalHomeGoals() / totalNumberGames();
    }

    public static double avgAwayGoals() {
        return (double) totalAwayGoals() / totalNumberGames();
    }

    public static double avgHomeGoalsHomeTeam() {
        return (double) totalHomeGoalsHomeTeam() / totalHomeHomeTeam();
    }

    public static double homeTeamAttackStrength() {
        return avgHomeGoalsHomeTeam() / avgHomeGoals();
    }

    public static double avgAwayGoalsAwayTeamConceded() {
        return (double) totalAwayGoalsAwayTeamConceded() / totalAwayAwayTeam();
    }

    public static double awayTeamDefenceStrength() {
        return avgAwayGoalsAwayTeamConceded() / avgHomeGoals(); //avgAwayGoalsConceded = avgHomeGoals();
    }

    public static double projectedHomeTeamGoals() {
        return homeTeamAttackStrength() * awayTeamDefenceStrength() * avgHomeGoals();
    }

    public static double avgAwayGoalsAwayTeam() {
        return (double) totalAwayGoalsAwayTeam() / totalAwayAwayTeam();
    }

    public static double awayTeamAttackStrength() {
        return avgAwayGoalsAwayTeam() / avgAwayGoals();
    }

    public static double avgHomeGoalsHomeTeamConceded() {
        return (double) totalHomeGoalsHomeTeamConceded() / totalHomeHomeTeam();
    }

    public static double homeTeamDefenceStrength() {
        return avgHomeGoalsHomeTeamConceded() / avgAwayGoals();//avgHomeGoalsConceded = avgAwayGoals();
    }

    public static double projectedAwayTeamGoals() {
        return awayTeamAttackStrength() * homeTeamDefenceStrength() * avgAwayGoals();
    }

    public static int totalHomeGoals() {
        int totalHomeGoals = 0;
        for (int i = 0; i < Reader.getListHomeGoals().size(); i++) {
            totalHomeGoals += Integer.valueOf(Reader.getListHomeGoals().get(i));
        }
        return totalHomeGoals;
    }

    public static int totalAwayGoals() {
        int totalAwayGoals = 0;
        for (int i = 0; i < Reader.getListAwayGoals().size(); i++) {
            totalAwayGoals += Integer.valueOf(Reader.getListAwayGoals().get(i));
        }
        return totalAwayGoals;
    }

    public static int totalHomeGoalsHomeTeam() {
        int totalHomeGoalsHomeTeam = 0;
        for (int i = 0; i < Reader.getListHomeGoals().size(); i++) {
            if (Reader.getListHomeTeam().get(i).equals(HOME_TEAM)) {//K
                totalHomeGoalsHomeTeam += Integer.valueOf(Reader.getListHomeGoals().get(i));
            }
        }
        return totalHomeGoalsHomeTeam;
    }

    public static int totalHomeHomeTeam() {
        int totalHomeHomeTeam = 0;
        for (int i = 0; i < Reader.getListHomeGoals().size(); i++) {
            if (Reader.getListHomeTeam().get(i).equals(HOME_TEAM)) {//K
                totalHomeHomeTeam++;
            }
        }
        return totalHomeHomeTeam;
    }

    public static int totalAwayGoalsAwayTeamConceded() {
        int totalAwayGoalsAwayTeamConceded = 0;
        for (int i = 0; i < Reader.getListHomeGoals().size(); i++) {
            if (Reader.getListAwayTeam().get(i).equals(AWAY_TEAM)) {//F
                totalAwayGoalsAwayTeamConceded += Integer.valueOf(Reader.getListHomeGoals().get(i));
            }
        }
        return totalAwayGoalsAwayTeamConceded;
    }

    public static int totalAwayAwayTeam() {
        int totalAwayAwayTeam = 0;
        for (int i = 0; i < Reader.getListHomeGoals().size(); i++) {
            if (Reader.getListAwayTeam().get(i).equals(AWAY_TEAM)) {//F
                totalAwayAwayTeam++;
            }
        }
        return totalAwayAwayTeam;
    }

    public static int totalAwayGoalsAwayTeam() {
        int totalAwayGoalsAwayTeam = 0;
        for (
                int i = 0; i < Reader.getListHomeGoals().size(); i++) {
            if (Reader.getListAwayTeam().get(i).equals(AWAY_TEAM)) {//F
                totalAwayGoalsAwayTeam += Integer.valueOf(Reader.getListAwayGoals().get(i));
            }
        }
        return totalAwayGoalsAwayTeam;
    }

    public static int totalHomeGoalsHomeTeamConceded() {
        int totalHomeGoalsHomeTeamConceded = 0;
        for (
                int i = 0; i < Reader.getListHomeGoals().size(); i++) {
            if (Reader.getListHomeTeam().get(i).equals(HOME_TEAM)) {//K
                totalHomeGoalsHomeTeamConceded += Integer.valueOf(Reader.getListAwayGoals().get(i));
            }
        }
        return totalHomeGoalsHomeTeamConceded;
    }


}
