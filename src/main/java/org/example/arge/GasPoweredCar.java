package org.example.arge;

public class GasPoweredCar extends CarSkeleton{

    private double  avgKmPerLitre;
    private int cylinders;


    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + "engine is starting " + cylinders + " cylinders");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " is driving at " + avgKmPerLitre + " km/l.");
        super.runEngine();
    }
}
