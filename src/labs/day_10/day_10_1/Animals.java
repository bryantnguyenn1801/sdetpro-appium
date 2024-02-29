package labs.day_10.day_10_1;

import java.security.SecureRandom;

public class Animals {
    private int maxSpeed;
    private String name;
    private Boolean flyable;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getName() {
        return name;
    }

    public Boolean isFlyable() {
        return flyable;
    }

    protected Animals(Builder builder) {
        this.name = builder.name;
        this.maxSpeed = builder.maxSpeed;
        this.flyable = builder.flyable;
    }

    public static class Builder {
        protected int maxSpeed;
        protected String name;
        protected Boolean flyable;

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder isFlyable(Boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animals build() {
            return new Animals(this);
        }
    }


    public int speed() {
        return new SecureRandom().nextInt(maxSpeed + 1);
    }


}
