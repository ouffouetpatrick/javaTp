import java.util.Scanner;
public class Exo_1 {
    public static void main(String[] args) {
        int valeurUne, valeurDeux, valeurTemporaire;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Entrez la valeurUne : ");
        valeurUne = sc.nextInt();

        System.out.printf("Entrez la valeurDeux : ");
        valeurDeux = sc.nextInt();

        valeurTemporaire = valeurUne;
        valeurUne = valeurDeux;
        valeurDeux = valeurTemporaire;

        System.out.println("la valeurUne est " + " " + valeurUne);
        System.out.println("la valeurDeux est " + " " + valeurDeux);
    }
}