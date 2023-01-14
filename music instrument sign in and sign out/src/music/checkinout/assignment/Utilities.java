
/*
 * Author: Core Inc (Kyle, Helen, Nina)
 * Class: ICS4U
 * Program: Utility class
 * Description: This class contains some reusable useful methods that can help read file and convert the information and store it into an array, go over an 
 * array and output all the information into a text file, or write at the end of the history records file.
 */
package music.checkinout.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JLabel;

/**
 * 
 * @author Nina
 */
public class Utilities {
    
    /**
     * This is a method that helps read the instruments from a text file and load 
     * them all into an instrument array, reusable.
     * @param j the  label that is responsible for printing error message to the user
     * @return a list containing instrument objects
     */
    public static Instrument[] loadInstrumentFile(JLabel j){
        Instrument instrumentList[] = null;
        try {
            //create new scanner with the instrument list file
            Scanner s = new Scanner(new File("instrumentList.txt"));
            
            int count = 0;
            //count how many lines does the file has
            while(s.hasNextLine()){
                s.nextLine();
                count++;
            }
            
            //initialize the instrument list with length
            instrumentList = new Instrument[count];
            //refresh scanner
            s = new Scanner(new File("instrumentList.txt"));
            
            //convert each line of text into an instrument object and store it in the instrumentList
            for(int i = 0; i < count; i++){
                String[] intrumentInfo = s.nextLine().split(",");
                
                //if after splitting the line by comma there are four items
                if(intrumentInfo.length == 5){
                    //create a new instrument object(status, name, instrument ID, student ID, date)
                    instrumentList[i] = new Instrument(Boolean.parseBoolean(intrumentInfo[0]),intrumentInfo[1],Integer.parseInt(intrumentInfo[2]),Integer.parseInt(intrumentInfo[3]),intrumentInfo[4]);
                }
                //if there are no five items after splitting the line(userinfo file has an invalid line), put an preset intrument object
                else{
                    //if some pre-entered wierd values might be there, create an empty instrument here to prevent later Null Pointer exception or other errors
                    instrumentList[i] = new Instrument(false,"Empty line",0,0,"N/A");
                }
            }
        } catch (FileNotFoundException ex) {
            //if no file, return a list with one empty object to avoid null pointer error
            j.setText("No instrument file detected, but file might be newly created in folder");
            instrumentList = new Instrument[1];
            instrumentList[0] = new Instrument(false,"Empty line",0,0,"N/A");
            return instrumentList;
        }
        
        //If the file is empty, the returned list must also be empty. In that case, null pointer exception might happen if people want to use the returned instrument.
        if(instrumentList == null){
            instrumentList = new Instrument[1];
            instrumentList[0] = new Instrument(false,"Empty line",0,0,"N/A");
            return instrumentList;
        }
        else{
            //if instrument list is not null just return the list that just got from the above code
            return instrumentList;
        }
    }
    
    /**
     * This is a method that helps write all the instruments from the array of instruments into a text file and store it,
     * reusable.
     * @param instrumentList the instrument list
     * @param j The label responsible to printout the error message
     */
    public static void writeInstrumentFile(Instrument[] instrumentList, JLabel j){
        try {
            //create a new print writer
            PrintWriter pw = new PrintWriter(new FileWriter(new File("instrumentList.txt"),false));
            //empty everything out
            pw.print("");
            //renew the printwriter so that from now on it will keep on adding the the file
            pw = new PrintWriter(new FileWriter(new File("instrumentList.txt"),true));
            //add all the instrument information to file
            for(int i = 0;i<instrumentList.length; i++){
                    pw.println(instrumentList[i].toString());
            }
            //close the file
            pw.close();
        } catch (IOException ex) {
            //if any erorr happen, output on scrren in error message
            j.setText("Errors occured in writing the file");
        }
    }
    
    public static void writeToHistory(String record){
        try {
            //create a new print writer
            PrintWriter pw = new PrintWriter(new FileWriter(new File("history.txt"),true));
            //add the new record information to the last line of the file
            pw.println(record);
            //close the file
            pw.close();
        } catch (IOException ex) {
            System.out.println("Exceptions occured with reading and writing over files.");
        }
    }
}
