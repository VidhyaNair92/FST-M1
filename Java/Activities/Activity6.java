package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = 0;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger) {
        passengers.add(passenger);
    }

    public Date takeOff() {
        return lastTimeTookOf = new Date();
    }
    public void land(){
        lastTimeLanded = new Date();
        passengers.clear();
    }
    public Date getLastTimeLanded(){
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}

class Activity6{
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onboard("Jithin");
        plane.onboard("Vidhya");
        plane.onboard("Dhruv");
        System.out.println("Take off time:"+ plane.takeOff());
        System.out.println("List of passengers:"+ plane.getPassengers());
        Thread.sleep(5000);
        plane.land();;
        System.out.println("Time of landing:"+ plane.getLastTimeLanded());
        System.out.println("Passengers on plane after landing:"+ plane.getPassengers());

    }



    }

