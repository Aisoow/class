
public class ans5 {
    
    public static void main(String[] args)
    {
        int totanimal = 40;
        int totlegs = 100;
        int dogsFound = 0;
        for(int dogs = 0 ; dogs <=totanimal;dogs++)
        {
            int chickens = totanimal - dogs;
            int legs = 2 * chickens + 4 * dogs;
            if (legs == totlegs) {
                dogsFound = dogs;
                break;
            }
        }
        System.out.println(dogsFound);
    }
} 