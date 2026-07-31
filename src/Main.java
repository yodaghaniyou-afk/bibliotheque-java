public class Main {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", "978-2070408504");
        Membre membre1 = new Membre("Jean Dupont", "M001");

        Emprunt emprunt1 = new Emprunt(livre1, membre1);
        System.out.println(emprunt1);
        System.out.println(livre1);

        emprunt1.retournerLivre();
        System.out.println("Après retour : " + livre1);
    }
}