/*
    VERY IMPORTANT TO REMEMBER
    For checking if the strings are the same e.g. name1 = name2 without user input we use (name1 == name2)
    But if name1 and name2 are user inputs then we use (name1.equals(name2))
    Or we can use compareTo like (name1.compareTo(name2) == 0) or > 0 or < 0
 */

package com.example4;

import javax.swing.*;

public class comparingStrings
{
    public static void main(String[] args)
    {
        String name1;
        String name2;

        name1 = JOptionPane.showInputDialog("Enter the first name: ");
        name2 = JOptionPane.showInputDialog("Enter the second name: ");

        if (name1.equals(name2))
        {
            JOptionPane.showMessageDialog(null, "The names are the same!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The names are not the same!");
        }
        System.exit(0);
    }
}
