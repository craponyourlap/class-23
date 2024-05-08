

/**
 * The Main class is a driver class to demonstrate the usage of the Point class.
 */
public class Main {

    /**
     * The main method creates instances of Point objects and demonstrates
     * various operations such as setting coordinates, calculating distances, and printing.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create two Point objects
        Point point1 = new Point(3, 4);
        Point point2 = new Point(6, 8);

        // Display the initial coordinates of the points
        System.out.println("Initial coordinates:");
        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);

        // Calculate and display the distance between the points
        double distance = point1.distanceTo(point2);
        System.out.println("Distance between Point 1 and Point 2: " + distance);

        // Set new coordinates for Point 1 and display the updated point
        point1.setX(1);
        point1.setY(2);
        System.out.println("\nNew coordinates for Point 1:");
        System.out.println("Point 1: " + point1);
    }
}
