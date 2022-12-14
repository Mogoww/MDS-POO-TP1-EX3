import java.util.Arrays;

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
    // methode deleteCompte
    public void deleteCompte(Compte compte) {
      for (int i = 0; i < this.nbComptes; i++) {
        if (this.comptes[i] == compte) {
          this.comptes[i] = this.comptes[this.nbComptes - 1];
          this.nbComptes--;
          break;
        }
      }
    }
    // methodes rechercheCompte
    public Compte rechercheCompte(String proprietaire) {
        proprietaire = proprietaire.substring(0, 1).toUpperCase() + proprietaire.substring(1).toLowerCase();

        int i = 0;
        while (i < this.nbComptes) {
            if (this.comptes[i].getProprietaire().equals(proprietaire)) {
                return this.comptes[i];
            }
            i++;
        }
        return null;
    }
}
