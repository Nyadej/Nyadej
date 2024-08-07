/*Write a program that:
Creates an account named "Matthews account" with the balance 1000
Creates an account named "My account" with the balance 0
Withdraws 100.0 from Matthew's account
Deposits 100.0 to "my account"
Prints both the accounts*/
public class Main {
    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthew's account", 1000.0);
        Account myAccount = new Account("My account", 0.0);

        matthewsAccount.withdraw(100.0);
        myAccount.deposit(100.0);

        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}

/* Create a class named Room. Add the variables private String code and private int seats to the class. 
Then create a constructor public Room(String classCode, int numberOfSeats) through which values are assigned to the instance variables.
*/
public class Room {
    private String code;
    private int seats;

    public Room(String classCode, int numberOfSeats){
        this.code = classCode;
        this.seats = numberOfSeats;
    }

/*Create a class named Whistle. Add the variable private String sound to the class. 
After that, create the constructor public Whistle(String whistleSound), which is used to create a new whistle that's given a sound.
Then create the method public void sound() that prints the whistle's sound. */
public class Whistle {
    private String sound; 

    public Whistle(String whistleSound){
        this.sound = whistleSound;
    }

    // Method to print the sound
    public void sound() {
        System.out.println(this.sound);
    }
}

    public static void main(String[] args) {
        // Creating instances of Whistle with different sounds
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        // Calling the sound method on the instances
        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}

/* Create a class named Door. 
The door does not have any variables. 
Create for it a constructor with no parameters (or use the default constructor). 
After that, create a public void knock() method for the door that prints the message "Who's there?" when called.
 */
public class Door {

    // default constructor
    public Door(){
        // no initialisation required
    }

    // method to print the message when the door is knocked
    public void knock() {
        System.out.println("Who's there?");
    }
}
    // main method to test the door class
    public static void main(String[] args) {
        Door alexander = new Door();

        alexander.knock();
        alexander.knock();
    }
}

/*
Create a class Product that represents a store product. 
The product should have a price (double), a quantity (int) and a name (String).

The class should have:

the constructor public Product (String initialName, double initialPrice, int initialQuantity)
a method public void printProduct() that prints product information in the following format:
Sample output - Banana, price 1.1, 13 pcs
 */
public class Product {
    private double price; 
    private int quantity;
    private String name;

    public Product(String initialName, double initialPrice, int initialQuantity){
        this.price = initialPrice; 
        this.quantity = initialQuantity;
        this.name = initialName;
    }

    // method to print the product information
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
}
    // main method to test the product class
    public static void main(String[] args) {
        Product banana = new Product("Banana", 1.1, 13);

        // print the product information 
        banana.printProduct();
    }
}

public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        /*Implement the decrement() in such a way that the counter's value never becomes negative. 
        This means that if the value of the counter is 0, it cannot be decremented. 
        A conditional statement is useful here. */
        if (this.value > 0) {
            this.value = this.value - 1;
        }
    }
}

    public class MainProgram {
        public static void main(String[] args) {
            DecreasingCounter counter = new DecreasingCounter(10);
    
            counter.printValue();
    
            counter.decrement();
            counter.printValue();
    
            counter.decrement();
            counter.printValue();
        }
    }
}

/* Create the class Debt that has double-typed instance variables of balance and interestRate. 
The balance and the interest rate are passed to the constructor as parameters public Debt(double initialBalance, double initialInterestRate).
In addition, create the methods public void printBalance() and public void waitOneYear() for the class. 
The method printBalance prints the current balance, and the waitOneYear method grows the debt amount.
The debt is increased by multiplying the balance by the interest rate.*/

public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println("The current balance is: " + this.balance);
    }

    public void waitOneYear() {
        this.balance *= this.interestRate;
    }
}

    public class MainProgram {
        public static void main(String[] args) {
    
            Debt mortgage = new Debt(120000.0, 1.01);
            mortgage.printBalance();
    
            mortgage.waitOneYear();
            mortgage.printBalance();
    
            int years = 0;
    
            while (years < 20) {
                mortgage.waitOneYear();
                years = years + 1;
            }
    
            mortgage.printBalance();
        }
    }
}

/*
Create a class called Song. 
The song has the instance variables name (string) and length in seconds (integer). 
Both are set in the public Song(String name, int length) constructor. 
Also, add to the object the methods public String name(), which returns the name of the song, and public int length(), which returns the length of the song.
 */

public class Song {
    private String name;
    private int length;

    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
}

    public class MainProgram {
        public static void main(String[] args) {
            Song garden = new Song("In The Garden", 10910);
            System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
        }
    }

/*
Create a film class with the instance variables name (String) and ageRating (int). 
Write the constructor public Film(String filmName, int filmAgeRating) for the class, and also the methods public String name() and public int ageRating(). 
The first of these returns the film title and the second returns its rating.
 */
public class Film {
    private String name;
    private int ageRating;

    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }

    public String name() {
        return this.name;
    }

    public int ageRating() {
        return this.ageRating;
    }
}