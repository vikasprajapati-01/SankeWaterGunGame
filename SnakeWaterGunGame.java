
import java.util.*;
import java.util.Random;

public class SnakeWaterGunGame
{
    
    public static int check(char user, char comp)
    {
        if(user=='S' && comp=='W' || user=='W' && comp=='G' || user=='G' && comp=='S')
        {
            return 1;
        }
        else if(user==comp)
        {
            return 2;
        }
        else
        {
            return 0;
        }
    }

    // -------MAin function-------------
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int rnum =rn.nextInt(100)+1;
        char ch, user, comp;
        // Adding loop until player wishes to exit 
        while(true){
        // Taking input from user 
        System.out.println("Enter 'S' for Snake, 'W' for Water or 'G' for Gun and Q for exit");
        ch =sc.next().charAt(0);
        user = Character.toUpperCase(ch);

        // ------check whether input is valid or not---------
        if(user !='Q')
        {
        if(user != 'S' && user != 'W' && user != 'G')
        {
            System.out.println("Invalid input, Please enter 'W','G', or 'S'.");
            continue;
        }
        // ------- Assiging char value to computer------
        if(rnum<=33)
        {
            comp = 'S';
        }
        else if(rnum>33 && rnum<=66)
        {
            comp = 'W';
        }
        else
        {
            comp = 'G';
        }
        // sending the values to the functions
        int result =check(user,comp);
        // ---------Finding and displaying the result-------
        if(result==1)
        {
            System.out.println("Congratulations !!! You have won.");
        }
        else if(result==2)
        {
            System.out.println("Nice try !!! But the match is tie");
        }
        else if(result==0)
        {
            System.out.println("Oops !!! You have lost, Better luck next time.");
        }
        System.out.println("Because you chose " + user + " and the computer chose " + comp);
    }
    else if(user=='Q')
    {
        System.out.println("Thank you for playing the game!");
        break;
    }
    }
        sc.close();
    }
}