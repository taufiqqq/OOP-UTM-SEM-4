package javaappweek1;

import java.util.Objects;

public class Address {
    private int homeNum;
    private String streetAddress;

    public Address() {
        homeNum = 0;
        streetAddress = null;
    }

    public Address(int homeNum, String streetAddress) {
        this.homeNum = homeNum;
        this.streetAddress = streetAddress;
    }

    public int getHomeNum() {
        return homeNum;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setHomeNum(int homeNum) {
        this.homeNum = homeNum;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
            
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if (this.homeNum != other.homeNum) {
            return false;
        }
        if(!Objects.equals(this.streetAddress, other.streetAddress)){
            return false;
        }
        return true;
    }
}
