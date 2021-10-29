// ***************************************************************
// FILE: IntList.java
//
// Purpose: Defines a class that represents a list of integers
//
// ***************************************************************

package com.joshuapardridge.linkedlistofintegers;


public class IntList {
    private IntNode front; //first node in list

    //-----------------------------------------
    // Constructor. Initially list is empty.
    //-----------------------------------------
    public IntList() {
        front = null;
    }

    //-----------------------------------------
    // Adds given integer to front of list.
    //-----------------------------------------
    public void addToFront(int val) {
        front = new IntNode(val, front);
    }

    //-----------------------------------------
    // Adds given integer to end of list.
    //-----------------------------------------
    public void addToEnd(int val) {
        IntNode newnode = new IntNode(val, null);

        //if list is empty, this will be the only node in it
        if (front == null)
            front = newnode;
        else {
            //make temp point to last thing in list
            IntNode temp = front;
            while (temp.next != null)
                temp = temp.next;
            //link new node into list
            temp.next = newnode;
        }
    }

    //-----------------------------------------
    // Removes the first node from the list.
    // If the list is empty, does nothing.
    //-----------------------------------------
    public void removeFirst() {
        if (front != null)
            front = front.next;
    }

    //------------------------------------------------
    // Prints the list elements from first to last.
    //------------------------------------------------
    public void print() {
        System.out.println("--------------------");
        System.out.print("List elements: ");

        IntNode temp = front;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println("\n-----------------------\n");
    }

    //------------------------------------------------
    // Returns the number of elements in the list
    //------------------------------------------------
    public int getLength() {
        int length = 1;
        IntNode temp = front;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }

    //--------------------------------------------------
    // Returns a string with the print value of the list
    //--------------------------------------------------
    @Override
    public String toString() {
        String result = ("Your list: ");
        IntNode temp = front;

        while (temp != null) {
            result += (temp.val);
            if (temp.next != null) result += ", ";
            temp = temp.next;
        }
        return result;
    }

    //--------------------------------------------------
    // Removes the last element of the list
    //--------------------------------------------------
    public void removeLast() {

        //check to see if list is empty
        if (front == null) return;

        //check to see if list has 1 item
        if (front.next == null) {
            front = null;
            return;
        }
        //find next to last item and get rid of last item link
        IntNode temp = front;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        //kill it!
        temp.next = null;
    }

    //--------------------------------------------------------------
    // Replaces occurrences of old values with specified new values
    //--------------------------------------------------------------
    public void replace (int oldVal, int newVal){

        IntNode temp = front;

       //Iterate through the list and replace old values with new values
        while(temp != null){
            if (temp.val == oldVal) temp.val = newVal;
            temp = temp.next;
        }
    }


    //*************************************************************
    // An inner class that represents a node in the integer list.
    // The public variables are accessed by the IntList class.
    //*************************************************************
    private class IntNode {
        public int val; //value stored in node
        public IntNode next; //link to next node in list

        //------------------------------------------------------------------
        // Constructor; sets up the node given a value and IntNode reference
        //------------------------------------------------------------------
        public IntNode(int val, IntNode next) {
            this.val = val;
            this.next = next;
        }

    }
}
