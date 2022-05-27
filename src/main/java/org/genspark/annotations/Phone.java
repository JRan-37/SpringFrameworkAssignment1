package org.genspark.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {
    public String getMob() {
        return mob;
    }

    @Value("#{'1(888)518-3752'}")
    public void setMob(String mob) {
        this.mob = mob;
    }

    private String mob;
}
