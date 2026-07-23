package idea.project.java.task3;
import java.util.List;
import java.util.ArrayList;
public class StudentListManager {
    public static  void main(String[] args) {
        List<String> students = new ArrayList<>();
        // Add Students
        students.add("Mohammed");
        students.add("Ali");
        students.add("Nawaf");
        students.add("Ishaq");
        students.add("Ikhlas");
        students.add("Fatima");
        students.add("Sara");
        students.add("Abdulaziz");
        students.add("Omar");
        students.add("Majed");
        IO.println(" ");
        // Display All List
        for(String student:students) {
            System.out.println(student);
        }

        IO.println("Total Number Of Students Is: "+students.size());

        IO.println("First Student Name: "+students.get(0));

        IO.println("Last Student Name: "+students.get(students.size()-1));

        // search a name
        String searchStudent ="Nawaf";

        if(students.contains(searchStudent)) {
            System.out.println("Student Name is Found");
        }
        else
        {
            System.out.println("Student Name is not Found");
        }

        students.remove("Omar");
        System.out.println(" The Updated list : ");
        for(String student:students) {
            System.out.println(student);
        }
    }
}