package activities;

public class Activity1 {
    public static void main(String[] args){
        Car1 benz = new Car1();
        benz.make = 2014;
        benz.color = "Black";
        benz.transmission="Manual";
        benz.displayCharacteristics();
        benz.accelerate();
        benz.brake();


    }
}

 class Car {

    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car(){
        tyres=4;
        doors=4;
    }
    public void displayCharacteristics(){
        System.out.println("Color of the car: "+ color);
        System.out.println("Make of the Car: " + make);
        System.out.println("Transmission of the Car: " + transmission);
        System.out.println("Number of doors on the car: " + doors);
        System.out.println("Number of tyres on the car: " + tyres);
    }
    public void accelerate(){
        System.out.println("Car is moving forward.");
    }
    public void brake(){
        System.out.println("Car has stopped.");
    }


}
