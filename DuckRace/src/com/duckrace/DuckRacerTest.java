package com.duckrace;

import java.util.Collection;

class DuckRacerTest {
    public static void main(String[] args) {
        DuckRacer racer = new DuckRacer(14, "Scott");
        System.out.println(racer);

        racer.win(Reward.PRIZES);
        racer.win(Reward.DEBIT_CARD);
        racer.win(Reward.PRIZES);
        racer.win(Reward.PRIZES);
        System.out.println(racer);

        //we can cheat here, and get more rewards without actually winning.

        Collection<Reward> rewards = racer.getRewards();
        System.out.println(rewards);

        racer.win(Reward.DEBIT_CARD);
        racer.win(Reward.DEBIT_CARD);

        System.out.println(rewards); // this will still show four. it doesn't read through

    }
}