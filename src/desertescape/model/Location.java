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
public class Location implements Serializable {
    
    // class instance variables
    private String locationType;
    private String descriptrion;
    private String locationEvent;

    public Location() {
    }
    
    

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getDescriptrion() {
        return descriptrion;
    }

    public void setDescriptrion(String descriptrion) {
        this.descriptrion = descriptrion;
    }

    public String getLocationEvent() {
        return locationEvent;
    }

    public void setLocationEvent(String locationEvent) {
        this.locationEvent = locationEvent;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.locationType);
        hash = 61 * hash + Objects.hashCode(this.descriptrion);
        hash = 61 * hash + Objects.hashCode(this.locationEvent);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "locationType=" + locationType + ", descriptrion=" + descriptrion + ", locationEvent=" + locationEvent + '}';
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.locationType, other.locationType)) {
            return false;
        }
        if (!Objects.equals(this.descriptrion, other.descriptrion)) {
            return false;
        }
        if (!Objects.equals(this.locationEvent, other.locationEvent)) {
            return false;
        }
        return true;
    }
    
    
}
