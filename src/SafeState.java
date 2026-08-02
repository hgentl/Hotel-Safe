/**
 * Represents safe's state and controls the safe's operations. 
 * 
 * Includes methods used to open the safe and validate a passed string.
 * Also stores and changes the safe's display and whether the safe is open/closed or locked/unlocked.
 * 
 */
public class SafeState
{   

    // a string that stores the current code which will open the safe.
    private String userCode;
    // a string which stores a code the hotel staff can use to open the safe.
    private String masterCode; 
    // a string that represents the display of the safe.
    private String display; 
    // a boolean to record whether the safe is open or closed. Equals true if the safe is open.
    private boolean open;  
    
    /**
    * 
    * Constructor
    * 
    */
    public SafeState()
    { 
        userCode = "null";
        masterCode = "999999";
        display = "WELCOME"; 
        open = true; // The safe is open.
    }
    
    /**
     * 
     * Accesses the display field.
     * 
     * @return display
     */
    public String getDisplay()
    {
        return display;
    }
    
    /**
     * 
     * Accesses the open field.
     * 
     * @return open
     */
    public boolean isOpen()
    {
        return open;
    }
    
    /**
     * 
     *  Checks to see if the safe is open.
     *  
     *  @param aCode, represents a code to try to open the safe with
     *  @return true, if the safe is open or the user enters a vaid code
     */
    public boolean open(String aCode)
    {
        // check if the safe is already open.
        if (open)
        { 
            display = "ALREADY OPEN";
            return true; 
        }
        else
        {         
            // compare the passed String against the userCode and the masterCode.
            if ((aCode.equals(userCode)) || (aCode.equals(masterCode)))
            {
            // safe has been opened successfully.
            open = true;
            display = "OPEN";
            userCode = "null";
            return true; 
            }    
            else
            {
            // the user has given an invalid code. The safe remains closed.
            display = "INVALID CODE";
            return false; 
            } 
        }
    }
    
    /**
     * 
     * Validates a potential user code.
     * 
     * the code must be:
     * A. Equal to 4 characters in length.
     * B. Contains only digits >= 0 and <= 9.
     *
     * @param aCode, represents a code to validate
     * @return true, if aCode is valid
     */
    public boolean isValidUserCode(String aCode)
    {      
        int index = 0; 
 
 
       if (aCode.length() == 4) // check condition A 
        { 
            // check condition B
            while (index != 4) {
                // check each chareter in the input string for a digit
                if ((aCode.charAt(index) >= '0') && (aCode.charAt(index) <= '9'))
                {
                    // the current charecter is valid.
                    index ++; 
                    continue;
                }
                else
                {
                    return false; // condition B not met
            }

            }         
        } else {
            
            return false; // conditon A not met
        }
 
    return true;
    }

   
    /**
     * 
     * Locks the safe.
     * 
     * @param code, represent a code to try
     * @return true, if the safe is locked
     */
    public boolean lock(String code)
    {
        /* 
        if the safe is locked then display field will equal either "LOCKED" or "ALREADY LOCKED". 
        However, if the user has previously locked the safe then attempted to open the safe using an invalid code 
        the display felid will equal "INVALID CODE" instead. To prevent issues arising a condisodional statment
        will check if the display field equals "LOCKED" OR if the display field contains "INVALID CODE" AND the 
        open field equals false 
        */


        if ((display.contains("LOCKED")) || ((display.equals("INVALID CODE") && open == false)))
        { 
            display = "ALREADY LOCKED";
            return true;
        }
        else
        {  
            // the safe is not already locked.
            // check if the code is a valid by calling isValidUserCode(aCode).
            if (isValidUserCode(code) == true) 
            {
                // the code is valid, the safe is now locked.
                open = false; 
                display = "LOCKED"; 
                userCode = code; // the passed sting is now the code used to unlock the safe.
                return true;
            }
            else
            {
                // the passed string has failed the validation check. 
                display = "INVALID CODE"; 
                return false;
            }     
        } 
    }
    
    /**
     * 
     * The method returns Safe followed by the display field.
     * 
     * @return a string representing the safe object
     */
    public String about()
    { 
        String safe = "Safe " + display;
        return safe;      
    }
}

