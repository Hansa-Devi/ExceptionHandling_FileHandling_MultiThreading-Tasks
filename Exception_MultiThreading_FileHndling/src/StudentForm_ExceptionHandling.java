import java.util.Scanner;

public class StudentForm_ExceptionHandling {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter FullName:");
        String name = input.nextLine();


        try{
            if (! name.matches("^[a-zA-Z]*$"))throw new Exception("Name should be alphabetic:");
            System.out.println("Enter Roll No:");
            String rollNo = input.nextLine();
            System.out.println("Enter Father Name:");
            String fatherName = input.nextLine();
            System.out.println("Student Name: "+name);
            System.out.println("Student's Roll No: "+rollNo);
            System.out.println("Student's Father Name: "+fatherName);
        }
        catch (Exception e){
            System.out.println("Exception:"+e.getMessage());
        }
        finally {
            System.out.println("******Program Ends*********");
        }






    }
}
