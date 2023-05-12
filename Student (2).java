//Nathan Wang
//This is the student class, it contains the student constructor and methods like getter and toString. The student object also has a choices arraylist which displays what each student is enrolled in. 
import java.util.ArrayList;

public class Student {
  String email;
  int stuPref[] = new int[5];
  ArrayList<String> choices;

  public Student(String email, int stuPref[]) {
    this.email = email;
    this.stuPref = stuPref;
    choices = new ArrayList<String>();
  }

  public String getEmail() {
    return email;
  }

  /*  MLT Modding this autogen getter method to return their choice at the preference index
  public int[] getStuPref() {
    return stuPref;
  }
  */
    public int getStuPref(int choice) {
    return stuPref[choice];
  }

  public void addChoice(String choice) {
    choices.add(choice);
  }

  public String toString() {
    return email + ", " + stuPref[0] + ", " + stuPref[1] + ", " + stuPref[2] + ", " + stuPref[3] + ", " + stuPref[4] + "." + "and is attending " + choices;
  }
}