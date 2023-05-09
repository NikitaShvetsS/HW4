public class Car {
    private double tankVolume;
    private double fuelAmount;
    private double consumptionPer100km;

    public Car(double tankVolume, double fuelAmount, double consumptionPer100km) {
        this.tankVolume = tankVolume;
        this.fuelAmount = fuelAmount;
        this.consumptionPer100km = consumptionPer100km;
    }

    public double fillTank(){
        return tankVolume - fuelAmount;
    }

    public double calcFuelAmountAfterDistance(double distance) {
        double consumption = consumptionPer100km / 100 * distance;
        return consumption;
    }

    public double calcFuelToRefuel(double distance) {
        double consumption = consumptionPer100km / 100 * distance;
        return consumption - fuelAmount;
    }

}
