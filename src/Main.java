public class Main {
    public static void main(String[] args) throws Exception {
        Student[] students = new Student[3];
        students[0] = new Student("Gene Ryan", new double[] { 95, 92, 93 });
        students[1] = new Student("Vincent Ace", new double[] { 97, 96, 96 });
        students[2] = new Student("Asnari", new double[] { 94, 98, 96 });

        printAverage(students);
    }

    static void printAverage(Student[] students) {
        for (Student student : students) {
            System.out.printf("Name:\t\t%s\nAverage:\t%.2f\n\n", student.name, student.calculateAverage());
        }
    }
}
