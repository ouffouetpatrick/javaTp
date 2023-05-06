import java.util.Scanner;

public class Exo_3 {
    public static void main(String[] arg) {
        double prix_ttc, prix_ht, nb_article, prix_tva;
        double taux_tva, tva;

        Scanner sc = new Scanner(System.in);

        System.out.print("Veuillez saisir le prix hors taxe du produit : ");

        prix_ht = sc.nextInt();

        System.out.print("Veuillez saisir le nombre d\'article achete : ");

        nb_article = sc.nextInt();

        System.out.print("Veuillez saisir le tva applique dans votre pays : ");

        tva = sc.nextInt();

        taux_tva = tva / 100.0;
        prix_tva = taux_tva * (prix_ht * nb_article);
        prix_ttc = (prix_ht * nb_article) + prix_tva;

        System.out.print("Le prix ttc est : " + prix_ttc);

    }
}
