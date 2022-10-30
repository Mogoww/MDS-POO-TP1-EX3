public class Compte {
    private String proprietaire;
    private int solde;

    // getter
    public String getProprietaire() {
        return proprietaire;
    }
    // setter
    private void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire.toLowerCase();
    }
    // getter
    public int getSolde() {
        return solde;
    }
    // setter
    private void setSolde(int solde) {
        this.solde = solde;
    }

    public Compte(String p, int s) {
        proprietaire = p;
        solde = s;
    }

    // second constructor with proprietaire to params and solde init 0
    public Compte(String p) {
        this.proprietaire = p.substring(0, 1).toUpperCase() + p.substring(1).toLowerCase();
        this.solde = 0;
    }

    public void credit (int amount) {
        solde += amount;
    }

    public void debit(int amount) {
        if (this.solde >= amount) {
            solde -= amount;
        } else {
            System.out.println("Solde insuffisant");
        }
    }

    public String virement(Compte cpt, int amount){
        if (this.solde >= amount) {
            this.solde -= amount;
            cpt.solde += amount;
            return "Virement effectué";
        } else {
            return "Solde insuffisant";
        }
    }



    // function toString
    public String toString() {
        return "Le propriétaire est "+ proprietaire +" avec un solde de "+ solde+" euros";
    }



}
