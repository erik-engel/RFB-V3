public class Database {
    private User user;
    private Admin admin;

    public static final Database instance = new Database();
    public static Database getInstance(){return instance;}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
