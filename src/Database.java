public class Database {
    private Teacher teacher;
    private Admin admin;

    public static final Database instance = new Database();
    public static Database getInstance(){return instance;}

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
