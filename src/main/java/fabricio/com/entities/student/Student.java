package fabricio.com.entities.student;

public class Student {

    private String name;
    private String cpf;
    private String course;
    private int age;

    public Student(String name, String cpf, String course, int age) {
        this.name = name;
        this.cpf = cpf;
        this.course = course;
        this.age = age;
    }

    @Override
    public String toString() {
        return " Student: " + name + "\n CPF: " + cpf + "\n Course: " + course + "\n Age: " + age;
    }
}
