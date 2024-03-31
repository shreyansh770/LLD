public class ProxyEmployee implements Employee {

    Employee object;

    ProxyEmployee() {
          object = new RealEmployee();
    }

    @Override
    public void create(String client, Employee emp) throws Exception {

        if(client=="ADMIN"){
            object.create(client, emp);
        }else{
            throw new Exception("Access denied");
        }
    }

    @Override
    public void delete(String client, int id) throws Exception {
        if(client=="ADMIN"){
            object.delete(client, id);
        }else{
            throw new Exception("Access denied");
        }
    }

    @Override
    public void get(String client, int id) throws Exception {
        if(client=="USER" || client=="ADMIN"){
            object.get(client, id);
        }else{
            throw new Exception("Access denied");
        }
    }
    
}
