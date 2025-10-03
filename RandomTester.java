import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    private Random rand;
    private ArrayList<String> list;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
         rand = new Random();
         list = new ArrayList<String>();
    }

    public void printOneRandom(int limit)
    {
        int number = rand.nextInt(limit);
        System.out.println(number);
    }
    
    public void printMultiRandom(int limit, int howMany){
        int i = 0;
        while(i < howMany){
            int number = rand.nextInt(limit);
            System.out.println(number);
            i++;
        }
    }
    
    public int throwDice(){
        int number = rand.nextInt(6);
        if(number==0){
            number++;
        }
        return number;
    }
    
    public void addResponses(String response){
        list.add(response);
    }
    
    public String getResponse(){
        int index = rand.nextInt(3);
        String response = list.get(index);
        return response;
    }
    
    public void randomWithMaxAndMin(int max, int min){
        if(min>max){
            System.out.println("The minimum cannot be greater than the maxiumum");
        }
        else{
            int number = rand.nextInt(max-min+1)+min;
            System.out.println(number);
        }
    }
}
