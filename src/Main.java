import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // set compte with 1000
        // Compte compte1 = new Compte("Francois", 1000);
        // System.out.println(compte1.toString());

        // second account
        // Compte compte2 = new Compte("Michel");
        // System.out.println(compte2);

        // verser 500 euros de compte1 vers compte2
        // compte1.virement(compte2, 500);
        // System.out.println(compte1);
        // System.out.println(compte2);

        // create a new bank
        // Banque credit_blesois  = new Banque("crédit blésois");
        // credit_blesois.addCompte(compte1);
        // credit_blesois.addCompte(compte2);

        // search compte1
        // credit_blesois.rechercheCompte("Francois");

        Banque credit_blesois  = new Banque("crédit blésois");

        // while lopp
        while(true){
            System.out.println(" Que voulez-vous faire :");
            System.out.println("1 -> Ajouter un compte");
            System.out.println("2 -> Consulter votre compte");

            // scanner
            Scanner sc = new Scanner(System.in);
            if(!sc.hasNextInt()){
                continue;
            }

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Vous souhaitez ajouter un compte");
                    System.out.println("A quel nom voulez-vous ouvrir votre compte ?");
                    Scanner sc1 = new Scanner(System.in);
                    String nom = sc1.nextLine();
                    Compte compte = new Compte(nom);
                    credit_blesois.addCompte(compte);
                    break;
                case 2:
                    System.out.println("Vous souhaitez consulter un compte");
                    System.out.println("Quel compte voulez vous consulter ?");
                    Scanner sc2 = new Scanner(System.in);
                    String nom2 = sc2.nextLine();
                    if (credit_blesois.rechercheCompte(nom2) == null ) {
                        System.out.println("Erreur, compte inconnue");
                        continue;
                    }

                    System.out.println(credit_blesois.rechercheCompte(nom2));
                    System.out.println("1 -> Créditer");
                    System.out.println("2 -> Débiter");
                    System.out.println("3 -> Virement");
                    System.out.println("4 -> Supprimer le compte");
                    Scanner sc3 = new Scanner(System.in);
                    // if sc4 is not int then repeat the loop
                    if (!sc3.hasNextInt()) {
                        System.out.println("Veuillez saisir un nombre !!!!");
                        continue;
                    }
                    switch (sc3.nextInt()) {
                        case 1:
                            System.out.println("Vous souhaitez créditer votre compte");
                            System.out.println("Quel montant voulez-vous créditer ?");
                            Scanner sc4 = new Scanner(System.in);
                            if (!sc4.hasNextInt()) {
                                System.out.println("Veuillez saisir un nombre !!!!");
                                continue;
                            }
                            int montant = sc4.nextInt();
                            credit_blesois.rechercheCompte(nom2).credit(montant);
                            System.out.println(credit_blesois.rechercheCompte(nom2));
                            break;
                        case 2:
                            System.out.println("Vous souhaitez débiter votre compte");
                            System.out.println("Quel montant voulez-vous débiter ?");
                            Scanner sc5 = new Scanner(System.in);
                            if (!sc5.hasNextInt()) {
                                System.out.println("Veuillez saisir un nombre !!!!");
                                continue;
                            }
                            int montant2 = sc5.nextInt();
                            credit_blesois.rechercheCompte(nom2).debit(montant2);
                            System.out.println(credit_blesois.rechercheCompte(nom2));
                            break;
                        case 3:
                            System.out.println("Vous souhaitez faire un virement");
                            System.out.println("Quel compte voulez-vous créditer ?");
                            Scanner sc7 = new Scanner(System.in);
                            String nom3 = sc7.nextLine();
                            System.out.println("Quel montant voulez-vous créditer ?");
                            Scanner sc8 = new Scanner(System.in);
                            int montant3 = sc8.nextInt();
                            credit_blesois.rechercheCompte(nom2).virement(credit_blesois.rechercheCompte(nom3), montant3);
                            System.out.println(credit_blesois.rechercheCompte(nom2));
                            System.out.println(credit_blesois.rechercheCompte(nom3));
                            break;
                        case 4:
                            System.out.println("Vous souhaitez supprimer votre compte");
                            credit_blesois.deleteCompte(credit_blesois.rechercheCompte(nom2));
                            break;
                        default:
                            break;
                    }
            }
        }
    }
}
