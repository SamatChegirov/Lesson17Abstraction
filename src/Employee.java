public class Employee extends  Person {
    private int id;

    public Employee(String name, String gender, int id) {
        super(name, gender);
        this.id = id;
    }

    @Override
    public void work() {
        if (id == 1) {
            System.out.println("Жумушчу иштейт.");
        } else {
            System.out.println("Жумушчу иштебейт.");
        }

    }
}
