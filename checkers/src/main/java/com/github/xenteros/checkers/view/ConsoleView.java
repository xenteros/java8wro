package com.github.xenteros.checkers.view;

import com.github.xenteros.checkers.controller.GameController;
import com.github.xenteros.checkers.model.Pawn;

import java.util.Arrays;

public class ConsoleView {

    private GameController gameController;

    public ConsoleView(GameController gameController) {
        this.gameController = gameController;
    }

    /**
     * Metoda drukująca planszę. Chciałbym, żeby plansza nie skakała po konsoli, więc trzeba wymyślić jak wyczyścić konsolę.
     */
    private void printBoard() {
        for (Pawn[] pawns : gameController.getBoard()) {
            System.out.println(Arrays.toString(pawns));
        }
    }

    /**
     * Fajnie byłoby zmienić zwracany typ
     */
    private void getMove() {

    }

    /**
     * Metoda, w której się wszystko dzieje
     */
    public void run() {
        printBoard();
    }
}
