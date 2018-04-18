package com.github.xenteros.checkers.model;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by agurgul on 17.04.2018.
 */
public class BoardTest {


    @Test
    public void whenModifyingTheCopy_ThenOriginalArrayShouldNotChange() {

        Board board = new Board();
        Pawn[][] brd = board.getBoardCopy();
        brd[0][0] = Pawn.RED;
        Assertions.assertThat(board.getBoardCopy()[0]).containsOnly(Pawn.NONE);
    }

}