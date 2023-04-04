public class Student {
  String email;
  int stuPref[] = new int[5];

  public Student(String email, int stuPref[]) {
    this.email = email;
    this.stuPref = stuPref;
  }

  public String getEmail() {
    return email;
  }

  public int[] getStuPref() {
    return stuPref;
  }

  public String toString() {
    return email + ", " + stuPref;
  }
}