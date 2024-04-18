import java.util.ArrayList;
import java.util.List;

class StudentGroup {
    public String studentGroup;
    public List<Student> students;

    public StudentGroup(String nazwa) {
        this.studentGroup = nazwa;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (students.size() >= 15) {
            throw new IllegalStateException("Maksymalna ilosc studentow w grupie: 15");
        }
        if (students.contains(student)) {
            throw new IllegalStateException("Student juz znajduje sie w grupie");
        }
        students.add(student);
    }
}