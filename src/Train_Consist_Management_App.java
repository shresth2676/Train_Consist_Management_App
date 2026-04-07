import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Reuse Bogie class from UC7
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

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies (same as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Filter bogies with capacity > 60 using Stream
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }

        // Show original list (to prove it is unchanged)
        System.out.println("\nOriginal Bogie List (Unchanged):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Program continues...
    }
}