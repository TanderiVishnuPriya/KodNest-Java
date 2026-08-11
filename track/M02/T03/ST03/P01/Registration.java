import java.util.Scanner;

class Student {

    int registrationId;
    String name;
    double attendancePercentage;
}

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create and populate firstStudent
        Student s1 = new Student();

        s1.registrationId = scanner.nextInt();
        s1.name = scanner.next();
        s1.attendancePercentage = scanner.nextDouble();

        // Create and populate secondStudent
        Student s2 = new Student();

        s2.registrationId = scanner.nextInt();
        s2.name = scanner.next();
        s2.attendancePercentage = scanner.nextDouble();

        // Read the selected ID and new attendance
        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        Student selectedStudent = null;

        // Make selectedStudent refer to the matching existing object
        if (selectedId == s1.registrationId) {
            selectedStudent = s1;
        } else if (selectedId == s2.registrationId) {
            selectedStudent = s2;
        }

        // Update when a matching student exists
        if (selectedStudent != null) {

            selectedStudent.attendancePercentage = newAttendance;

            // Display selected student
            System.out.println("Selected Student: " + selectedStudent.name);

            // Display both records
            System.out.println(s1.registrationId + " - "
                    + s1.name + " - "
                    + s1.attendancePercentage + "%");

            System.out.println(s2.registrationId + " - "
                    + s2.name + " - "
                    + s2.attendancePercentage + "%");

        } else {

            System.out.println("Student not found.");
        }

        scanner.close();
    }
}