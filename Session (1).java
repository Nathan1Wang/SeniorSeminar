//Nathan Wang
//this is the session class, it contains the session constructor and getter method and toString methods. It also has methods that check for details about sessions such as their location on the arraylist and how many times they run. The session object has the master roster of the students in each session 
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

public class Session {
  String sesName; 
  String presenter;
  int sesID;
  int numSes;
  ArrayList<String> roster;  //why is this an arraylist of strings, not STUDENTS???

  public Session(String sesName, String presenter, int sesID, int numSes) {
    this.sesName = sesName;
    this.presenter = presenter;
    this.sesID = sesID;
    this.numSes = numSes;
    roster = new ArrayList<String>();
  }

  public int getID() {
    return sesID;
  }

  public String getSesName() {
    return sesName;
  }

  public String getPresenter() {
    return presenter;
  }

  public int getNumSes() {
    return numSes;
  }

  public void addToRoster(String email) {
    roster.add(email);
  }

  public ArrayList<String> getRoster() {
    return roster;
  }
  //MLT - trying to simplify the spaghetti
  public int getRosterSize() {
    return roster.size();
  }
  
  public String toString() {
    return sesName + " - " + presenter + " and ID " + sesID + " and " + numSes + " votes";
  }

}//close class