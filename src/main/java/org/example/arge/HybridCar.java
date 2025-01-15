package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    // Constructor
    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " is starting with hybrid technology: " + cylinders + " cylinders and " + batterySize + " kWh battery.");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " is driving efficiently at " + avgKmPerLitre + " km/l and " + batterySize + " km per charge.");
        super.runEngine();
    }
}
