import java.util.ArrayList;
import java.util.List;

class Student {
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String address;
    public List<Double> grades;
    public Student(String fname, String lname, String indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = new ArrayList<>();
    }
    public void addGrade(double grade) {
        if (grades.size() >= 20) {
            throw new IllegalStateException("Maksymalna ilosc ocen: 20");
        }
        grades.add(grade);
    }
    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Brak dostepnych ocen");
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();
        return roundToValidValues(average);
    }
    private double roundToValidValues(double average) {
        double[] validValues = {2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0};
        double closestValue = validValues[0];
        for (double value : validValues) {
            if (Math.abs(average - value) < Math.abs(average - closestValue)) {
                closestValue = value;
            }
        }
        return closestValue;
    }
}