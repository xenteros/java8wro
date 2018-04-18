package com.github.xenteros.checkers.model;


import java.util.Arrays;

/**
 * Klasa będzie przechowywać stan planszy
 */
public class Board {

    private Pawn[][] board;

    public Board() {
        this.board = new Pawn[8][8];
        for (Pawn[] pawns : board) {
            Arrays.fill(pawns, Pawn.NONE);
        }
    }

    public Pawn[][] getBoardCopy() {
        Pawn[][] boardCopy = new Pawn[8][8];
        for (int i = 0; i < boardCopy.length; i++) {
            boardCopy[i] = board[i].clone();
        }
        return boardCopy;
    }

}
