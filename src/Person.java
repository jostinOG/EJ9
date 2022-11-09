public class Person {
    private int age;
    private String name;
    private int phone;

    public Person(int age, String name, int phone) {
        this.age = age;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
