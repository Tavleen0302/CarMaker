
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CarMaker {

    String carBrand;
    String carColor;
    String carModel;
    double bankAccount;
    int year;
    int maxHP;
    boolean carOn;
    boolean carMoving;
    int weight;
    double elapsed_time;

    public CarMaker(String carBrand, String carColor, String carModel, int year) {
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carModel = carModel;
        this.year = year;
        this.carOn = false;
        this.carMoving = false;
    }

    public CarMaker(String carBrand, String carModel, int year, double bankAccount, int maxHP, int weight) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.year = year;
        this.bankAccount = bankAccount;
        this.maxHP = maxHP;
        this.weight = weight;
        this.carOn = false;
        this.carMoving = false;
    }

    public CarMaker() {
        this.carBrand = "Subaru";
        this.carColor = "black";
        this.carModel = "Wrx sti";
        this.bankAccount = 1500;
        this.year = 2020;
        this.carOn = false;
        this.carMoving = false;
        this.maxHP = 285;
        this.weight = 1500;
        this.elapsed_time = 10.13;
    }

    public void checkMaintenance() {
        if (year < 2000) {
            System.out.println("This car is really old. Maintenance is not available.");
        } else if (year >= 2000 && year <= 2022 && bankAccount >= 1000) {
            System.out.println("This car is fairly new, so maintenance is available! Please check with your company for options available.");
        } else {
            System.out.println("Sorry, you have entered a car that has not been made yet or you don't have the money to get it repaired.");
        }
    }

    public void startCar() {
        if (year >= 2000 && year <= 2022) {
            carOn = true;
            System.out.println(carBrand + " " + carModel + " has started. Vroom Vroom!");
        } else {
            System.out.println("The car is not functional. Get a new car!");
        }
    }
    public void stopCar() {
        if (carOn == true) {
            carMoving = false;
            carOn = false;
            System.out.println("The car has now stopped.");
        } else { 
            System.out.println("The car is still moving, pls bring the car to a stop.");
        }
    }

    public void carForward() {
        if (carOn == true) {
            carMoving = true;
            System.out.println("The car is now moving" );   
        } else if (carOn == false) {
            System.out.println("Sorry, the car has not started yet");
        }
    }

    public void tenSecondCar() {
        elapsed_time = (Math.pow((weight / maxHP),0.333)) *5.825;
        if ((elapsed_time < 11) && (elapsed_time != 0)) {
            System.out.println("Great job in making your car! Your car is a ten second car." + " Elapsed time: " + elapsed_time);
        } else {
            System.out.println("Sorry, but the car you chose to make is not a ten second car. ");
        }
    }

    public void racingFastAndFurious() {
        double domsElapsedTime = 10.2;
        double paulsElapsedTime = 9.8;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the fast and furoius crew tryouts!");
        System.out.println("Please choose whether to race Dom Torreto or Paul Walker");
        System.out.println( "Paul Walker: 1994 Toyota Supra 392hp \nDom Toretto: 1970 Dodge Charger R/T 900hp");
        String user_input = scanner.nextLine();

        if ((user_input.equalsIgnoreCase("paul walker")) || (user_input.equalsIgnoreCase("walker")) || (user_input.equalsIgnoreCase("paul"))) {
            System.out.println("You chose to race Paul Walker!");
            if (elapsed_time > paulsElapsedTime) {
                System.out.println("You win! Your car is faster, now you can join the crew!");
            } else if (elapsed_time <= paulsElapsedTime) {
                System.out.println("Sorry, you didn't beat Paul. Better bring a faster car.");
            } 
        } else if ((user_input.equalsIgnoreCase("dom torreto")) || (user_input.equalsIgnoreCase("toretto")) || (user_input.equalsIgnoreCase("dom"))) {
            if (elapsed_time > domsElapsedTime) {
                System.out.println("You win! Your car is faster, now you can join the crew!");
            } else if (elapsed_time <= domsElapsedTime) {
                System.out.println("Sorry, you didn't beat Dom. Better bring a faster car.");
            }
        }
    }

    public void music(String nameOfSong, String artist) {
        if (carOn == true) {
            System.out.println("Song now playing: " + nameOfSong + " : " + artist);
        } else if (carOn == false) {
            System.out.println("The car is not on. Please start the car to play music.");
        }
    }

    public void description() {
        System.out.println("The car you have selected is " + carColor + carBrand + carModel);
    }

    public void maintenanceNow() throws InterruptedException {
        System.out.println("Hi, you have chose to do you maintenance now. Please choose an option according to your budget");
        System.out.println("Options (pleaser select appropriate number): \n1 - Oil change\n2- Engine repair\n3 - Tire change/repair\n4 - Seasonal checkup  ");
        
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("You have selcted an Oil Change.");
            if (bankAccount <= 0) {
                System.out.println("Bank Account value insufficient. Please come back with more money.");
            } else if (bankAccount >= 100) {
                bankAccount -= 100;
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Oil change complete. Please come back next time.");
            }
        } else if (choice == 2) {
            System.out.println("You have selcted an Engine repair.");
            if (bankAccount <= 0) {
                System.out.println("Bank Account value insufficient. Please come back with more money.");
            } else if (bankAccount >= 1000) {
                bankAccount -= 1000;
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Engine repair complete. Please come back next time.");
            }
        } else if (choice == 3) {
            System.out.println("You have selcted an Tire change/repair.");
            if (bankAccount <= 0) {
                System.out.println("Bank Account value insufficient. Please come back with more money.");
            } else if (bankAccount >= 50) {
                bankAccount -= 50;
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Tire change/repair complete. Please come back next time.");
            }
        } else if (choice == 4) {
            System.out.println("You have selcted an Seasonal checkup.");
            if (bankAccount <= 0) {
                System.out.println("Bank Account value insufficient. Please come back with more money.");
            } else if (bankAccount >= 500) {
                bankAccount -= 500;
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Seasonal checkup complete. Please come back next time.");
            }
        }
        
    }

    public void addFuel(double fuelAmnt) throws InterruptedException {
        if (fuelAmnt == 100) {
            System.out.println("Your gas is already fuel.");
        } else if ( (fuelAmnt >= 0) && !(fuelAmnt > 100) && !(fuelAmnt < 0)) {
            double fuel = 100 - fuelAmnt;
            fuelAmnt += fuel;
            System.out.println("You have chose to add more fuel. Please wait while your gas fills up....");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Your gas is now full!");
        } else {
            System.out.println("Sorry, you have indicated a wrong input. Please try again.");
        }
    }   
}