import java.util.ArrayList;
import java.util.Scanner;
public class Apprenant extends Personne {
    private int numerotelephone;
    private String Class;
    private ArrayList<Apprenant>apprenants=new ArrayList<>();
    public Scanner scanner =new Scanner(System.in);

    public Apprenant(){}

    public Apprenant(int id, String nom, String prenom,String email,String Class) {
        super(id,nom,prenom,email);
        this.Class=Class;
        this.numerotelephone=numerotelephone;
    }
    public ArrayList<Apprenant> getApprenants() {
        return apprenants;
    }
    public void setApprenants(ArrayList<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }
    public Scanner getScanner() {
        return scanner;
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getNumerotelephone() {
        return numerotelephone;
    }
    public void setNumerotelephone(int numerotelephone) {
        this.numerotelephone = numerotelephone;
    }
    public void afficherInfos(){
    }
    public  void ajouterapprenant(){
        System.out.println("Id:");
        int id =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nom:");
        String nom=scanner.nextLine();
        System.out.println("prenom:");
        String prenom=scanner.nextLine();
        System.out.println("email:");
        String email=scanner.nextLine();
        System.out.println("class:");
        String Class= scanner.nextLine();


    }

    public  void gestiondesapprenant() {
        int choix;
        System.out.println("  menu apprenant ");
        System.out.println("1. Ajout d’un apprenant");
        System.out.println("2. Association d’un apprenant à une classe");
        System.out.println("3. Modification des informations d’un apprenant");
        System.out.println("4. Suppression d’un apprenant");
        System.out.println("5. Affichage des apprenants:");
        System.out.println("entrez votre choix:");

    }

}