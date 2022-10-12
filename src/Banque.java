public class Banque {
    // attributs
    private String libelle;
    private int nbComptes;
    private Compte[] comptes = new Compte[1000];

    // constructeur
    public Banque(String libelle) {
        this.libelle = libelle;
        this.nbComptes = 0;
    }

    // methodes addCompte
    public void addCompte(Compte compte) {
        this.comptes[nbComptes] = compte;
        this.nbComptes++;
    }
    // methodes rechercheCompte
    public Compte rechercheCompte(String proprietaire) {
        // do while loop to search proprietaire in comptes array
        int i = 0;
        do {
            if (this.comptes[i].getProprietaire().equals(proprietaire)) {
                // System.out.println("Le compte de "+ proprietaire +" est "+ this.comptes[i].getSolde());
                return this.comptes[i];
            }
            i++;
        } while (i < this.nbComptes);

        // print null for debug
        // System.out.println("null");
        return null;
    }
}
