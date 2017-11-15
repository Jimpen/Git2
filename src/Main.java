import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Boolean correct = true;
        Double number1 = 0.0;
        Scanner reader = new Scanner(System.in);

        System.out.println("Hej och välkommen till världens bästa kalkylator!");
        System.out.println("Vänligen skriv in ditt första tal:");

        do            {
            try {
                String input1 = reader.next();
                number1 = Double.parseDouble(input1);
                correct = true;
            } catch (Exception e) {
                correct = false;
                System.out.println("Du skrev inte ett korrekt tal, vänligen försök igen!");
            }
        }while (!correct);

        System.out.println("Du skrev " + number1);
    }
}
