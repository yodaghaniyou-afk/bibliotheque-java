public class MembreVIP extends Membre {
    private static final int EMPRUNTS_MAX_VIP = 10;
    private double reduction;

    public MembreVIP(String nom, String idMembre) {
        super(nom, idMembre);
        this.reduction = 0.20;
    }

    @Override
    public int getNombreEmpruntsMax() {
        return EMPRUNTS_MAX_VIP;
    }

    public double getReduction() {
        return reduction;
    }

    @Override
    public String toString() {
        return "[VIP] " + getNom() + " (ID: " + getIdMembre() + ") - Max emprunts: " +
               getNombreEmpruntsMax() + " - Réduction: " + (int)(reduction * 100) + "%";
    }
}