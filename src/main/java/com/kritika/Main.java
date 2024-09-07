package com.kritika;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Making Tight coupling into loose Coupling using Interface
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacmanGame = new PacmanGame();
        GameRunner gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}