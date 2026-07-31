import java.time.LocalDate;

public class Emprunt {
    private Livre livre;
    private Membre membre;
    private LocalDate dateEmprunt;
    private LocalDate dateRetourPrevue;

    public Emprunt(Livre livre, Membre membre) {
        this.livre = livre;
        this.membre = membre;
        this.dateEmprunt = LocalDate.now();
        this.dateRetourPrevue = dateEmprunt.plusDays(14);
        livre.setDisponible(false);
    }

    public Livre getLivre() {
        return livre;
    }

    public Membre getMembre() {
        return membre;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public LocalDate getDateRetourPrevue() {
        return dateRetourPrevue;
    }

    public void retournerLivre() {
        livre.setDisponible(true);
    }

    @Override
    public String toString() {
        return membre.getNom() + " a emprunté \"" + livre.getTitre() +
               "\" le " + dateEmprunt + " (retour prévu le " + dateRetourPrevue + ")";
    }
}
