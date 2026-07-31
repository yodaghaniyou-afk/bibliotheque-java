public class Main {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", "978-2070408504");

        Membre membreStandard = new Membre("Jean Dupont", "M001");
        MembreVIP membreVip = new MembreVIP("Marie Curie", "M002");

        System.out.println(membreStandard);
        System.out.println(membreVip);

        Emprunt emprunt1 = new Emprunt(livre1, membreVip);
        System.out.println(emprunt1);
    }
}