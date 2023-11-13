package com.duckrace;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class DuckRacer implements Serializable {
    private final int id;
    private String name;
    private final Collection<Reward> rewards = new ArrayList<>();

    //Constructor
    public DuckRacer(int id, String name) {
        this.id = id;
        setName(name);
    }

    //Action methods
    public void win(Reward reward) {
        rewards.add(reward);
    }

    //Accessor methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getWins() {
        return rewards.size();
    }
    /*
     *NOTE: instead of returning a direct reference to the Collections,
     *  make an immutable "Read Only" list that the client gets
     */
    public Collection<Reward> getRewards() {
        return Collections.unmodifiableCollection(rewards);
//        return List.copyOf(rewards);

    }

    @Override
    public String toString() {
        return String.format("%s: ID: %s, Name: %s, Wins: %s, Rewards: %s",
                getClass().getSimpleName(), getId(), getName(), getWins(), getRewards());
    }
}