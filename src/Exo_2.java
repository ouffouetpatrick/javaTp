import java.util.Scanner;

public class Exo_2 {
    public static void main(String[] arg) {

        int number;
        int carreNumber;

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer un nombre : ");
        number = sc.nextInt();

        carreNumber = number * number;
        System.out.println("Le carré de " + number + " est " +  carreNumber);
    }
}
