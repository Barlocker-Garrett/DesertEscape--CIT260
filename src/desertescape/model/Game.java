/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape.model;

import java.io.Serializable;

/**
 *
 * @author Garrett
 */
public class Game implements Serializable{
    //class instance variables
    private int totalTime;
    private int difficulty;
    private Player player;

    public Player getPlayer() {
        return player;
    }

    public Game(Player player) {
        this.player = player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Game() {
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.totalTime;
        hash = 59 * hash + this.difficulty;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.totalTime != other.totalTime) {
            return false;
        }
        if (this.difficulty != other.difficulty) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", difficulty=" + difficulty + '}';
    }
    
}
