import java.util.ArrayList;
import java.util.List;

public class Race {
    private String name;
    private int distance;
    private int maxParticipants;
    private int currentParticipants;
    private List<Car> cars;
    private List<Manufacturer> manufacturers;

    public Race(String name, int distance, int maxParticipants) {
        this.name = name;
        this.distance = distance;
        this.maxParticipants = maxParticipants;
        this.currentParticipants = 0;
        this.cars = new ArrayList<>();
        this.manufacturers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public int getCurrentParticipants() {
        return currentParticipants;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void addCar(Car car) {
        if (currentParticipants < maxParticipants) {
            cars.add(car);
            currentParticipants++;
        }
    }

    public void addManufacturer(Manufacturer manufacturer) {
        manufacturers.add(manufacturer);
    }
}