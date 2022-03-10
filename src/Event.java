import java.util.ArrayList;

/**
 * 
 * @author Cole Wendrowski
 * @version 2022.02.25
 *          Distributes the riders to driver objects
 */
public class Event {
    private ArrayList<Driver> drivers;
    private String name;

    /**
     * 
     * Constructor for the event object
     * 
     * @param name
     *            Name of the event
     */
    public Event(String name) {
        drivers = new ArrayList<Driver>();
        this.name = name;
    }


    /**
     * 
     * Add a driver to the event
     * 
     * @param driver
     *            The driver to add to the event
     */
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }


    /**
     * 
     * Add a rider to the shortest driver queue.
     * 
     * @param rider
     *            A rider to add to a driver queue
     */
    public void addRider(Rider rider) { // new rider comes from web app
        Driver driverQuickest = getShortestWait();
        driverQuickest.addRider(rider);
    }


    private Driver getShortestWait() {
        Driver driverQuickest = drivers.get(0);

        for (int i = 0; i < drivers.size(); i++) {
            if (drivers.get(i).getWait() < driverQuickest.getWait()) {
                driverQuickest = drivers.get(i);
            }
        }
        return driverQuickest;
    }


    /**
     * 
     * String representation of the event object
     */
    public String toString() {
        String hold = "\nEvent: " + name + ": { ";
        for (int i = 0; i < drivers.size(); i++) {
            hold += drivers.get(i).toString();
        }
        return hold.substring(0, hold.length()) + " \n}\n";
    }
}
