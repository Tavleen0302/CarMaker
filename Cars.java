import java.util.ArrayList;
import java.util.Collections;

/**
 * Description Cars
 * 
 * @author Tavleen Aneja
 * @version 1.67.2 April 2020
 */
public class Cars implements Comparable<Cars> {

    /** My instance variables */
    private String carName;
    private double hp;
    private int year;
    private int distanceTravelled = 0;

    /**
     * Creates a new car with car name, its horsepower and year it was made.
     */
    public Cars(String name, int hp, int year) {
        this.carName = name;
        this.hp = hp;
        this.year = year;
    }

    /**
     * This method compares the horsepower of the user.
     * This method also return a number based upon the requirements the user's car
     * meets.
     * 
     * @param horsepower
     * @return int
     */
    public int compareTo(Cars horsepower) {
        if (hp == horsepower.hp) {
            return 0;
        } else if (hp > horsepower.hp) {
            return 1;
        } else {
            return -1;
        }

    }

    /**
     * Returns horsepower of car.
     * 
     * @return double
     */
    public double getHp() {
        return hp;
    }

    /**
     * Returns year car was made.
     * 
     * @return int
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets name of car use has chosen
     * and prints it to the user.
     */

    public void getName() {
        System.out.println(carName);
    }

    /**
     * Makes the car move forward.
     * 
     * @param distance the car wants to travel.
     */
    public void moveForward(int distance) {

        if (distance >= 0) {
            distanceTravelled += distance;
        }
    }

    /**
     * Makes the car move backward.
     * 
     * @param distance the car wants to travel.
     */
    public void moveBackwards(int distance) {

        if (distance <= 0) {
            distanceTravelled -= distance;
        }
    }

    /**
     * Main method which is the beginning of the program.
     * 
     * @param args
     * @exception
     */
    public static void main(String[] args) {
        ArrayList<Cars> test = new ArrayList<Cars>();
        test.add(new Cars("Toyota Supra", 500, 1998));
        test.add(new Cars("Subaru Brz", 325, 2020));
        test.add(new Cars("Toyota Corolla", 100, 2003));

        Collections.sort(test);
        for (Cars str : test) {
            System.out.println(str.carName + " -> horsepower: " + str.hp + " -> year: " + str.year);
        }

    }

}
