public class Livre {
    private String titre;
    private String auteur;
    private String isbn;
    private boolean disponible;

    public Livre(String titre, String auteur, String isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponible = true;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        String statut = disponible ? "Disponible" : "Emprunté";
        return titre + " par " + auteur + " (ISBN: " + isbn + ") - " + statut;
    }
}