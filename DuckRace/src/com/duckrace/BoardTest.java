package com.duckrace;

import static com.duckrace.Reward.*;

class BoardTest {
    public static void main(String[] args) {
        Board board = Board.getInstance();

        board.update(4, DEBIT_CARD);
        board.update(4, DEBIT_CARD);
        board.update(14, DEBIT_CARD);
        board.update(14, DEBIT_CARD);
        board.update(8, PRIZES);
        board.update(9, DEBIT_CARD);
        board.update(8, PRIZES);
        board.update(3, DEBIT_CARD);

        board.show();
    }

}