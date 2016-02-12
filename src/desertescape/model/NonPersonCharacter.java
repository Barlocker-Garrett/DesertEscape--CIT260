/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Garrett
 */
public class NonPersonCharacter implements Serializable{
    
    //class instance variables
    private String name;
    private double hitPoints;
    private String decription;
    private String foundPlayer;
    private String dropItem;

    public NonPersonCharacter() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getFoundPlayer() {
        return foundPlayer;
    }

    public void setFoundPlayer(String foundPlayer) {
        this.foundPlayer = foundPlayer;
    }

    public String getDropItem() {
        return dropItem;
    }

    public void setDropItem(String dropItem) {
        this.dropItem = dropItem;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.hitPoints) ^ (Double.doubleToLongBits(this.hitPoints) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.decription);
        hash = 71 * hash + Objects.hashCode(this.foundPlayer);
        hash = 71 * hash + Objects.hashCode(this.dropItem);
        return hash;
    }

    @Override
    public String toString() {
        return "NonPlayerCharacter{" + "name=" + name + ", hitPoints=" + hitPoints + ", decription=" + decription + ", foundPlayer=" + foundPlayer + ", dropItem=" + dropItem + '}';
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
        final NonPersonCharacter other = (NonPersonCharacter) obj;
        if (Double.doubleToLongBits(this.hitPoints) != Double.doubleToLongBits(other.hitPoints)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.decription, other.decription)) {
            return false;
        }
        if (!Objects.equals(this.foundPlayer, other.foundPlayer)) {
            return false;
        }
        if (!Objects.equals(this.dropItem, other.dropItem)) {
            return false;
        }
        return true;
    }
    
    
    
}
