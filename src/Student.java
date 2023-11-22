public class Student {
    String name;
    double[] marks;

    Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
}