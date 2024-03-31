public class RealEmployee implements Employee {

    @Override
    public void create(String client, Employee emp) {

        System.out.println(client + " created an employee");
    }

    @Override
    public void delete(String client, int id) {
        System.out.println(client + " deleted an employee with id "+id );
    }

    @Override
    public void get(String client, int id) {
        System.out.println(client + " got an employee with id "+id );
    }
    
}
