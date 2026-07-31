import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Livre> livres;
    private List<Membre> membres;
    private List<Emprunt> emprunts;

    public Bibliotheque() {
        this.livres = new ArrayList<>();
        this.membres = new ArrayList<>();
        this.emprunts = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void ajouterMembre(Membre membre) {
        membres.add(membre);
    }

    public void emprunterLivre(Livre livre, Membre membre) throws LivreNonDisponibleException {
        Emprunt emprunt = new Emprunt(livre, membre);
        emprunts.add(emprunt);
    }

    public void afficherLivres() {
        System.out.println("=== Liste des livres ===");
        for (Livre l : livres) {
            System.out.println(l);
        }
    }

    public void afficherMembres() {
        System.out.println("=== Liste des membres ===");
        for (Membre m : membres) {
            System.out.println(m);
        }
    }

    public void afficherEmprunts() {
        System.out.println("=== Liste des emprunts ===");
        for (Emprunt e : emprunts) {
            System.out.println(e);
        }
    }
}