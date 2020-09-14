// Student data
package oops;
import java.util.Scanner;
public class StudentData
{
 int student_no;
 String first_name;
 String last_name; 
 int age;
 String gender;
 String major;
  public void getInput() {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the student_no: ");
  student_no= in.nextInt();
  System.out.print("Enter the first_name: ");
  first_name = in.next();
  System.out.print("Enter the last_name: ");
  last_name= in.next();
  System.out.print("Enter the age : ");
  age= in.nextInt();
  System.out.print("Enter the gender : ");
  gender= in.next();
  System.out.print("Enter the major : ");
  major= in.next();
 }
 
 public void display()
 {
   System.out.println("student no = " + student_no);
  System.out.println("first name = " + first_name);
  System.out.println("last_name = " + last_name);
  System.out.println("age = " + age);
  System.out.println("gender = " + gender);
  System.out.println("major = " + major);
 }
 
 public static void main(String[] args)
 {
   StudentData e[] = new StudentData[5];
  for(int i=0; i<5; i++)
  {
   e[i] = new StudentData();
   e[i].getInput();
  }
  for(int i=0; i<5; i++) {
    e[i].display();
  }
 }
}
