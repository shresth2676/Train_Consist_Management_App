import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie Class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add Passenger Bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Sort by Capacity (Ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display Sorted Bogies
        System.out.println("\nBogies Sorted by Capacity (Ascending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Program continues...
    }
}