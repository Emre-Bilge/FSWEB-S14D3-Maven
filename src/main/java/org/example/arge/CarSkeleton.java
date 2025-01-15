package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    // Default constructor
    public CarSkeleton() {
        this.name = "Default Car";
        this.description = "Default Description";
    }

    // Parameterized constructor
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName());
    }

    public void drive() {
        System.out.println(getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
