import com.example.employees.Designer;
import com.example.employees.Developer;
import com.example.employees.Employee;
import com.example.employees.Manager;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Manager("Tom", 35, 5000),
                new Developer("Nick", 30, 3500),
                new Designer("Lisa", 28, 3000)
        };

        System.out.println("\n-- New working day --");
        for (Employee employee : employees) {
            employee.work();
        }
            System.out.println("*******************************************");
            System.out.println("\n-- Time to have a rest--");

        for (Employee employee : employees) {
            employee.takeBreak();
        }
            System.out.println("*******************************************");


        for (Employee employee : employees) {
            employee.performJob();
            employee.describeRole();
            employee.describeRole(" Web development Department ");
            System.out.println("*******************************************");
        }
    }
}