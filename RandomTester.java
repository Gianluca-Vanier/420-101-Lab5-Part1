import java.util.Random;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    private Random rand;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
         rand = new Random();
    }

    public void printOneRandom()
    {
        int number = rand.nextInt(5);
        System.out.println(number);
    }
    
    public void printMultiRandom(int limit, int howMany){
        int number = rand.nextInt(limit);
        int i = 0;
        while(i < howMany){
            System.out.println(number);
        }
    }
}
