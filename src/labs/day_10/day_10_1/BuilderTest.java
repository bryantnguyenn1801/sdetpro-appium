package labs.day_10.day_10_1;

import labs.day_10.day_10_1.Animals.Builder;

public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Animals eagle = builder
                .setName("Eagle")
                .setMaxSpeed(150)
                .isFlyable(true)
                .build();

        Animals tiger = builder
                .setName("Tiger")
                .setMaxSpeed(100)
                .isFlyable(false)
                .build();

        Animals dog = builder
                .setName("Dog")
                .setMaxSpeed(60)
                .isFlyable(false)
                .build();

        Animals falcon = builder
                .setName("Falcon")
                .setMaxSpeed(190)
                .isFlyable(true)
                .build();

        Animals snake = builder
                .setName("Snake")
                .setMaxSpeed(78)
                .isFlyable(false)
                .build();

        SpeedController speedController = new SpeedController(eagle, tiger, dog, falcon, snake);
        speedController.removeNonFlyableAnimals();
        String winner = speedController.calculateSpeed();
        System.out.println("Winner is: " + winner);
    }
}
