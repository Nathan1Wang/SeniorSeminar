//Nathan Wang
//this file, main, is meant to take in the csv and store into arraylists. it also contains the majority of the algorithm like the schedule making part, and the sorting (close but not yet functional). To deal with conflicts, I give each student their choice if possible, but if not, assign a random, open session. This is not optimal but is the only way I could figure out how to do it. 
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
  //arraylists for main
  public static ArrayList<Student> stuList = new ArrayList<Student>();
  public static ArrayList<Session> sesList = new ArrayList<Session>();
  public static void main(String[] args) {
    
     try {
      File myObj = new File("SrSeminar_RawData.csv");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] arr = data.split(",");
        int[] intArr = new int[5];
        intArr[0] = Integer.parseInt(arr[1]); //adding data into student arraylist
        intArr[1] = Integer.parseInt(arr[2]);
        intArr[2] = Integer.parseInt(arr[3]);
        intArr[3] = Integer.parseInt(arr[4]);
        intArr[4] = Integer.parseInt(arr[5]);
        Student s1 = new Student(arr[0], intArr);
        stuList.add(s1);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
     }
    //count number of times a session is picked
  int numSes1 = 0;
  int numSes2 = 0;
  int numSes3 = 0;
  int numSes4 = 0;
  int numSes5 = 0;
  int numSes6= 0;
  int numSes7= 0;
  int numSes8= 0;
  int numSes9= 0;
  int numSes10= 0;
  int numSes11= 0;
  int numSes12= 0;
  int numSes13= 0;
  int numSes14= 0;
  int numSes15= 0;
  int numSes16= 0;
  int numSes17= 0;
  int numSes18= 0;
  for (Student kid: stuList) {
    for (int i = 0; i<5; i++) {
      if (kid.getStuPref()[i] == 1) {
        numSes1++;
      }
      if (kid.getStuPref()[i] == 2) {
        numSes2++;
      }
      if (kid.getStuPref()[i] == 3) {
        numSes3++;
      }
      if (kid.getStuPref()[i] == 4) {
        numSes4++;
      }
      if (kid.getStuPref()[i] == 5) {
        numSes5++;
      }
      if (kid.getStuPref()[i] == 6) {
        numSes6++;
      }
       if (kid.getStuPref()[i] == 7) {
        numSes7++;
      }
      if (kid.getStuPref()[i] == 8) {
        numSes8++;
      }
      if (kid.getStuPref()[i] == 9) {
        numSes9++;
      }
      if (kid.getStuPref()[i] == 10) {
        numSes10++;
      }
      if (kid.getStuPref()[i] == 11) {
       numSes11++;
      }
      if (kid.getStuPref()[i] == 12) {
       numSes12++;
      }
      if (kid.getStuPref()[i] == 13) {
        numSes13++;
      }
      if (kid.getStuPref()[i] == 14) {
        numSes14++;
      }
      if (kid.getStuPref()[i] == 15) {
        numSes15++;
      }
      if (kid.getStuPref()[i] == 16) {
        numSes16++;
      }
      if (kid.getStuPref()[i] == 17) {
        numSes17++;
      }
      if (kid.getStuPref()[i] == 18) {
        numSes18++;
      }
    }
  }
  //add sessions to the arraylist (hardcoded but did not want to implement separate file reading and then have to messily add the number of chooses)
  sesList.add(new Session("Adventure Calls: The Benefits and Challenges of Study Abroad (1)", "Gunnar Lykins", 1, numSes1));
  sesList.add(new Session("Be Your Own Boss: Entrepreneurship Opportunities in College and Beyond (1)", "Edwin Sam", 2, numSes2));
  sesList.add(new Session("Business Clubs: Campus Involvement and Professional Development (1)", "Blake Lykins", 3, numSes3));
  sesList.add(new Session("College Decisions: Choosing a Historically Black College over a Predominately White Institution (1)", "Liah Apatira", 4, numSes4));
  sesList.add(new Session("Community Organizing and College: Participating in Your College?s Democracy (1)", "Anna Beyette", 5, numSes5));
  sesList.add(new Session("Community Service and Volunteering: Making an Impact as a College Student (1)", "Nathan Grant", 6, numSes6));
  sesList.add(new Session("Conquering the Concrete Jungle (1)", "Madeleine Morales", 7, numSes7));
  sesList.add(new Session("Co-Ops and Engineering Internships: Gaining Professional Experience (1)", "Gunnar Lykins", 8, numSes8));
  sesList.add(new Session("Emergency Medical Technician: Working in the Back of an Ambulance (1)", "Grace Pettengill", 9, numSes9));
  sesList.add(new Session("Greek Life: From Animal House to Developing Tomorrow's Leaders (1)", "Blake Lykins", 10, numSes10));
  sesList.add(new Session("Making an Impact: Being a Leader in Student Government (1)", "Roshan Chandrakumar", 11, numSes11));
  sesList.add(new Session("On-Campus Recruiting and the Coveted Junior Year Internship in Finance (1)", "Mia Fatuzzo", 12, numSes12));
  sesList.add(new Session("So You Want to Play with Swords: Performance Martial Arts and Club Leadership (1)", "Claire Beyette", 13, numSes13));
  sesList.add(new Session("The Ins and Outs of Engineering Internships (1)", "Elizabeth Grace", 14, numSes14));
  sesList.add(new Session("The Road Less Traveled: Finding the Right Path for You (1)", "Ishan Ghildyal", 15, numSes15));
  sesList.add(new Session("Thriving in a Highly Competitive College Environment (1)", "Mia Fatuzzo", 16, numSes16));
  sesList.add(new Session("To Read or Not To Read? Interning in Publishing (1)", "Claire Beyette", 17, numSes17));
  sesList.add(new Session("What Is Research When It's Not a R‚sum‚ Builder? (1)", "Elizabeth Johnson", 18, numSes18));

  //collection sort to sort the number of times a session is picked (cred to Arjun Gupta for the idea, code written by me and researched by me)
  Collections.sort(sesList, new Comparator<Session>()
  {              
      public int compare(Session s1, Session s2) {
        return Integer.valueOf(s2.numSes).compareTo(s1.numSes);
      }                
  });
  
  //add additional sessions (sessions that are popular and need more than one run)
    for (int i = 0; i < 7; i++) {
    sesList.add(new Session(sesList.get(i).getSesName() + "(2)", sesList.get(i).getPresenter(), sesList.get(i).getID(), sesList.get(i).getNumSes() -16 ));
  }

  //print schedule
  int count = 0;
  for (int i = 0; i < sesList.size(); i++) {
    System.out.print("\t" + sesList.get(i).getID());
    count++;
    if (count%5==0) {
      System.out.print("\n");
    }
  }

  //add students to sessions
  for (Student kid: stuList) {
    for (int i = 0; i<5; i++) {
      if (sesList.get(getIndex(kid.getStuPref()[i])).getRoster().size() < 16) {
        sesList.get(getIndex(kid.getStuPref()[i])).addToRoster(kid.getEmail());
        kid.addChoice(sesList.get(getIndex(kid.getStuPref()[i])).getSesName()); //add to students choices
      }
      else if (sesExists(kid.getStuPref()[i])) { //checking for 2nd run time
        if (sesList.get(getSesIndex2(kid.getStuPref()[i])).getRoster().size() < 16) {
          sesList.get(getSesIndex2(kid.getStuPref()[i])).addToRoster(kid.getEmail());
          kid.addChoice(sesList.get(getIndex(kid.getStuPref()[i])).getSesName());
        }
      }
      else {//in case preferences are full, assign next open seminar (not optimal conflict management), however, this allows the kids with zeros to be assigned a random seminar without separate code
        for (Session seminar: sesList) {
          if (seminar.getRoster().size() < 16) {
            seminar.addToRoster(kid.getEmail());
            kid.addChoice(seminar.getSesName());
            break;
          }
        }
      }//close else
    } //close big for
  }//close big for each
  
  //print both arraylists
  System.out.print(sesList);
  System.out.print(stuList);
  
  }//close main
}//close class