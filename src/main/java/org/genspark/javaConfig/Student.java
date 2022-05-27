package org.genspark.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Student
{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    @Autowired
    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    @Autowired
    public void setAdd(Address add) {
        this.add = add;
    }

    @Value("#{1110111011}")
    private int id;
    @Value("#{'Kepler'}")
    private String name;
    private List<Phone> ph;
    private Address add;

}