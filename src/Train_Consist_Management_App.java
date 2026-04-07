import java.util.*;
import java.util.stream.Collectors;

// Reuse Bogie class (slightly improved with type)
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

        // Create list of bogies (with duplicates for grouping)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));

        // Group bogies by name/type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped bogies
        System.out.println("\nGrouped Bogies by Type:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        // Program continues...
    }
}