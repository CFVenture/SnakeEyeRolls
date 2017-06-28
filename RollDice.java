/**
 *
 * @author JackC
 */
public class RollDice {

    private int die1;   // Define first die
    private int die2;   // Define second die

    public RollDice() {
        // Constructor.  Rolls the dice, so that they initially
        // show some random values.
        roll();  // Call the roll() method to roll the dice.
    }

    public void roll() {
        // Roll the dice by setting each of the dice to be
        // a random number between 1 and 6.
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
    }

    public int getDie1() {
        // Return the number showing on the first die.
        return die1;
    }

    public int getDie2() {
        // Return the number showing on the second die.
        return die2;
    }

    public int getTotal() {
        // Return the total showing on the two dice.
        return die1 + die2;
    }

    public static void main(String[] args) {
        RollDice dice;    // A variable that will refer to the dice.
        int rollCount;    // Number of times the dice have been rolled.
        int SECount;      // Declare Snake Eye Count
        dice = new RollDice();  // Create the RollDice object.
        rollCount = 0;    // Set rollCount to 0

        /* Roll the dice until they come up snake eyes. */
        do {
            dice.roll(); // Call roll method
            System.out.println("Dice rolls " + dice.getDie1()
                    + " and " + dice.getDie2());
            rollCount++; // Increment rollCount
        } while (dice.getTotal() != 2); // Stop do-while when sum not equal 2

        // Report the number of rolls.
        System.out.println("\nIt took " + rollCount + " rolls to get a Snake Eye.");
        System.out.println("\nChallenge Assignment. \nResetting Count. \nBeep. \nBop. \nBeep. \nLets ROLL!!! ^.^");
        rollCount = 0; // Reset count to 0 for challenge assignment
        SECount = 0;
        int sum = 0; // Set SECount to 0
        do {
            dice.roll();
            System.out.println("\nThe dice rolls " + dice.getDie1()
                    + " and " + dice.getDie2());
            rollCount++;
            if (dice.getDie1() == 1 && dice.getDie2() == 1) {
                SECount++;
                sum += rollCount;
            }
            System.out.println("\nThere has been " + SECount + " Snake Eye rolls");
            System.out.println("Sum of rolls it took to next Snake Eye: " + sum); // Print the sum of roll counts that were SE rolls
            System.out.println("Number of dice rolls occured: " + rollCount); // Print roll Count
        } while (rollCount < 1000);

        //Error handling in case there are no Snake eye rolls
        if (SECount == 0) {
            System.out.println("There has been no Snake Eye Rolls!"); // If SECount equals 0 print this.
        } else {
            double avg = sum / SECount; // Calculate average
            System.out.println("\nThe average number of rolls required to get snake eyes is " + avg); // Print result.
        }

    }

}
