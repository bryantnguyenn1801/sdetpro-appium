package labs.lab07.lab07_2;

import java.security.SecureRandom;

public class Animal {
    protected final int maxSpeed;
    protected final String name;

    public Animal(String name, int speed) {
        this.name = name;
        this.maxSpeed = speed;
    }

    public int speed() {
        return new SecureRandom().nextInt(maxSpeed + 1);
    }


    public String getName() {
        return name;
    }


}
