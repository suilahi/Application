import java.lang.Class;
import java.util.Scanner;

public class Application {
    static Scanner sc= new Scanner(System.in);

    public  static void main(String[] args) {
        Apprenant apprenant=new Apprenant();
        Formateur formateur=new Formateur();
        int choix;

        do {
            System.out.println("menu principal");
            System.out.println("1-Gestion des Apprenants");
            System.out.println("2-Gestion des Formateurs");
            System.out.println("3-Gestion des Classes");
            System.out.println("4. Quitter");
            System.out.println("entrer votre choix:");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                   apprenant.gestiondesapprenant();
                    break;
                case 2:
                    formateur.gestiondesformateurs();
                    break;
                case 3:
                    break;
                case 4:
                    break;

            }
        }
            while (choix != 4) ;
            System.out.println("choix invalide");
        }
    }
