package fabricio.com.entities.employee;

public class Employee {

    public String name;
    public float totalSalary;
    public float realSalary;
    private final float employeeTaxPercent = 0.2f;

    public Employee(String name, float totalSalary) {
        this.name = name;
        this.totalSalary = totalSalary;
        this.realSalary = RealSalary();
    }

    public float RealSalary() {

        this.realSalary = totalSalary - (totalSalary * employeeTaxPercent);

        return realSalary;
    }

    @Override
    public String toString() {
        return "Employee: \n" +
                " name: " + name +
                "\n total salary: " + totalSalary +
                "\n real salary: " + realSalary;
    }
}
