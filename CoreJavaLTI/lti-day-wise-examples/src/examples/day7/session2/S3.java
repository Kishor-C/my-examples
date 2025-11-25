package examples.day7.session2;

import java.util.*;

class Student {
    private String studentName;
    private LinkedHashMap<String, Integer> subjects;
    public Student(String studentName) {
        this.studentName = studentName;
        this.subjects = new LinkedHashMap<>();
    }
    public void addSubject(String subject, int grade) {
        subjects.put(subject, grade);
    }
    public void updateSubject(String subject, int grade) {
           subjects.put(subject, grade); 
    }
    public String getStudentName() {
        return studentName;
    }

    public LinkedHashMap<String, Integer> getSubjects() {
        return subjects;
    }
}

public class S3 {
    private static LinkedHashMap<String, Student> studentGrades = new LinkedHashMap<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student st=null;
        while (input.hasNextLine()) {
            String action = input.nextLine();
            if (action.isEmpty()) {
                break; // Stop input if a blank line is provided
            }
            String[] inputParts = action.split("\\s+");
            if (inputParts.length < 4) {
                System.out.println("Invalid input. Please enter 'action student_name subject_name [grade]'.");
                continue;
            }
            String command = inputParts[0].toLowerCase();
            String student = inputParts[1];
            String subject = inputParts[2];
            try{
            int grade = (inputParts.length == 4) ? Integer.parseInt(inputParts[3]) : -1; // Default -1 for removal
            if(grade>100){
            System.out.println("Grade should be between 0 and 100.");
            continue;
            }
            switch (command) {
                case "add":
                    if(studentGrades.containsKey(student)){
                        studentGrades.get(student).addSubject(subject,grade);
                        System.out.println("Added: "+student+" in "+subject+" with grade "+grade);
                    }else{
                    st=new Student(student);
                    st.addSubject(subject,grade);
                    studentGrades.put(student,st);
                    System.out.println("Added: "+student+" in "+subject+" with grade "+grade);
                    }
                    break;
                case "update":
                    if(studentGrades.containsKey(student)){
                    st=studentGrades.get(student);
                    if(st.getSubjects().containsKey(subject)){
                    st.updateSubject(subject, grade);
                    System.out.println("Updated: "+student+" in "+subject+" with grade "+grade);
                    }
                    else
                    System.out.println("Subject "+subject+" not found for student "+student+".");
                    }
                    break;
                default:
                    System.out.println("Invalid command. Use 'add', 'update', or 'remove'.");
            }
            }catch(Exception e){
                System.out.println("Invalid grade. Please enter an integer between 0 and 100.");
                continue;
            }
        }
        input.close();
}
}

