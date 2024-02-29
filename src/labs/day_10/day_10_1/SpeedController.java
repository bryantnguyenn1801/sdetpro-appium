package labs.day_10.day_10_1;

import java.util.ArrayList;
import java.util.List;

public class SpeedController {
    private Animals[] animals;

    public SpeedController(Animals... animals) {
        this.animals = animals;
    }

    public void removeNonFlyableAnimals() {
        List<Animals> flyableAnimals = new ArrayList<>();
        for (Animals animal : animals) {
            if (!animal.isFlyable()) {
                flyableAnimals.add(animal);
            }
        }
        animals = flyableAnimals.toArray(new Animals[0]);
    }

    public String calculateSpeed() {
        if (animals.length == 0) {
            return null;
        } else {
            String winner = "";
            int maxSpeed = -1;
            for (Animals animal : animals) {
                int speed = animal.speed();
                System.out.println(animal.getName());
                System.out.println(speed);
                if (speed > maxSpeed) {
                    maxSpeed = speed;
                    winner = animal.getName();
                }
            }
            return winner + " with speed " + maxSpeed;
        }


    }
}
