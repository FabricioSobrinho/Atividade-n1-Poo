package fabricio.com;

import fabricio.com.entities.employee.Employee;
import fabricio.com.entities.student.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Fabricio", "900.999.999-21", "ADS", 19);
        System.out.println(student);

        Employee employee = new Employee("Fabricio", 1500);
        System.out.println(employee);
    }
}