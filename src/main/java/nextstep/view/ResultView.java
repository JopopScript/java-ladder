package nextstep.view;


import nextstep.ladder.ExecuteLadderGame;

import static nextstep.ladder.CommonConstans.ONE_BLANK_SPACE;

public class ResultView {


    public static void printLadderResult(ExecuteLadderGame executeLadderGames) {

        executeLadderGames.getPlayers()
                .stream()
                .map(player -> player.getPlayer() + ONE_BLANK_SPACE)
                .forEach(System.out::print);

        System.out.println();

        executeLadderGames.getladders()
                .forEach(ladder -> System.out.println(ladder.getStringLine()));

    }

}
