import java.lang.Class;
import java.util.Scanner;

public class Application {
    Scanner sc= new Scanner(System.in);
    Apprenant apprenant = new Apprenant();
    public  void main(String[] args) {
        int choix;
        System.out.println("menu principal");
        System.out.println("1-Gestion des Apprenants");
        System.out.println("2-Gestion des Formateurs");
        System.out.println("3-Gestion des Classes");
       System.out.println("4. Quitter");
       System.out.println("entrer votre choix:");
       choix= sc.nextInt();
        switch (choix){
            case 1:
                apprenant.gestiondesapprenant();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;

        }
    }




}