package com.example4;

import javax.swing.*;

public class if_else_statements
{
    public static void main(String[] args)
    {
        int number;

        String input; // For storing an entered string value to be converted to an int.

        input = JOptionPane.showInputDialog("Please Enter A Number: ");
        number = Integer.parseInt(input);

        if (number == 5)
        {
            JOptionPane.showMessageDialog(null, "The number you entered is exactly 5!");
        }
        else if (number > 10)
        {
            JOptionPane.showMessageDialog(null, "The number you entered is greater than 10!");
        }
        else if (number > 5)
        {
            JOptionPane.showMessageDialog(null, "The number you entered is greater than 5!");
        }
        else {
            JOptionPane.showMessageDialog(null, "The number you entered is less than 5!");
        }
        System.exit(0); // To exit faster when using JOptionPane or imported swing.*
    }
}
