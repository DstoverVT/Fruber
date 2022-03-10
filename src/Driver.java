import java.util.ArrayList;

/**
 * 
 * @author Cole Wendrowski
 * @version 2022.02.25
 * 
 *          Each dd driver object
 */
public class Driver {
    private ArrayList<Rider> queue;
    private String name;

    /**
     * 
     * Constructor for the driver object
     * 
     * @param name
     *            Name of the driver
     */
    public Driver(String name) {
        queue = new ArrayList<Rider>();
        this.name = name;
    }


    /**
     * 
     * Returns the total wait time for a driver's queue
     * 
     * @return int The total wait time for a driver's queue
     */
    public int getWait() {
        int wait = 0;
        for (int i = 0; i < queue.size(); i++) {
            wait += queue.get(i).getTripTime();
        }
        return wait;
    }


    /**
     * 
     * Add a rider to a driver queue
     * 
     * @param rider
     *            The rider to add to a driver queue
     */
    public void addRider(Rider rider) {
        queue.add(rider);
    }


    /**
     * 
     * Pops the first rider off the queue when they are delivered to their
     * destination by the driver. Triggered by the driver via the application.
     */
    public void completeRide() {
        queue.remove(0); // pops the first rider in the queue
    }


    /**
     * 
     * String representation of the driver object
     */
    public String toString() {
        String hold = "\nDriver: " + name + ": ";
        for (int i = 0; i < queue.size(); i++) {
            hold += queue.get(i).toString() + ", ";
        }
        return hold.substring(0, hold.length() - 2);
    }
}
