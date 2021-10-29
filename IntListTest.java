// ***************************************************************
// IntListTest.java
//
// Driver to test IntList methods.
// ***************************************************************

package com.joshuapardridge.linkedlistofintegers;

import java.util.Scanner;

public class IntListTest
{
    private static Scanner scan;
    private static IntList list = new IntList();

    //----------------------------------------------------------------
    // Creates a list, then repeatedly prints the menu and does what
    // the user asks until they quit.
    //----------------------------------------------------------------
    public static void main(String[] args)
    {
        scan = new Scanner(System.in);
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }

    //----------------------------------------
    // Does what the menu item calls for.
    //----------------------------------------
    public static void dispatch(int choice)
    {
        int newVal;
        int oldVal;
        switch(choice)
        {
            case 0:
                System.out.println("Bye!");
                break;

            case 1: //add to front
                System.out.println("Enter integer to add to front");
                newVal = scan.nextInt();
                list.addToFront(newVal);
                break;

            case 2: //add to end
                System.out.println("Enter integer to add to end");
                newVal = scan.nextInt();
                list.addToEnd(newVal);
                break;

            case 3: //remove first element
                list.removeFirst();
                break;

            case 4: //prints length of list
                System.out.println("The length of the list is: " + list.getLength());
                break;

            case 5: //print
                list.print();
                break;

            case 6: //returns list in a string
                System.out.println(list.toString());
                break;

            case 7: //removes last item in list
                list.removeLast();
                break;

            case 8: //replaces all occurrences of value with new value
                System.out.println("Enter value to replace: ");
                oldVal = scan.nextInt();
                System.out.println("Enter value you want to replace it with: ");
                newVal = scan.nextInt();
                list.replace(oldVal, newVal);
                break;

            default:
                System.out.println("Sorry, invalid choice");
        }
    }


    //-----------------------------------------
    // Prints the user's choices
    //-----------------------------------------
    public static void printMenu()
    {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Add an integer to the front of the list");
        System.out.println("2: Add an integer to the end of the list");
        System.out.println("3: Remove an integer from the front of the list");
        System.out.println("4: Print the length of the list");
        System.out.println("5: Print the list");
        System.out.println("6: Print the list in 1 string");
        System.out.println("7: Remove an integer from the back of the list");
        System.out.println("8: Replaces all occurrences of specified value with new value");

        System.out.print("\nEnter your choice: ");
    }
}

