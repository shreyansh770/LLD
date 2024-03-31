public class Main {

    public static void main(String[] args) {

        try {
            Employee emp = new ProxyEmployee();

            emp.create("ADMIN", new RealEmployee());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
