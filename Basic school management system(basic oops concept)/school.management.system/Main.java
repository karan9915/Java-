import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vandarhorn = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vandarhorn);

        Student tamara = new Student(1, "Tamara",4);
        Student charloitte = new Student(2,"Charloitte",12);
        Student rabbi = new Student(3,"Rabbi",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamara);
        studentList.add(charloitte);
        studentList.add(rabbi);

        School ghs = new School(teacherList, studentList);

        tamara.payFees(5000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        charloitte.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("<--------MAKING SCHOOL PAY SALARY--------->");

        lizzy.recieveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName() + " and now has $" + ghs.getTotalMoneyEarned());

        vandarhorn.recieveSalary((vandarhorn.getSalary()));
        System.out.println("GHS has spent for salary to " + vandarhorn.getName() + " and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(tamara);
        System.out.println(lizzy);
    }
}
