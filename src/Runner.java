/**
 * 
 * @author Cole Wendrowski
 * @version 2022.03.10
 *          Runs an event simulation.
 */
public class Runner {
    /**
     * 
     * Main method for running the simulation
     * 
     * @param args
     *            Default parameters
     */
    public static void main(String[] args) {
        Event event = new Event("Party");
        Driver driverOne = new Driver("Bob");
        Driver driverTwo = new Driver("Dan");
        Rider riderOne = new Rider("Emily", "edge", "maple");
        Rider riderTwo = new Rider("Jenna", "the village", "fox ridge");
        Rider riderThree = new Rider("Anna", "retreat", "house");
        event.addDriver(driverOne);
        event.addDriver(driverTwo);
        System.out.println("1 " + event);
        event.addRider(riderOne);
        event.addRider(riderTwo);
        event.addRider(riderThree);
        System.out.println("2 " + event);
    }
}
