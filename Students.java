public class Students {

    final String collegeName = "School of Information Technology";
    static int totalStrength = 0;
    String name;
    int roll;
    int marks;

    public Students(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    String grade() {
        if (marks >= 90)
            return "A+";
        else if (marks >= 80)
            return "B+";
        else if (marks >= 70)
            return "C+";
        else
            return "Fail";
    }

    public static void main(String[] args) {

        Students s1 = new Students("Riya", 101, 88);
        Students s2 = new Students("Yash", 100, 89);
        Students s3 = new Students("Vinit", 145, 45);

        Students bcaStudents[] = {
                new Students("Ram", 101, 88),
                new Students("Yashita", 102, 77),
                new Students("Prathamesh", 28, 96)
        };

        for (int i = 0; i < bcaStudents.length; i++) {
            System.out.println(
                    bcaStudents[i].name + " " +
                            bcaStudents[i].roll + " " +
                            bcaStudents[i].marks);
        }

        for (Students student : bcaStudents) {
            System.out.println(
                    "Student name: " + student.name +
                            " Roll No: " + student.roll +
                            " Marks: " + student.marks);
        }

        System.out.println(s1.name + " Grade: " + s1.grade());
        System.out.println(s2.name + " Grade: " + s2.grade());
        System.out.println(s3.name + " Grade: " + s3.grade());
    }
}
