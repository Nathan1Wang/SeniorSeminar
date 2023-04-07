import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

public class Session {
  String sesName; 
  String presenter;
  int sesID;
  int numSes;

  public Session(String sesName, String presenter, int sesID, int numSes) {
    this.sesName = sesName;
    this.presenter = presenter;
    this.sesID = sesID;
    this.numSes = numSes;
  }

  public int getID() {
    return sesID;
  }

  public String toString() {
    return sesName + " - " + presenter + " and ID " + sesID + " and " + numSes + " votes";
  }

}