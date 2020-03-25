import java.util.Scanner;

public class Login {

    Database database = Database.getInstance();
    Menu menu = new Menu();
    private boolean loggedIn = false;

    Scanner sc = new Scanner(System.in);
    String user, password;


    public void run(){
        System.out.println("Velkommen til Roskilde Frie Børnehave :D");

        for(int i=3; i>-1; i--) {
            System.out.println("Skriv venligst dit brugernavn: ");
            user = sc.nextLine();
            System.out.println("Skriv venligst dit password: ");
            password = sc.nextLine();

            if (user.equals(database.getAdmin().getUser()) && password.equals(database.getAdmin().getPassword())) {
                loggedIn = true;
                menu.adminMenu();
            }
            else if (user.equals(database.getEmployee().getUser()) && password.equals(database.getEmployee().getPassword())) {
                loggedIn = true;
                menu.employeeMenu();
            }
            else if(i>0)
            System.out.println("Forkert bruger eller password, du har " + i + " forsøg tilbage");
        }
        System.out.println("FOR MANGE FORSØG BRUGT... LUKKER NED...");
        System.exit(0);
        }
    }

