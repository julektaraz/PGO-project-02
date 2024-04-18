public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski", "12345", "jan@xyz.com", "Aleja Roz 3");

        student1.addGrade(4.0);
        student1.addGrade(3.5);
        student1.addGrade(4.5);

        double averageGrade = student1.calculateAverageGrade();
        System.out.println("Srednia ocen dla: " + student1.fname + " " + student1.lname + ": " + averageGrade);

        StudentGroup group1 = new StudentGroup("Group A");

        group1.addStudent(student1);

        try {
            group1.addStudent(student1);
        } catch (IllegalStateException e) {
            System.out.println("Blad: " + e.getMessage());
        }

        Student student2 = new Student("Joanna", "Kowalska", "54321", "joanna@xyz.com", "Prosta 33");
        student2.addGrade(3.0);
        student2.addGrade(3.5);

        group1.addStudent(student2);

        System.out.println("Students in " + group1.studentGroup + ":");
        for (Student student : group1.students) {
            System.out.println(student.fname + " " + student.lname);
        }
    }
}
