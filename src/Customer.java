public class Customer extends Person {
    int credit;

    public Customer(int age, String name, int phone, int credit) {
        super(age, name, phone);
        this.credit = credit;
    }

    @Override
    public String toString() {
        return super.toString() + "\tCustomer{" +
                "credit=" + credit +
                '}';
    }
}
