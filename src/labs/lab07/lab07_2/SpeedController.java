package labs.lab07.lab07_2;


public class SpeedController {
    private final Animal[] animals;

    public SpeedController(Animal... animals) {
        this.animals = animals;
    }

    public String calculateSpeed() {
        String winner = "";
        int maxSpeed = -1;
        for (Animal animal : animals) {
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
