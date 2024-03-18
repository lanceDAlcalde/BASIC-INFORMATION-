public class MyProfile {

 String firstName;
 String lastName;
 char middleInitial;
 char gender;
 String birthDate;
 int age;
 String address;
 String email;
 String contactNumber;
 boolean driver;

 public MyProfile(String fName, char MI, String lName, char male, String date, int years, String location, String gmailAccount,String no, boolean allowedToDrive) {

     firstName = fName;
     lastName = lName;
     middleInitial = MI;
     gender = male;
     birthDate = date;
     age = years;
     address = location;
     email = gmailAccount;
     contactNumber = no;
     driver = allowedToDrive;
 }
  public static void main(String[] args) {

      MyProfile me = new MyProfile ("Lance Kerwin", 'D', "Alcalde", 'M', "October", 18, "Caloocan City", "lancekerwinalcalde@gmail.com", "09060188724", true);
      System.out.println("Name: " + me.firstName + " " + me.middleInitial + "." + " " + me.lastName);
      System.out.println("Age: " + me.age);
      System.out.println("Gender: " + me.gender);
      System.out.println("Birthdate: " + me.birthDate + " 16, 2005");
      System.out.println("Address: " + me.address);
      System.out.println("Email: " + me.email);
      System.out.println("Contact Number: " + me.contactNumber);
      System.out.println("Am i allowed to drive? "+ me.driver);

  }
}