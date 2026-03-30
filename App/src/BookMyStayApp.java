import java.util.*;

class Room {
    int beds;
    int size;
    double price;

    Room(int beds, int size, double price) {
        this.beds = beds;
        this.size = size;
        this.price = price;
    }
}

class RoomInventory {
    private Map<String, Integer> availability = new HashMap<>();

    RoomInventory() {
        availability.put("Single", 5);
        availability.put("Double", 3);
        availability.put("Suite", 2);
    }

    public Map<String, Integer> getRoomAvailability() {
        return availability;
    }
}

class RoomSearchService {
    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Room Search\n");

        if (availability.get("Single") > 0) {
            System.out.println("Single Room:");
            System.out.println("Beds: " + singleRoom.beds);
            System.out.println("Size: " + singleRoom.size + " sqft");
            System.out.println("Price per night: " + singleRoom.price);
            System.out.println("Available: " + availability.get("Single") + "\n");
        }

        if (availability.get("Double") > 0) {
            System.out.println("Double Room:");
            System.out.println("Beds: " + doubleRoom.beds);
            System.out.println("Size: " + doubleRoom.size + " sqft");
            System.out.println("Price per night: " + doubleRoom.price);
            System.out.println("Available: " + availability.get("Double") + "\n");
        }

        if (availability.get("Suite") > 0) {
            System.out.println("Suite Room:");
            System.out.println("Beds: " + suiteRoom.beds);
            System.out.println("Size: " + suiteRoom.size + " sqft");
            System.out.println("Price per night: " + suiteRoom.price);
            System.out.println("Available: " + availability.get("Suite"));
        }
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {

        Room single = new Room(1, 250, 1500.0);
        Room doubleRoom = new Room(2, 400, 2500.0);
        Room suite = new Room(3, 750, 5000.0);

        RoomInventory inventory = new RoomInventory();

        RoomSearchService service = new RoomSearchService();
        service.searchAvailableRooms(inventory, single, doubleRoom, suite);
    }
}