
/*
 * Author: Core Inc (Kyle, Helen, Nina)
 * Class: ICS4U
 * Program: instrument class
 * Description: Instrument objects with toString, equals methods, etc
 */
package music.checkinout.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Helen
 */
public class Instrument {

    // initialize all the instance variables for the instrument class
    // and the files it needs to read/write to
    private boolean status; //true is checked out, in is false
    private String name;
    private int number;
    private int studentID;
    private String checkoutDate;
    File instrumentList = new File("instrumentList.txt");
    File tempList = new File("tempEquipmentList.txt");
    
    /**
     * default constructor for instruments
     */
    public Instrument() {
        // initialize all the variables to default values
        status = false;
        name = "";
        number = 0;
        studentID = 0;
        checkoutDate = "N/A";
    }

    /**
     * Instrument constructor
     * @param s - the status to begin with 
     * @param n - the instrument name (eg. flute)
     * @param num - the instrument number/ID
     * @param id - the student ID attached (0 if none)
     * @param cd - the most recent check in/out date
     */
    public Instrument(boolean s, String n, int num, int id, String cd) {
        // initializes all the instance variables to the corresponding parameters passed
        status = s;
        name = n;
        number = num;
        studentID = id;
        checkoutDate = cd;
    }

    /**
     * equals method, that checks if all of the data for one instrument matches another
     * @param other the instrument to compare to
     * @return if they instruments have the same ID
     */
    public boolean equals(Instrument other) {
        return (number == other.getNumber());
    }

    /**
     * toString method that converts an instrument into a string
     * @return the instrument data in a String
     */
    public String toString() {
        return status + "," + name + "," + number + "," + studentID + "," + checkoutDate;
    }

    /**
     * updates info to check out an instrument
     * @param date - the date to check out
     * @param id - the student ID that checked it out
     */
    public void checkout(String date, int id) {
        // updates the status, checkoutDate and student ID
        status = true;
        checkoutDate = date;
        studentID = id;
    }

    /**
     * updates the info to check an instrument back in
     * @param date the date the instrument was checked in
     */
    public void checkin(String date) {
        // sets the corresponding parameters to the variables/resets variables
        status = false;
        checkoutDate = date;
        studentID = 0;
    }

    /**
     * getter method for the checkout status
     * @return true if checked out, false if checked in
     */
    public boolean getStatus() {
        return status;
    }

    /**
     * setter method for the status
     * @param s - the new status
     */
    public void setStatus(boolean s) {
        status = s;
    }

    /**
     * getter method for the name 
     * @return - the current name
     */
    public String getName() {
        return name;
    }

    /**
     * setter method for the name
     * @param n - the new name
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * getter method for the instrument ID/number
     * @return - the current ID
     */
    public int getNumber() {
        return number;
    }

    /**
     * setter method for the instrument ID/number
     * @param num - the new ID
     */
    public void setNumber(int num) {
        number = num;
    }

    /**
     * getter method for the student with the instrument
     * @return the student that has the instrument
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * getter method for the latest check in/out date
     * @return - the latest date 
     */
    public String getDate() {
        return checkoutDate;
    }

    /**
     * setter metho for the check in/out date
     * @param cd - the new date
     */
    public void setDate(String cd) {
        checkoutDate = cd;
    }

    /**
     * setter method for student ID
     * @param studentID - the new student ID
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

}
