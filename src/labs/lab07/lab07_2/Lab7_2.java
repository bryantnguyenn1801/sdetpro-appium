package labs.lab07.lab07_2;


public class Lab7_2 {
    public static void main(String[] args) {
        Animal horse = new Animal("Horse", 75);
        Animal tiger = new Animal("Tiger", 100);
        Animal dog = new Animal("Dog", 60);
        SpeedController speedController = new SpeedController(horse, tiger, dog);
        String winner = speedController.calculateSpeed();

        System.out.println("Winner is: " + winner);
    }
}
