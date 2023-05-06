import java.util.Scanner;

public class Exo_6 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int num;
        String info;

        do {
            System.out.print("Veuillez saisir un nombre dans l'intervalle de 10 et 20 : ");
            num = sc.nextInt();
            if (num < 10) {
                info = "Saisissez un nombre plus grand";
            } else if (num > 20) {
                info = "Saisissez un nombre plus petit";
            } else {
                info = "Saisie réussie";
            }
            System.out.println(info);
        } while(num < 10 || num > 20);
    }
}
