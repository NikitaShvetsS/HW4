public class Main {


    public static void main(String[] args) {

        Car car = new Car(60,20, 20);
        Calc calc = new Calc();

        car.fillTank();

        double fuelAmountAfterOdessaKriveOzero = car.calcFuelAmountAfterDistance(179);
        System.out.printf("Fuel amount in Krive Ozero is:  %.2f l%n", fuelAmountAfterOdessaKriveOzero);
        double fuelToRefuelKriveOzeroZhashkiv = car.calcFuelToRefuel(153);
        System.out.printf("Fill up your tank: %.2f l%n", fuelToRefuelKriveOzeroZhashkiv);
        double fuelAmountAfterKriveOzeroZhashkiv = car.calcFuelAmountAfterDistance(153);
        System.out.printf("Fuel amount in Zhashkiv is: %.2f l%n", fuelAmountAfterKriveOzeroZhashkiv);
        double fuelToRefuelZhashkivKyiv = car.calcFuelToRefuel(150);
        System.out.printf("Fill up your tank: %.2f l%n", fuelToRefuelZhashkivKyiv);
        double fuelAmountAfterArrival = car.calcFuelAmountAfterDistance(150);
        System.out.printf("Final fuel amount is: %.2f l%n", fuelAmountAfterArrival);

        double totalPrice = calc.calcPrice(20);
        System.out.printf("Total price for fuel is: UAH %.2f %n", totalPrice);

    }



}

//178,5 км одесса кривое озеро
//152,8 км кривое озеро жашков
//149,9 км жашков киев