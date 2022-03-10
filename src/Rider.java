/**
 * 
 * @author Cole Wendrowski
 * @version 2022.02.25
 *          Each rider object
 */
public class Rider {

    private String fromAddress;
    private String toAddress;
    private String name;

    /**
     * 
     * Parameterized constructor for rider object
     * 
     * @param name
     *            Name of the rider
     * @param from
     *            Initial address
     * @param to
     *            Destination address
     */
    public Rider(String name, String from, String to) {
        fromAddress = from;
        toAddress = to;
        this.name = name;
    }


    /**
     * 
     * Returns the trip time for the rider object
     * 
     * @return int The trip time for the rider object
     */
    public int getTripTime() {
        int tripTime = 0;
        tripTime = api(fromAddress, toAddress);
        return tripTime;
    }


    private int api(String from, String to) { // filler for actual api
        return (from + to).length();
    }


    /**
     * 
     * String representation of the rider object
     */
    public String toString() {
        return "(" + name + ")";
    }

}
