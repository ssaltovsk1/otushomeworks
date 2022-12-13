package ru.otus.homeworks.hw06.test.test03;

import ru.otus.homeworks.hw06.test.Dice;
import ru.otus.homeworks.hw06.test.test03.GameWinnerPrinterTest03;
import ru.otus.homeworks.hw06.test.Player;

public class Game {

    private final Dice dice;
    private final GameWinnerPrinterTest03 winnerPrinter;

    public Game(Dice dice, GameWinnerPrinterTest03 winnerPrinter) {
        this.dice = dice;
        this.winnerPrinter = winnerPrinter;
    }

    public void playGame(Player player1, Player player2) {
        int player1Result = dice.roll();
        int player2Result = dice.roll();

        Player winner = (player1Result > player2Result)? player1: player2;
        winnerPrinter.printWinner(winner);
    }
}
