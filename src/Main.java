    /*Person деген abstract класс түзүңүз (name, gender) жана
            work() деген abstract методу болсун.
            Employee деген класс түзүп (id), ал Person деген класстан мурасталсын
            Main класстан эки объектисин түзүп, 1чи объектиге id'сине 0,
            2чисине 1 деген айди берип work деген методун иштеткенде.
            0 айди менен - "Жумушчу иштебейт"
            1 айди менен - "Жумушчу иштейт" деп консольго чыксын*/

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Asan", "Kyrgyz", 1);
        System.out.println(employee1);
        employee1.work();
        Employee employee2 = new Employee("Husan", "Uzbek", 0);
        System.out.println(employee2);
        employee2.work();

    }
}