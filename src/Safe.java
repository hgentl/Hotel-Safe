import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents the guests interactions with the hotels safe.
 * Incudes methods to record and control the content of the safe.
 * 
 * Accesses the SafeState class to perform actions such as opening and locking the safe.
 *
 */
public class Safe
{
    // controls the Safe's state.
    private SafeState state;
    // represents the Safes capasity
    private int maxItems;
    // an array that stores the items stored in the safe.
    private ArrayList <String> contents;
    
    /**
     * 
     * Constructor
     * 
     * @param maxItems, the maximum number of items the safe can hold
     */
    public Safe(int maxItems)
    {
        state = new SafeState(); 
        contents = new ArrayList<String>(); 
        this.maxItems = maxItems; 
    } 
    
    /**
     * 
     * Adds an item to the safe.
     * 
     * @param itemName, represent the items to be added
     */
    public void addToContents(String itemName) 
    {
        // check if there is space in the safe.
        if (contents.size() < maxItems)
        {
            contents.add(itemName);   
        }
    }
    
    /**
     * 
     * Removes an Item from the safe
     * 
     * @param itemName the item to be removed
     */
    public void removeFromContents(String itemName)
    {
        // check the safes for itemName
        if (contents.contains(itemName))
        {   
            contents.remove(itemName); 
            System.out.println("Removed " + itemName);
        }
        else
        {
            System.out.println("Item " + itemName + " not in safe");
        }
    }
    
    /**
     * 
     * Displays the contence of the safe one at a time
     */
    public void display()
    {
        for (String item : contents)
        {
            System.out.println(item);
        }
    }
   
    /**
     * 
     * Removes and outputs all the items in the safe.
     * 
     */
    public void empty()
    {
        /* dont directly modifying the contence of the original collection.
         use Iterator to travers through each element.*/
        Iterator<String> items = contents.iterator();
        
        while (items.hasNext()) {
            String item = items.next();
            items.remove();
            System.out.println("Removed " + item);
        }
 
    }
    
    /**
     * 
     *  Delegates the opening of the safe to safeState
     *  
     *  @param code: a code to try
     *  @return true if open, otherwise false
     */
    public boolean open(String code)
    {   
        return state.open(code);
    }
    
    /**
     * 
     * Deligates closing of the safe to safeState.
     * 
     * @param code a code to try
     * @return true if the safe is closed, othwise false
     */
    public boolean lock(String code)
    {
        return state.lock(code);

    }
}
