import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ResultsOfSportsCompetition {
    protected ArrayList<Integer> count;

    // конструктор
    public ResultsOfSportsCompetition(ArrayList<Integer> count) {
        this.count = count;
    }

    public Integer getResultA() {
        return count.get(0);
    }

    public Integer getResultB() {
        return count.get(1);
    }

    public boolean ifNotEqual() {
        return !Objects.equals(count.get(0), count.get(1));
    }

    // static
    public static Boolean ifAisWinner(ResultsOfSportsCompetition rsc) {
        return rsc.getResultA() > rsc.getResultB();
    }

    @Override
    public String toString() {
        return "Team A " + getResultA() + " : " + getResultB() + " Team B" + "\n";
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(3, 6)),
                        new ArrayList<>(Arrays.asList(8, 7)),
                        new ArrayList<>(Arrays.asList(5, 8)),
                        new ArrayList<>(Arrays.asList(9, 9)),
                        new ArrayList<>(Arrays.asList(10, 11)),
                        new ArrayList<>(Arrays.asList(3, 6)),
                        new ArrayList<>(Arrays.asList(18, 7)),
                        new ArrayList<>(Arrays.asList(5, 8)),
                        new ArrayList<>(Arrays.asList(93, 9)),
                        new ArrayList<>(Arrays.asList(10, 11))
                )
        );

        list.stream().map(ResultsOfSportsCompetition::new)
                .filter(ResultsOfSportsCompetition::ifAisWinner)
                .filter(ResultsOfSportsCompetition::ifNotEqual)
                .forEach(System.out::println);
    }
}
