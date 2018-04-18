package com.github.xenteros.checkers.controller;


import com.github.xenteros.checkers.model.Board;
import com.github.xenteros.checkers.model.Pawn;

/**
 * Game controller będzie zarządzał planszą i wykonywał walidacje (np, czy gra się skończyła).
 */
public class GameController {

    private Board board;

    public GameController(Board board) {
        this.board = board;
    }

    public Pawn[][] getBoard() {
        return board.getBoardCopy();
    }
}
