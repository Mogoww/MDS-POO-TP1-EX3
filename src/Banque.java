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
        for(Compte compte : this.comptes) {
            if (compte.getProprietaire().equals(proprietaire)) {
                return compte;
            }
        }
        return null;
    }
}
