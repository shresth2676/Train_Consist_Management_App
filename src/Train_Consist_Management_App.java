import java.util.ArrayList;
import java.util.List;

// Reuse Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Calculate total seating capacity using Stream
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)        // Extract capacity
                .reduce(0, Integer::sum);   // Aggregate (sum)

        // Display result
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

        // Program continues...
    }
}