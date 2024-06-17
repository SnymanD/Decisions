package com.example4;

import javax.swing.*;

public class grading
{
    /**
     * A program to check whether a student passed his or her exam or not.
     */

    public static void main(String[] args)
    {
        int number;
        String input; // To store the number as a string and convert it into an int.

        input = JOptionPane.showInputDialog("Please Enter Your Year Mark: ");
        number = Integer.parseInt(input);

        if (number < 50) // Failed or re-exam
        {
            if (number >= 45)
            {
                JOptionPane.showMessageDialog(null, "You will write a supplementary exam!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You Failed!");
            }
        }
        else // Passed
        {
            if (number >= 75)
            {
                JOptionPane.showMessageDialog(null, "You have passed with a Distinction!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You Passed!");
            }
            System.exit(0);
        }
    }
}
