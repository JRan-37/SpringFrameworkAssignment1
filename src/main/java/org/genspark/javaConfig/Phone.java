package org.genspark.javaConfig;

import org.springframework.beans.factory.annotation.Value;

public class Phone {
    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }
    @Value("#{'18-999-999-9999'}")
    private String mob;
}
