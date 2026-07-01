public class MVCPatternTest {

    public static void main(String[] args) {

        Student student = new Student(
                "Sathvika",
                "101",
                "A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Sathvika K");
        controller.setStudentGrade("A+");

        System.out.println();

        controller.updateView();

    }

}