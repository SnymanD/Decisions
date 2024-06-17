package com.example4;

public class Loops
{
    public static void main(String[] args)
    {
        // Three loops in Java
        // While loop, do-while loop and for loop

        int x = 0;

        while (x < 5) // pre-test loop (while loop)
        {
            System.out.println("Hello Snyman!");
            x++;
        }

        System.out.println(" ");

        int y = 0;

        do // test after (do-while loop)
        {
            System.out.println("Hello Felix!");
            y++;
        }
        while(y < 5);

        System.out.println(" ");

        for (int z = 0; z < 5; z++) // for loop
        {
            System.out.println("Hello Happiness!");
        }
    }
}
