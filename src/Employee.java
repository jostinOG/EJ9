public class Employee extends Person {
    private int salary;

    public Employee(int age, String name, int phone, int salary) {
        super(age, name, phone);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}
