import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();
        Scanner scanner = new Scanner(System.in);

        // Données de départ pour tester
        bibliotheque.ajouterLivre(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", "978-2070408504"));
        bibliotheque.ajouterLivre(new Livre("1984", "George Orwell", "978-2070368228"));
        bibliotheque.ajouterMembre(new Membre("Jean Dupont", "M001"));
        bibliotheque.ajouterMembre(new MembreVIP("Marie Curie", "M002"));

        boolean continuer = true;

        while (continuer) {
            System.out.println("\n=== Bibliothèque ===");
            System.out.println("1. Afficher les livres");
            System.out.println("2. Afficher les membres");
            System.out.println("3. Afficher les emprunts");
            System.out.println("4. Quitter");
            System.out.print("Choix : ");

            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    bibliotheque.afficherLivres();
                    break;
                case "2":
                    bibliotheque.afficherMembres();
                    break;
                case "3":
                    bibliotheque.afficherEmprunts();
                    break;
                case "4":
                    System.out.println("Au revoir !");
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }

        scanner.close();
    }
}