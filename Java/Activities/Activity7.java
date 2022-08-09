package activities;

interface BicycleParts{
public int gears=0;
public int speed=0;
}
interface BicycleOperations{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}
class Bicycle implements BicycleParts,BicycleOperations {
    public int gears;
    public int speed;

    public Bicycle(int gears, int speed) {
        this.gears = gears;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed = speed - decrement;
        System.out.println(" Current speed: " + speed);    }

    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println(" Current speed: " + speed);
    }

    public String bicycleDesc() {
        return ("No of gears" + gears + "current speed" + speed);
    }
}
    class MountainBike extends Bicycle {
        public int seatHeight;

        public MountainBike(int gears, int speed, int height) {
            super(gears, speed);
            this.seatHeight = height;
        }

        public void setHeight(int newValue) {
            seatHeight = newValue;
        }

        public String bicycleDesc() {
            return (super.bicycleDesc()+ " Seat Height is " + seatHeight);
        }

    }
    class Activity7{
    public static void main(String[] args){
        MountainBike mb = new MountainBike(3,0,5);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(30);
        mb.applyBrake(10);
    }
    }


