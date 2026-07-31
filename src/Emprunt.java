import java.time.LocalDate;

public class Emprunt {
    private Livre livre;
    private Membre membre;
    private LocalDate dateEmprunt;
    private LocalDate dateRetourPrevue;

    public Emprunt(Livre livre, Membre membre) throws LivreNonDisponibleException {
        if (!livre.estDisponible()) {
            throw new LivreNonDisponibleException("Le livre \"" + livre.getTitre() + "\" n'est pas disponible.");
        }
        this.livre = livre;
        this.membre = membre;
        this.dateEmprunt = LocalDate.now();
        this.dateRetourPrevue = dateEmprunt.plusDays(14);
        livre.emprunter();
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

    public boolean estEnRetard() {
        return LocalDate.now().isAfter(dateRetourPrevue);
    }

    public void retournerLivre() {
        livre.retourner();
    }

    @Override
    public String toString() {
        String retard = estEnRetard() ? " ⚠️ EN RETARD" : "";
        return membre.getNom() + " a emprunté \"" + livre.getTitre() +
               "\" le " + dateEmprunt + " (retour prévu le " + dateRetourPrevue + ")" + retard;
    }
}