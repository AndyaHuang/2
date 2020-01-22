import java.lang.Math;
import java.util.Scanner;
public class Hiclass
{
	//define a method to get a random number
	static int Method(int num) {
	    int random_num = (int)(Math.random() * (num + 1));
	    return random_num;
	  }
    public static void main(String[] args)
    {
        Scanner ScanA = new Scanner(System.in);
        //set difficulty with the first letter user writes
        System.out.println("Easy, Normal, Hard?");
        String user_diff = ScanA.nextLine();
        char difficulty = user_diff.charAt(0);
        //default chances
        int chances = 10;
        if (difficulty == 'E' || difficulty == 'e')
        {
        	chances = 10;
        }
        else if (difficulty == 'N' || difficulty == 'n')
        {
        	chances = 5;
        }
        else if (difficulty == 'H' || difficulty == 'h')
        {
        	chances = 3;
        }
        System.out.println("a random number from 0 to 20");
        int result = Method(21);
        System.out.println("guess a number");
        
        //guessing until out of chances
        while (chances != 0)
        {
        	int guess = ScanA.nextInt();
        	//if guess number is smaller than random number, retry
            if (guess < result)
            {
                System.out.println("too small");
                chances--;
                System.out.println(chances + " times left");
            }
            //if guess number is bigger than random number, retry
            else if (guess > result)
            {
                System.out.println("too big");
                chances--;
                System.out.println(chances + " times left");
            }
            //if guess number is same with random number, print win
            else
            {
                System.out.println("you win");
                break;
            }
            //if user out of chances, print lost
            if (chances == 0)
            {
            	System.out.println("you lost");
            }
        }
    }
}