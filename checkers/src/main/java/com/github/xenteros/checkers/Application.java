package com.github.xenteros.checkers;

import com.github.xenteros.checkers.controller.GameController;
import com.github.xenteros.checkers.model.Board;
import com.github.xenteros.checkers.view.ConsoleView;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        Board board = new Board();
        GameController gameController = new GameController(board);
        ConsoleView consoleView = new ConsoleView(gameController);

        consoleView.run();
    }
}
