public interface Employee{

    public void create(String client , Employee emp) throws Exception;
    public void delete(String client , int id) throws Exception;
    public void get(String client , int id) throws Exception;

}