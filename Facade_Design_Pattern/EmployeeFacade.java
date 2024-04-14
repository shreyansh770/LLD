public class EmployeeFacade {

    EmployeeDAO employeeDAO;

    EmployeeFacade() {
        employeeDAO = new EmployeeDAO();
    }

    // client just need to interact with get and insert

    public void insert(){
        employeeDAO.insert();
    }

    public void EmployeeDetails(int id){
        employeeDAO.getEmployeesDetails(id);
    }
    
}
