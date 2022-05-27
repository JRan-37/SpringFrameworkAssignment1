package org.genspark.javaConfig;

import org.springframework.beans.factory.annotation.Value;

public class Address
{

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Value("#{'Kepler-22'}")
    private String city;
    @Value("#{'Cygnus'}")
    private String state;
    @Value("#{'Milky Way Galaxy'}")
    private String country;
    @Value("#{'KOI-087.01'}")
    private String zipcode;
}
