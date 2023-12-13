public class Livre {
    // Variables
    private String titre, auteur;
    private int nbPages;
    // Constructeur
    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }
    // Accesseurs
    public String getTitre() {
        return titre;
    }
    public int getNbPages() {
        return nbPages;
    }
    // Modificateurs
    public void setAuteur(String unAuteur) {
        auteur = unAuteur;
    }
    public void setTitre(String unTitre) {
        titre = unTitre;
    }
    public void setNbPages(int n) {
        if (n > 0) {
            nbPages = n;
        } else {
            System.out.println("Le nombre de pages doit être positif.");
        }
    }
}


Pour indiquer le nombre de pages de chacun des 2 livres, faire afficher ces nombres de pages, calculer le nombre de pages total de ces 2 livres et l'afficher, vous pouvez utiliser le code suivant dans la méthode main() :


public static void main(String[] args) {
    Livre livre1 = new Livre("Auteur1", "Titre1");
    Livre livre2 = new Livre("Auteur2", "Titre2");
    livre1.setNbPages(200);
    livre2.setNbPages(300);
    System.out.println("Le nombre de pages du livre 1 est : " + livre1.getNbPages());
    System.out.println("Le nombre de pages du livre 2 est : " + livre2.getNbPages());
    int nbPagesTotal = livre1.getNbPages() + livre2.getNbPages();
    System.out.println("Le nombre de pages total des deux livres est : " + nbPagesTotal);
}