public class Membre {
    private String nom;
    private String idMembre;
    private int nombreEmpruntsMax;

    public Membre(String nom, String idMembre) {
        this.nom = nom;
        this.idMembre = idMembre;
        this.nombreEmpruntsMax = 3;
    }

    public String getNom() {
        return nom;
    }

    public String getIdMembre() {
        return idMembre;
    }

    public int getNombreEmpruntsMax() {
        return nombreEmpruntsMax;
    }

    @Override
    public String toString() {
        return nom + " (ID: " + idMembre + ") - Max emprunts: " + nombreEmpruntsMax;
    }
}
