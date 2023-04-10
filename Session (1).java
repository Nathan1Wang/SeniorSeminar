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
  ArrayList<String> roster;

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
  public String toString() {
    return sesName + " - " + presenter + " and ID " + sesID + " and " + numSes + " votes";
  }
  
  ArrayList<Session> sesList;

  //method to find the index of a session (this is because the sorted arraylist is out of order so i need to find the index manually)
  public int getIndex(int id) {
    int count = 0;
    for (int i = 0; i<sesList.size(); i++) {
      if (sesList.get(i).getID() == id) {
        break;
      }
      count++;
    }
    return count;
  }
  
  //method to check if another session with the same ID exists (popular sessions will need multiple run times), if 2 times, then the session is run again
  public boolean sesExists(int id) {
    int dupe = 0;
    for (int i = 0; i<sesList.size(); i++) {
      if (sesList.get(i).getID() == id) {
        dupe++;
      }
    }
    if (dupe == 2) {
      return true;
    }
    else {
      return false;
    }
  }

  //method to find the index of the second occurence of a session
  public int getSesIndex2(int id) {
    int count = 18;
    for (int i = 18; i<24; i++) {
      if (sesList.get(i).getID() == id) {
        count++;
      }
    }
    return count;
  }

}//close class