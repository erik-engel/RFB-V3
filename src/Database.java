public class Database {
    private Employee employee;
    private Admin admin;

    public static final Database instance = new Database();
    public static Database getInstance(){return instance;}

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
