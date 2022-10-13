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

            if (!sc.hasNextInt()) {
                continue;
            }else {
                int choix = sc.nextInt();
                switch (choix) {
                    case 1:
                        System.out.println("Vous souhaitez ajouter un compte");
                        System.out.println("A quel nom voulez-vous ouvrir votre compte ?");
                        Scanner sc2 = new Scanner(System.in);
                        String nom = sc2.nextLine();
                        Compte compte = new Compte(nom);
                        credit_blesois.addCompte(compte);
                        break;
                        case 2:
                            System.out.println("Vous souhaitez consulter un compte");
                            System.out.println("Quel compte voulez vous consulter ?");
                            Scanner sc3 = new Scanner(System.in);
                            String nom2 = sc3.nextLine();
                            if (credit_blesois.rechercheCompte(nom2) != null) {
                                System.out.println(credit_blesois.rechercheCompte(nom2));
                            } else {
                                System.out.println("Le compte n'existe pas");
                            }
                            break;
                            default:
                                System.out.println("Choix invalide");
                                break;
                }
            }

        }


    }
}