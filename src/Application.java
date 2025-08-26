public class Application {
    public static void main(String[] args) {
        Campsite campsite = new Campsite();

        // Run simulation 5 times using do-while loop
        int iterations = 0;
        do {
            campsite.simulate();
            iterations++;
        } while (iterations < 5);
    }
}