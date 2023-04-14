import java.util.ArrayList;

public class Schedule {

  //method to find the index of a session (this is because the sorted arraylist is out of order so i need to find the index manually)
  public int getIndex(int id, ArrayList<Session> sesList) {
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
  public boolean sesExists(int id, ArrayList<Session> sesList) {
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
  public int getSesIndex2(int id, ArrayList<Session> sesList) {
    int count = 18;
    for (int i = 18; i<24; i++) {
      if (sesList.get(i).getID() == id) {
        count++;
      }
    }
    return count;
  }
  
  public void loadStudents(ArrayList<Student> stuList, ArrayList<Session> sesList) {
    for (Student kid: stuList) {
      for (int i = 0; i<5; i++) {     
        if (sesList.get(getIndex(kid.getStuPref(i), sesList)).getRosterSize() < 16) {
          sesList.get(getIndex(kid.getStuPref(i), sesList)).addToRoster(kid.getEmail());
          kid.addChoice(sesList.get(getIndex(kid.getStuPref(i), sesList)).getSesName()); //add to students choices
        }
  
        else if (sesExists(kid.getStuPref(i), sesList)) { //checking for 2nd run time
          if (sesList.get(getSesIndex2(kid.getStuPref(i), sesList)).getRosterSize() < 16) {
            sesList.get(getSesIndex2(kid.getStuPref(i), sesList)).addToRoster(kid.getEmail());
            kid.addChoice(sesList.get(getIndex(kid.getStuPref(i), sesList)).getSesName());
          }
        }
      
        else {//in case preferences are full, assign next open seminar (not optimal conflict management), however, this allows the kids with zeros to be assigned a random seminar without separate code
          for (Session seminar: sesList) {
            if (seminar.getRosterSize() < 16) {
              seminar.addToRoster(kid.getEmail());
              kid.addChoice(seminar.getSesName());
              break;
            }
          }
        }//close else
      } //close big for
    }//close big for each 
  }//close method

}//close class
  