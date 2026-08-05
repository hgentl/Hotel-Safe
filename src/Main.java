/**
 * Demonstrates the core functionality of the Hotel Safe project.
 *
 * This class was added after the original coursework to make the
 * project easier to explore outside of the BlueJ environment.
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("--- Hotel Safe Demonstration ---");

        Safe safe = new Safe(5);

        System.out.println("Creating a hotel safe with a capacity of 5 items.\n");

        // Lock the safe with a guest PIN
        System.out.println("Locking the safe with guest PIN: 1234");
        safe.lock("1234");
        System.out.println("Display: " + safe.getDisplay());
        System.out.println();

        // Attempt to unlock using an incorrect PIN
        System.out.println("Attempting to unlock with PIN: 1111");
        safe.open("1111");
        System.out.println("Display: " + safe.getDisplay());
        System.out.println();

        // Unlock using the correct PIN
        System.out.println("Unlocking with PIN: 1234");
        safe.open("1234");
        System.out.println("Display: " + safe.getDisplay());
        System.out.println();

        // Store some items
        System.out.println("Adding items to the safe...");
        safe.addToContents("Passport");
        safe.addToContents("Wallet");
        safe.addToContents("Camera");

        System.out.println("\nCurrent contents:");
        safe.display();

        // Remove an item
        System.out.println("\nRemoving Wallet...");
        safe.removeFromContents("Wallet");

        System.out.println("\nCurrent contents:");
        safe.display();

        // Empty the safe
        System.out.println("\nEmptying the safe...");
        safe.empty();

        System.out.println("\nDemonstration complete.");
    }
}
