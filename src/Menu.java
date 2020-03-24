import java.util.Scanner;
public class Menu {

    Scanner sc = new Scanner(System.in);
    int menu;
    int valg;

    public void adminMenu(){
        System.out.println("Velkommen Sandra");
        System.out.println("1: Børn");
        System.out.println("2: Medarbejdere");
        System.out.println("3: Log ud");
        menu = inputInt(1,3);

        switch (menu){
            case 1:
                System.out.println("1: Indskriv nyt barn");
                System.out.println("2: Se liste over børn");
                valg = inputInt(1,2);
                switch (valg){
                    case 1:
                        break;
                    case 2:
                        break;
                }
                break;
            case 2:
                System.out.println("1: Se liste over medarbejdere");
                System.out.println("2: Opret ny medarbejder");
                System.out.println("3: Vagtplan");
                valg = inputInt(1,3);
                switch (valg){
                    case 1:
                        System.out.println("Hej");
                        break;
                    case 2:
                        System.out.println("Med");
                        break;
                    case 3:
                        System.out.println("Dig");
                        break;
                }
                break;
            case 3:
                Login login = new Login();
                login.run();
        }
    }

    public void employeeMenu(){
        System.out.println("HEJ");
        Login login = new Login();
        login.run();
    }

    private int inputInt(int minValue, int maxValue) {
        int input = -1;
        while (input < minValue || input > maxValue) {
            //System.out.print("Indtast dit valg:\n");
            try {
                input = sc.nextInt();
            } catch (NumberFormatException ex) {
            }
            if (input < minValue || input > maxValue) {
                System.out.println("Ugyldigt input.\nIndtast et tal mellem " + minValue +" og " + maxValue + ".");
            }
        }
        return input;
    }
}
