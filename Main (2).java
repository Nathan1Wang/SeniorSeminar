import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

public class Main {
  public static ArrayList<Student> stuList = new ArrayList<Student>();
  public static void main(String[] args) {
     try {
      File myObj = new File("SrSeminar_RawData.csv");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] arr = data.split(",");
        int[] intArr = new int[5];
        intArr[0] = Integer.parseInt(arr[1]);
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
    System.out.println(stuList);
    
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

  
  }
}