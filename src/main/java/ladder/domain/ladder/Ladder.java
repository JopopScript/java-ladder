package ladder.domain.ladder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import ladder.strategy.LineGenerateStrategy;

public class Ladder {

    private static final int START_LADDER_INDEX = 0;


    private final List<Line> lines;

    public Ladder(List<Line> lines) {
        this.lines = lines;
    }

    public static Ladder createLadder(LadderHeight height, int userCount, LineGenerateStrategy lineGenerateStrategy) {
        List<Line> lines = new ArrayList<>();
        IntStream.range(START_LADDER_INDEX, height.value())
            .forEach(index -> lines.add(Line.generateRandomLine(userCount, lineGenerateStrategy)));
        return new Ladder(lines);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ladder ladder = (Ladder) o;
        return Objects.equals(lines, ladder.lines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lines);
    }

}
