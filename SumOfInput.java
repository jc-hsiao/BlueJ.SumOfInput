/**
 * The program will respond by returning the sum of numbers 1 to n. 
 * (That is, if a user inputs 2, the method should return 3. 1 + 2.)
 *
 * @author Leila Hsiao
 * @version 2/5/2020
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private Integer sum;

    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        sum = 0;
    }

    
    public Integer oneToNumber(Integer numberToSum){
        //Constraint: No Guassian wizardr!!!!!!!!!!!!!!!!!!!!!!!!!!
        
        //this loop will run by numberToSum times
        //and add all of them to s
        int s = 0;
        for(int i=1; i<=numberToSum ; i++){
            s += i;                        
        }        
        
        return s;
    }

}
