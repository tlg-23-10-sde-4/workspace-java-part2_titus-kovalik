package com.duckrace.app;


import com.duckrace.Board;
import com.duckrace.Reward;

import java.util.Locale;
import java.util.Scanner;

/*
 * This is the application "controller"
 *
 * it does all user prompting.
 */
public class DuckRaceApp {
    private final Board board = new Board();

    //this is the way to write Scanner
    private final Scanner scanner = new Scanner(System.in);

    public void execute() {
        welcome();
        showBoard();
        int id = promptForId();
        Reward reward = promtForReward();
        updateBoard(id, reward);
        showBoard();
    }

    private void updateBoard(int id, Reward reward) {
        board.update(id, reward);
    }

    private Reward promtForReward() {
        Reward reward = null;

        boolean validInput = false;
        while (!validInput) {
            System.out.print("Please [D]ebit card or [P]rizes: ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.matches("D|P")) {
                validInput = true;
                //alternative to an if/else statement assigning the value of reward
                reward = ("D".equals(input)) ? Reward.DEBIT_CARD : Reward.PRIZES ;
            }
        }

        return reward;
    }

    private int promptForId() {
        int id = 0;

        boolean validInput = false;
        while(!validInput) {
            System.out.printf("Please enter id of the winner [1 - %s]\n", board.maxId()); // TODO
            String input = scanner.nextLine().trim();
            if (input.matches("\\d{1,2}")) {
                id = Integer.parseInt(input);
                if (1 <= id && id <= board.maxId()) {
                    validInput = true;
                }
            }
        }

        return id;
    }

    private void showBoard() {
        board.show();
    }

    private void welcome() {
        System.out.println("====================================================");
        System.out.println(" W E L C O M E    T O     T H E     D U C K R A C E");
        System.out.println("====================================================");
    }

}