
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
        System.out.println("Enter 'S' for Snake, 'W' for Water or 'G' for Gun ");
        ch =sc.next().charAt(0);
        user = Character.toUpperCase(ch);
        // ------check whether input is valid or not---------
        if(user != 'S' && user != 'W' && user != 'G')
        {
            System.out.println("Invalid input, Please enter 'W','G', or 'S'.");
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
        else
        {
            System.out.println("Oops !!! You have lost, Better luck next time.");
        }
        System.out.println("Because you chose " + user + " and the coputer chose " + comp);
        sc.close();
    }
}