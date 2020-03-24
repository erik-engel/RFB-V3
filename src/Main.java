public class Main {

    public static void main(String[] args){
        Database database = Database.getInstance();
        Login login = new Login();
        database.setAdmin(new Admin("hej","hej"));
        database.setUser(new User("med", "med"));

        login.run();
    }
}
