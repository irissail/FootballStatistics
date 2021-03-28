import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    private static List<String> listHomeTeam = new ArrayList<>();
    private static List<String> listAwayTeam = new ArrayList<>();
    private static List<String> listHomeGoals = new ArrayList<>();
    private static List<String> listAwayGoals = new ArrayList<>();

    public static void read() throws IOException {

        CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build(); // custom separator

        try (com.opencsv.CSVReader reader = new CSVReaderBuilder(
                new FileReader("FootballStatistics.csv"))
                .withCSVParser(csvParser)   // custom CSV parser
                .withSkipLines(1)           // skip the first line, header info
                .build()) {
            List<String[]> r = reader.readAll();
            for (String[] item : r) {
                listHomeTeam.add(item[3]);
                listAwayTeam.add(item[4]);
                listHomeGoals.add(item[5]);
                listAwayGoals.add(item[6]);
            }


        } catch (CsvException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getListHomeTeam() {
        return listHomeTeam;
    }

    public static List<String> getListAwayTeam() {
        return listAwayTeam;
    }

    public static List<String> getListHomeGoals() {
        return listHomeGoals;
    }

    public static List<String> getListAwayGoals() {
        return listAwayGoals;
    }
}
